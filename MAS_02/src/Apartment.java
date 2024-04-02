import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private final Adress adress;
    private Property property;
    private Building building;
    private static final List<Apartment> apartments = new ArrayList<>();

    private Apartment(Adress adress, Building building) {
        this.adress = adress;
        this.building = building;
        apartments.add(this);
        building.addApartment(this);
    }
    public static Apartment createApartament(Building building, Adress adress){
        if(building == null){
            try {
                throw new Exception("Building for this apartament doesn't exist!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            return new Apartment(adress, building);
        }
    }
    @Override
    public String toString() {
        return adress.toString();
    }

    public int getApartmentNumber(){
        return this.adress.getApartmentNumber();
    }
    public void showApartmentBuilding(){
        System.out.println("This apartment:\n"+this.toString()+"\n belongs to building:\n"+building.toString());
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
