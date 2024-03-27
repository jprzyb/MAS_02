import java.util.List;

public class Adress {
    private String postalCode;
    private String city;
    private String street;
    private int buildingNumber;
    private List<Apartment> apartments;
    private int apartmentNumber;

    public Adress(String postalCode, String city, String street, int buildingNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public Adress(String postalCode, String city, String street, int buildingNumber, int apartmentNumber) {
        this.postalCode = postalCode;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber=apartmentNumber;
    }
}
