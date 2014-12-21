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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteAnimal(String animalName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Functions for controlling ObservationCall objects
    static void createObservationCall(String newAnimalName, String newLocation, String start, String end, String newDescription) {
        long x = Long.parseLong(start);
        long y = Long.parseLong(end);
        for (Animal animal : animals) {
            if (animal.getName().equals(newAnimalName)) {
                animal.callsHistory.add(new ObservationCall(x, y, newLocation, newDescription));
            }
            break;
        }
    }

    //Functions for controlling Observation objects
    static void createObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        Observer obs = null;
        int con = Integer.parseInt(newConfidence);
        long da = Long.parseLong(newDate);
        //Determine observer. Could become own function if used often.
        if (newProfessional == true) {
            for (Professional observer : professionals) {
                if ((observer.getPrevStatus().getFirstName() + " " + observer.getPrevStatus().getLastName()).equals(newObserverName)) {
                    obs = observer;
                    break;
                }
            }
        } else if (newProfessional == false) {
            for (Volunteer observer : volunteers) {
                if ((observer.getFirstName() + " " + observer.getLastName()).equals(newObserverName)) {
                    obs = observer;
                    break;
                }
            }
        }

        for (Animal animal : animals) {
            if (animal.getName().equals(newAnimalName)) {
                animal.annualObservations.add(new Observation(animal, obs, da, newLocation, newDescription, con, newProfessional));
                break;
            }
        }
    }

    static void editObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteObservation(String animalName, String observerName, String observationDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Functions for controlling Observer objects
    static void createObserver(String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        volunteers.add(new Volunteer(newForename, newSurname, newAddress, newPhone, newEmail));
    }

    static void editObserver(String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteObserver(String forename, String surname, String newEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void makeProfObserver(Volunteer v, String newContractStart, String newContractEnd, String newSalary) {
        long x = Long.parseLong(newContractStart);
        long y = Long.parseLong(newContractEnd);
        int z = Integer.parseInt(newSalary);
        professionals.add(new Professional(x, y, z, v));
    }

    static void populate() {
        for (int i = 0; i < animals.size(); ++i) {
            GUI.animList.addElement(animals.get(i).getName());
        }
        for (int i = 0; i < professionals.size(); ++i) {
            GUI.profList.addElement(professionals.get(i).getPrevStatus().getFirstName() + " "
                    + professionals.get(i).getPrevStatus().getLastName() + " "
                    + professionals.get(i).getPrevStatus().getAddress()
            );
        }
        for (int i = 0; i < volunteers.size(); ++i) {
            GUI.volList.addElement(volunteers.get(i).getFirstName() + " "
                    + volunteers.get(i).getLastName() + " "
                    + volunteers.get(i).getAddress());
        }
        for (int i = 0; i < observations.size(); ++i) {
            GUI.obsList.addElement(observations.get(i).getAnimal().getName() + " "
                    + observations.get(i).getAnimal().getThreatLevel());
        }

    }

    static void populate(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
