package britishwildlifeassociation;

/**
 *
 * @author hobbes
 */
public class ObservationCall {

    String timeStart, timeEnd, location, reason;

    /*
     Constructor Methods
     A default constructor (with no required input) is
     useful for a variety of reasons; notably, Netbeans uses
     them when binding code bundles
     */
    public ObservationCall() {
    }

    public ObservationCall(String timeStart, String timeEnd, String location, String reason) {
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
    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
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

    public String produceDescriptionString() {
        return " Start:" + timeStart + " End:" + timeEnd + " Location:" + location + " Reason:" + reason;
    }
}
