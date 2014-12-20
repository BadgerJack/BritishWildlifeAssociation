package britishwildlifeassociation;

/**
 *
 * @author hobbes
 *
 * The Model/View Controller acts as a relay between application class objects,
 * and the user interface. This reduces object cohesion and improves security by
 * preventing users from directly interfacing with internal classes.
 *
 */
public class ModelViewController {

    //Functions for controlling Animal objects
    static void createAnimal(String newName, String newThreatLevel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void editAnimal(String newName, String newThreatLevel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteAnimal(String animalName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Functions for controlling ObservationCall objects
    static void createObservationCall(String newAnimalName, String newLocation, String start, String end, String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Functions for controlling Observation objects
    static void createObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void editObservation(String newAnimalName, String newObserverName, String newDate, String newLocation, String newConfidence, boolean newProfessional, String newDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteObservation(String animalName, String observerName, String observationDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Functions for controlling Observer objects
    static void createObserver(String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void editObserver(String newForename, String newSurname, String newEmail, String newPhone, String newAddress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void deleteObserver(String forename, String surname, String newEmail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void makeProfObserver(String newContractStart, String newContractEnd, String newSalary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
