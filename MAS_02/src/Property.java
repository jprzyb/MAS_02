import java.util.Objects;

public class Property{
    private final double price;
    private Owner owner;
    private Apartment apartment;
    int id;

    public Property(int id, double price, Owner owner, Apartment apartment) {
        this.id = id;
        this.price = price;
        this.owner = owner;
        this.apartment = apartment;
        owner.addProperty(this);
        apartment.setProperty(this);
    }

    @Override
    public String toString(){
        return "Property:\nid: "+id+" |  worth "+price +", owner: "+owner.ownerAsString();
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
