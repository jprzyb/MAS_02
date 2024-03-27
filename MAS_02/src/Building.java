import java.util.List;

public class Building {
    private Adress adress;
    private List<Apartment> apartments;

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
}
