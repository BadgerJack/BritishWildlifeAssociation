package britishwildlifeassociation;

import java.util.ArrayList;

/**
 *
 * @author hobbes
 */
public class Animal {

    String name, threatLevel;
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

    public Animal(String name, String threatLevel) {
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

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public ArrayList<Observation> getAnnualObservations() {
        return annualObservations;
    }

    public ArrayList<ObservationCall> getCallsHistory() {
        return callsHistory;
    }

    public String produceDescriptionString() {
        String threat = String.valueOf(threatLevel);
        String annual = String.valueOf(annualObservations.size());
        String history = String.valueOf(callsHistory.size());
        return name + ", Threat:" + threat + ", Observations:" + annual + ", Calls:" + history;
    }
}
