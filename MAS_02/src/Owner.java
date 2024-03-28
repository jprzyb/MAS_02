import java.util.ArrayList;
import java.util.List;

public class Owner {
    private final List<Property> propertiesOwned;
    private final int telNr;
    private final String firstName;
    private final String lastName;

    public Owner(int telNr, String firstName, String lastName) {
        this.telNr = telNr;
        this.firstName = firstName;
        this.lastName = lastName;
        propertiesOwned = new ArrayList<>();
    }
    public void addProperty(Property property){
        this.propertiesOwned.add(property);
    }
    public void showProperties(){
        System.out.println("Owner "+firstName+" "+lastName+" has:");
        for(Property p : propertiesOwned){
            System.out.println(p);
        }
    }
}
