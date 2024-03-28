import java.util.ArrayList;
import java.util.List;

public class Building {
    private Adress adress;
    private List<Apartment> apartments;

    public Building(Adress adress, List<Apartment> apartments) {
        this.adress = adress;
        this.apartments = new ArrayList<>();
        this.apartments.addAll(apartments);
    }
    public Building(Adress adress, Apartment apartment) {
        this.adress = adress;
        this.apartments = new ArrayList<>();
        this.apartments.add(apartment);
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }
    public void setPostalCode(String postalcode){
        this.adress.setPostalCode(postalcode);
    }
    public void setCity(String city){
        this.adress.setCity(city);
    }
    public void setStreet(String street){
        this.adress.setStreet(street);
    }
    public void setBuildingNumber(int buildingNumber){
        this.adress.setBuildingNumber(buildingNumber);
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
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    private String getAllApartmentsNumbers(){
        StringBuilder s = new StringBuilder();
        for(Apartment a : apartments){
            s.append(a.getApartmentNumber());
            s.append(", ");
        }
        s.delete(s.lastIndexOf(","),s.lastIndexOf(",")+2);
        return s.toString();
    }
    @Override
    public String toString() {
        return "Building at " + adress + ", have apartments with numbers: " + getAllApartmentsNumbers() + ".";
    }
}
