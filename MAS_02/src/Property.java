import java.util.ArrayList;
import java.util.List;

public class Property{
    private final double price;
    private List<Owner> owners;
    private Apartment apartment;
    int id;

    public Property(int id, double price, Apartment apartment, Owner... ownersCol) {
        owners = new ArrayList<>();
        this.id = id;
        this.price = price;
        this.apartment = apartment;
        for(Owner o : ownersCol){
            owners.add(o);
            o.addProperty(this);
        }
        apartment.setProperty(this);
    }

    @Override
    public String toString(){
        String ownersString = "";
        for (Owner o : owners){
            ownersString += "\n"+o.ownerAsString();
        }
        return "Property:\nid: "+id+" |  worth "+price +", owners: "+ownersString;
    }

    public String propertyToString(){
        return "id: "+id+" is worth "+price;
    }
    public int getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
}
