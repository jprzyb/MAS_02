import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inicjacja
        Property property1 = new Property(1,1000000 );
        Property property2 = new Property(2, 2000000 );
        Property property3 = new Property(3, 1500000 );
        Property property4 = new Property(4, 900000 );
        Apartment apartment1 = new Apartment(new Adress("03-813","Warsaw","Terespolska",3,393), property1);
        Apartment apartment2 = new Apartment(new Adress("03-813","Warsaw","Terespolska",3,394), property2);
        Apartment apartment3 = new Apartment(new Adress("03-813","Warsaw","Terespolska",3,395), property3);
        Apartment apartment4 = new Apartment(new Adress("01-111","Warsaw","Zlota",41,10), property4);
        List<Apartment> apartmentsTere = new ArrayList<>();
        apartmentsTere.add(apartment1);
        apartmentsTere.add(apartment2);
        apartmentsTere.add(apartment3);
        Building building1 = new Building(new Adress("03-813","Warsaw","Terespolska",3),apartmentsTere);
        Building building2 = new Building(new Adress("01-111","Warsaw","Zlota",41),apartment4);
        Client client1 = new Client(111111111, "Worek", "Pieniedzy");
        Client client2 = new Client(222222222, "Worek", "Kasy");
        Auction auction1 = new Auction(property1, new Date(), property1.getPrice(), 1);
        Auction auction2 = new Auction(property2, new Date(), property2.getPrice(),2);
        Auction auction3 = new Auction(property3, new Date(), property3.getPrice(),3);

        // Association: Client - Auction (can exist without each other but can be asociated)
        System.out.println("\n=============== Asocjacja ===============");
        client1.addAuction(auction1);
        client1.addAuction(auction2);

        System.out.println(client1);
        System.out.println(client2);

        System.out.println(auction1);
        System.out.println(auction2);
        System.out.println(auction3);

        // Association with attribute: Owner 1-(Property)-* Apartment (1-*)
        System.out.println("\n=============== Asocjacja z atrybutem ===============");
        Owner owner = new Owner(123123123,"Jacek","Placek");
        owner.addProperty(property1);
        owner.addProperty(property2);
        owner.addProperty(property3);
        owner.showProperties();

        // Qualified association:
        System.out.println("\n=============== Asocjacja kwalifikowana ===============");
        Worker worker1 = new Worker("Oddany", "Pracownik");
        worker1.addAuction(auction1);
        worker1.addAuction(auction2);

        System.out.println(worker1);
        // Composition: Building 1-* Apartments
        System.out.println("\n=============== Kompozycja ===============");
        System.out.println("Buildings:");
        System.out.println(building1);
        System.out.println(building2);
    }
}