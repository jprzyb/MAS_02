import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private final Adress adress;
    private final Property property;
    private static final List<Apartment> apartments = new ArrayList<>();

    public Apartment(Adress adress, Property property) {
        this.property = property;
        this.adress = adress;
        apartments.add(this);
    }
    @Override
    public String toString() {
        return adress.toString();
    }

    public int getApartmentNumber(){
        return this.adress.getApartmentNumber();
    }
    public static Apartment getInstance(int id){
        if(!apartments.isEmpty()){
            for(Apartment a : apartments){
                if(a.property.getId() == id) return a;
            }
        }
        return null;
    }
}
