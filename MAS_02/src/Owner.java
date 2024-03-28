import java.util.ArrayList;
import java.util.List;

public class Owner {
    private List<Property> propertiesOwned;
    private int telNr;
    private String firstName;
    private String lastName;

    public Owner(int telNr, String firstName, String lastName) {
        this.telNr = telNr;
        this.firstName = firstName;
        this.lastName = lastName;
        propertiesOwned = new ArrayList<>();
    }
    public void addProperty(Property property){
        this.propertiesOwned.add(property);
    }
    public void removeProperty(Property property){
        this.propertiesOwned.remove(property);
    }
    public void removeProperty(Adress property){
        for(Property p : propertiesOwned){
            if (p.equals(property)) propertiesOwned.remove(p);
        }
    }

    public int getTelNr() {
        return telNr;
    }

    public void setTelNr(int telNr) {
        this.telNr = telNr;
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

    public void showProperties(){
        System.out.println("Owner "+firstName+" "+lastName+" has:");
        for(Property p : propertiesOwned){
            System.out.println(p);
        }
    }
}
