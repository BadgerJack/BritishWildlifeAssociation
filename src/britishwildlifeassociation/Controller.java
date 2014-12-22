package britishwildlifeassociation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hobbes
 *
 * The Model/View Controller acts as a relay between application class objects,
 * and the user interface. This reduces object cohesion and improves security by
 * preventing users from directly interfacing with internal classes.
 *
 */
public class Controller {

    static ArrayList<Animal> animals;
    static ArrayList<Volunteer> volunteers;
    static ArrayList<Professional> professionals;
    static ArrayList<Observation> observations;

    //Functions for controlling Animal objects
    static void createAnimal(String newName, String newThreatLevel) {
        animals.add(new Animal(newName, newThreatLevel));
    }

    static void editAnimal(Animal editedAnimal, String newName, String newThreatLevel) {
        animals.remove(editedAnimal);
        animals.add(new Animal(newName, newThreatLevel));
    }

    static void deleteAnimal(Animal editedAnimal) {
        animals.remove(editedAnimal);
    }

    //Functions for controlling ObservationCall objects
    static void createObservationCall(Animal newAnimalName, String newLocation, String start, String end, String newDescription) {
        for (Animal anim : animals) {
            if (anim.equals(newAnimalName)) {
                anim.getCallsHistory().add(new ObservationCall(start, end, newLocation, newDescription));
                break;
            }
        }
    }

    //Functions for controlling Observation objects
    static void createObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        Observer obs;
        obs = determineObserver(newObserverName, newProfessional);

        for (Animal animal : animals) {
            if (animal.getName().equals(newAnimalName)) {
                animal.annualObservations.add(new Observation(animal, obs, newDate, newLocation, newDescription, newConfidence, newProfessional));

                if (obs instanceof Professional) {
                    ((Professional) obs).setAnnObservations(((Professional) obs).getAnnObservations() + 1);
                }

                break;
            }
        }
    }

    static void editObservation(Observation obs, String animalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        Observer observ;
        observ = determineObserver(newObserverName, newProfessional);

        for (Animal animal : animals) {
            if (animal.getName().equals(animalName)) {
                animal.getAnnualObservations().remove(obs);
                animal.getAnnualObservations().add(new Observation(animal, observ, newDate, newLocation, newDescription, newConfidence, newProfessional));
            }
        }
    }

    static void deleteObservation(Observation obs, String animalName, String observerName, String observationDate) {
        for (Animal animal : animals) {
            if (animal.getName().equals(animalName)) {
                animal.getAnnualObservations().remove(obs);
                break;
            }
        }
    }

    //Functions for controlling Observer objects
    static void createObserver(String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        volunteers.add(new Volunteer(newForename, newSurname, newAddress, newPhone, newEmail));
    }

    static void editObserver(Observer obs, String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        Volunteer v = new Volunteer(newForename, newSurname, newPhone, newAddress, newEmail);
        if (obs instanceof Volunteer) {
            volunteers.remove(obs);
            volunteers.add(v);
        } else if (obs instanceof Professional) {
            for (Professional prof : professionals) {
                if (prof.equals(obs)) {
                    prof.setPrevStatus(v);
                }
            }
        }
    }

    static void deleteObserver(Observer o) {
        if (o instanceof Volunteer) {
            volunteers.remove(o);
        } else if (o instanceof Professional) {
            professionals.remove(o);
        }
    }

    static void makeProfObserver(Volunteer v, String newContractStart, String newContractEnd, String newSalary) {
        int z = Integer.parseInt(newSalary);
        professionals.add(new Professional(newContractStart, newContractEnd, z, v));
        volunteers.remove(v);
    }

    static void populate() {
        GUI.animList.clear();
        GUI.obsList.clear();
        GUI.volList.clear();
        GUI.profList.clear();

        for (int i = 0; i < animals.size(); ++i) {
            GUI.animList.addElement(animals.get(i).produceDescriptionString());
            if (animals.get(i).getAnnualObservations().isEmpty() == false) {
                for (Observation o : animals.get(i).getAnnualObservations()) {
                    GUI.obsList.addElement(o.produceDescriptionString());
                }
            }
        }
        for (int i = 0; i < professionals.size(); ++i) {
            GUI.profList.addElement(professionals.get(i).produceDescriptionString());
        }
        for (int i = 0; i < volunteers.size(); ++i) {
            GUI.volList.addElement(volunteers.get(i).produceDescriptionString());
        }
    }

    static Observer determineObserver(String obsName, boolean prof) {
        Observer o = null;
        if (prof == true) {
            for (Professional observer : professionals) {
                if ((observer.getPrevStatus().getFirstName() + " " + observer.getPrevStatus().getLastName()).equals(obsName)) {
                    o = observer;
                    break;
                }
            }
        } else if (prof == false) {
            for (Volunteer observer : volunteers) {
                if ((observer.getFirstName() + " " + observer.getLastName()).equals(obsName)) {
                    o = observer;
                    break;
                }
            }
        }
        return o;
    }

    static void checkDates() {
        ArrayList<Professional> tempProf = new ArrayList<>();       //prevents ConcurrentModificationException in function
        ArrayList<ObservationCall> tempCall = new ArrayList<>();
        ArrayList<Observation> tempObs = new ArrayList<>();
        Date date = new Date();

        try {
            //Replace old professionals as volunteers
            for (Professional prof : professionals) {

                if (date.after(getDate(prof.getContractEnd())) == true) {
                    volunteers.add(prof.getPrevStatus());
                    tempProf.add(prof);
                }

            }
            for (Professional p : tempProf) {
                professionals.remove(p);
            }

            //Remove old observation calls
            for (Animal a : animals) {
                for (ObservationCall call : a.getCallsHistory()) {
                    if (date.after(getDate(call.getTimeEnd())) == true) {
                        tempCall.add(call);
                    }
                }
                for (ObservationCall c : tempCall) {
                    a.getCallsHistory().remove(c);
                }
                tempCall.clear();
            }

            //Change volunteer to Passive
            for (Volunteer v : volunteers) {
                v.setCurrentStatus("Passive");
                for (Animal a : animals) {
                    for (Observation o : a.getAnnualObservations()) {
                        if (o.getObserver().equals(v)) {
                            v.setCurrentStatus("Active");
                        }
                    }
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static public Date getDate(String s) throws ParseException {
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        Date date = form.parse(s);
        return date;
    }
}
