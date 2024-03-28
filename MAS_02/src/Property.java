import java.util.Objects;

public class Property{
    private final double price;
    int id;

    public Property(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString(){
        return "id: "+id+" | "+ Objects.requireNonNull(Apartment.getInstance(id)) +" worth "+price;
    }

    public int getId(){
        return this.id;
    }
    public double getPrice(){
        return this.price;
    }
}
