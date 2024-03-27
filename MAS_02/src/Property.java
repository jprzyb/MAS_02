public class Property extends Apartment {
    private double price;
    private Owner owner;

    public Property(Adress adress, double price, Owner owner) {
        super(adress);
        this.price = price;
        this.owner = owner;
    }
    public Property(String postalCode, String city, String street, int buildingNumber, int apartmentNumber, double price, Owner owner) {
        super(new Adress(postalCode, city, street, buildingNumber, apartmentNumber));
        this.price = price;
        this.owner = owner;
    }
}
