package britishwildlifeassociation;

import java.util.Date;

/**
 *
 * @author hobbes
 */
public class ObservationCall {

    Long timeStart, timeEnd;
    String location, reason;

    /*
     Constructor Methods
     A default constructor (with no required input) is
     useful for a variety of reasons; notably, Netbeans uses
     them when binding code bundles
     */
    public ObservationCall() {
    }

    public ObservationCall(Long timeStart, Long timeEnd, String location, String reason) {
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
    public long getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(long timeStart) {
        this.timeStart = timeStart;
    }

    public long getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(long timeEnd) {
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
        String start = String.valueOf(timeStart);
        String end = String.valueOf(timeEnd);
        return " Start:"+start + " End:" + end + " Location:" + location + " Reason:" + reason;
    }
}