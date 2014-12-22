package britishwildlifeassociation;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author hobbes
 */
public class Volunteer implements Observer {

    String registrationDate, currentStatus;

    //These are the variables that should come from the Observer interface
    String firstName, lastName, address, phone, email;

    /*
     Constructor Methods
     A default constructor (with no required input) is
     useful for a variety of reasons; notably, Netbeans uses
     them when binding code bundles
     */
    public Volunteer() {
    }

    public Volunteer(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;

        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
        this.registrationDate = form.format(Calendar.getInstance().getTime());
        this.currentStatus = "Active";
    }

    /*
     Getters and Setters
     Most of these will be set in the constructor,
     but Sets allows us to edit an instance later
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String produceDescriptionString() {
        return firstName + " " + lastName + ", Address:" + address + ", Phone:" + phone + ", Email:"
                + email + ". Registered:" + registrationDate + ". Status:" + currentStatus;
    }

}
