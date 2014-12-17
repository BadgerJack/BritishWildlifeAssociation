package britishwildlifeassociation;

import java.util.Date;

/**
 *
 * @author hobbes
 */
public class ObservationCall {

    Date timeStart, timeEnd;
    String location, reason;
    Animal animal;

    /*
    Constructor Methods
    A default constructor (with no required input) is
    useful for a variety of reasons; notably, Netbeans uses
    them when binding code bundles
     */
    public ObservationCall() {
    }

    public ObservationCall(Animal animal, Date timeStart, Date timeEnd, String location, String reason) {
        this.animal = animal;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.location = location;
        this.reason = reason;
    }

    /*
    Getters and Setters
    Most of these will be set in the constructor,
    but Sets allows us to edit an instance later
     */
    public Date getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }
    public Date getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
}
