package britishwildlifeassociation;

/**
 *
 * @author hobbes
 */
public class Professional implements Observer {

    Long contractStart, contractEnd;
    int salary, annObservations;
    Volunteer prevStatus;

    /*
     Constructor Methods
     A default constructor (with no required input) is
     useful for a variety of reasons; notably, Netbeans uses
     them when binding code bundles
     */
    public Professional() {
    }
//keep as Date or set long?

    public Professional(Long contractStart, Long contractEnd, int salary, Volunteer prevStatus) {
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
        this.salary = salary;
        this.annObservations = 0;
        this.prevStatus = prevStatus;
    }

    /*
     Getters and Setters
     Most of these will be set in the constructor,
     but Sets allows us to edit an instance later
     */
    public Long getContractStart() {
        return contractStart;
    }

    public void setContractStart(Long contractStart) {
        this.contractStart = contractStart;
    }

    public Long getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Long contractEnd) {
        this.contractEnd = contractEnd;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnObservations() {
        return annObservations;
    }

    public void setAnnObservations(int annObservations) {
        this.annObservations = annObservations;
    }

    public Volunteer getPrevStatus() {
        return prevStatus;
    }

    public void setPrevStatus(Volunteer prevStatus) {
        this.prevStatus = prevStatus;
    }

}
