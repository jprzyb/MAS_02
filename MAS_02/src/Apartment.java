public class Apartment {
    private Adress adress;

    public Apartment(Adress adress) {
        this.adress = adress;
    }
    public Apartment(String postalCode, String city, String street, int buildingNumber, int apartmentNumber) {
        this.adress = new Adress(postalCode, city, street, buildingNumber, apartmentNumber);
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
}
