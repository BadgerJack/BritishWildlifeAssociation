package britishwildlifeassociation;

/**
 *
 * @author hobbes
 */
public class Observation {

    Animal animal;
    Observer observer;
    String timestamp, location, description, confidence;
    boolean professional;

    /*
     Constructor Methods
     A default constructor (with no required input) is
     useful for a variety of reasons; notably, Netbeans uses
     them when binding code bundles
     */
    public Observation() {
    }

    public Observation(Animal animal, Observer observer, String timestamp, String location, String description, String confidence, boolean professional) {
        this.animal = animal;
        this.observer = observer;
        this.timestamp = timestamp;
        this.location = location;
        this.description = description;
        this.confidence = confidence;
        this.professional = professional;
    }

    /*
     Getters and Setters
     Most of these will be set in the constructor,
     but Sets allows us to edit an instance later
     */
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    public String produceDescriptionString() {
        String obs;
        if (professional == true) {
            obs = ((Professional) observer).getPrevStatus().getFirstName() + " " + ((Professional) observer).getPrevStatus().getLastName();
        } else {
            obs = ((Volunteer) observer).getFirstName() + " " + ((Volunteer) observer).getLastName();
        }
        //timestamp
        return "Animal:" + animal.getName() + ", Observer:" + obs + ". Date:" + timestamp + ", Location:" + location + ", " + confidence + " Description:" + description;
    }

}
