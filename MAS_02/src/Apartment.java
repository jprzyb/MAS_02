import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private Adress adress;
    private Property property;
    private static List<Apartment> apartments = new ArrayList<>();

    public Apartment(Adress adress, Property property) {
        this.property = property;
        this.adress = adress;
        apartments.add(this);
    }
    public Apartment(String postalCode, String city, String street, int buildingNumber, int apartmentNumber, Property property) {
        this.property = property;
        this.adress = new Adress(postalCode, city, street, buildingNumber, apartmentNumber);
        apartments.add(this);
    }

    public void setPostalCode(String postalcode){
        this.adress.setPostalCode(postalcode);
    }
    public void setCity(String city){
        this.adress.setCity(city);
    }

    @Override
    public String toString() {
        return adress.toString();
    }

    public void setStreet(String street){
        this.adress.setStreet(street);
    }
    public void setBuildingNumber(int buildingNumber){
        this.adress.setBuildingNumber(buildingNumber);
    }
    public void setApartmentNumber(int apartmentNumber){
        this.adress.setApartmentNumber(apartmentNumber);
    }

    public String getPostalCode(){
        return this.adress.getPostalCode();
    }
    public String getCity(){
        return this.adress.getCity();
    }
    public String getStreet(){
        return this.adress.getStreet();
    }
    public int getBuildingNumber(){
        return this.adress.getBuildingNumber();
    }
    public int getApartmentNumber(){
        return this.adress.getApartmentNumber();
    }
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public Adress getAdress(){
        return this.adress;
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
