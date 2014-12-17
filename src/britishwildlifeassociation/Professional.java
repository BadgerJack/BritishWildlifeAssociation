package britishwildlifeassociation;

import java.util.Date;

/**
 *
 * @author hobbes
 */
public class Professional implements Observer {

    Date contractStart, contractEnd;
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

    public Professional(Date contractStart, Date contractEnd, int salary, int annObservations, Volunteer prevStatus) {
        this.contractStart = contractStart;
        this.contractEnd = contractEnd;
        this.salary = salary;
        this.annObservations = annObservations;
        this.prevStatus = prevStatus;
    }

    /*
     Getters and Setters
     Most of these will be set in the constructor,
     but Sets allows us to edit an instance later
     */
    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
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
