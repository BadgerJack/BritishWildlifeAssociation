package britishwildlifeassociation;

import java.util.ArrayList;

/**
 *
 * @author hobbes
 */
public class Animal {

    String name;
    int threatLevel;
    ArrayList<Observation> annualObservations;
    ArrayList<ObservationCall> callsHistory;

    /*
    Constructor Methods
    A default constructor (with no required input) is
    useful for a variety of reasons; notably, Netbeans uses
    them when binding code bundles
     */
    public Animal() {
    }

    public Animal(String name, int threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;
        
        this.annualObservations = new ArrayList();
        this.callsHistory = new ArrayList();
    }

    /*
    Getters and Setters
    Most of these will be set in the constructor,
    but Sets allows us to edit an instance later
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public ArrayList<Observation> getAnnualObservations() {
        return annualObservations;
    }

    public ArrayList<ObservationCall> getCallsHistory() {
        return callsHistory;
    }

    /*
     Creates an observation object about the current animal
     Might otherwise have been declared in the Observer classes,
     but I prefer to keep things localised
     */
    public Observation makeObservation(Observer observer, Animal animal) {
        animal = this;
        return null;//new Observation(animal, observer, timestamp, location, description, confidence, professional);
    }

    /*
    Creates an observation alert regarding the current animal
    Created here rather than in the main class as the list of calls
    is stored locally for simple access
    */
    public ObservationCall issueCall(Animal animal) {
        animal = this;
        return null;
    }
}
