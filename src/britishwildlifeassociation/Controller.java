package britishwildlifeassociation;

import java.util.ArrayList;

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
        int y = Integer.parseInt(newThreatLevel);
        animals.add(new Animal(newName, y));
    }

    static void editAnimal(Animal editedAnimal, String newName, String newThreatLevel) {
        int x = Integer.parseInt(newThreatLevel);
        animals.remove(editedAnimal);
        animals.add(new Animal(newName, x));
    }

    static void deleteAnimal(Animal editedAnimal) {
        animals.remove(editedAnimal);
    }

    //Functions for controlling ObservationCall objects
    static void createObservationCall(String newAnimalName, String newLocation, String start, String end, String newDescription) {
        for (Animal animal : animals) {
            if (animal.getName().equals(newAnimalName)) {
                animal.callsHistory.add(new ObservationCall(start, end, newLocation, newDescription));
            }
            break;
        }
    }

    //Functions for controlling Observation objects
    static void createObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        Observer obs;
        obs = determineObserver(newObserverName, newProfessional);

        for (Animal animal : animals) {
            if (animal.getName().equals(newAnimalName)) {
                animal.annualObservations.add(new Observation(animal, obs, newDate, newLocation, newDescription, newConfidence, newProfessional));
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
        ArrayList<Observer> observers = new ArrayList<>();
        observers.addAll(volunteers);
        observers.addAll(professionals);
        observers.remove(o);
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
}
