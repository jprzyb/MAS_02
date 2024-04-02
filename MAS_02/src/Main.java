import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inicjacja
        Building building1 = new Building(new Adress("03-813","Warsaw","Terespolska",3));
        Building building2 = new Building(new Adress("01-111","Warsaw","Zlota",41));
        Apartment apartment1 = Apartment.createApartament(building1, new Adress("03-813","Warsaw","Terespolska",3,393));
        Apartment apartment2 = Apartment.createApartament(building1, new Adress("03-813","Warsaw","Terespolska",3,394));
        Apartment apartment3 = Apartment.createApartament(building2, new Adress("01-111","Warsaw","Zlota",41,1));
        Apartment apartment4 = Apartment.createApartament(building2, new Adress("01-111","Warsaw","Zlota",41,2));
        Owner owner = new Owner("Jacek","Placek");
        Property property1 = new Property(1,1000000,owner,apartment1);
        Property property2 = new Property(2, 2000000,owner,apartment2 );
        Property property3 = new Property(3, 1500000,owner,apartment3 );
        Property property4 = new Property(4, 900000, owner,apartment4);
        Client client1 = new Client("Worek", "Pieniedzy");
        Client client2 = new Client("Worek", "Kasy");
        Auction auction1 = new Auction(property1, new Date(), property1.getPrice(), 1);
        Auction auction2 = new Auction(property2, new Date(), property2.getPrice(),2);
        Auction auction3 = new Auction(property3, new Date(), property3.getPrice(),3);

        // Association: Client *-* Auction (can exist without each other but can be asociated)
        System.out.println("\n=============== Asocjacja ===============");
        client1.addAuction(auction1); // client is automaticaly added to auction clients
        System.out.println(client1);
        System.out.println(auction1);

        client2.addAuction(auction2); // auction is automaticaly added to client auctions
        client2.addAuction(auction3); // auction is automaticaly added to client auctions
        System.out.println(client2);
        System.out.println(auction2);
        System.out.println(auction3);

        // Association with attribute: Owner 1-(Property)-* Apartment (1-*)
        System.out.println("\n=============== Asocjacja z atrybutem ===============");
        owner.addProperty(property1);
        owner.addProperty(property2);
        owner.addProperty(property3);
        System.out.println(owner);
        System.out.println(property1);
        System.out.println(property2);
        System.out.println(property3);
        System.out.println(property4);

//        // Qualified association:
        System.out.println("\n=============== Asocjacja kwalifikowana ===============");
        Worker worker1 = new Worker("Oddany", "Pracownik");
        worker1.addAuction(auction1);
        worker1.addAuction(auction2);
        System.out.println(auction1.auctionWorkersToString());
        System.out.println(auction2.auctionWorkersToString());
        System.out.println(worker1);
        System.out.println("FindAuctionQualif(1):\n" + worker1.findAuctionQualif(1));
        System.out.println("FindAuctionQualif(2):\n" + worker1.findAuctionQualif(2));
//        System.out.println("FindAuctionQualif(100):\n" + worker1.findAuctionQualif(100));

//        // Composition: Building 1-* Apartments
        System.out.println("\n=============== Kompozycja ===============");
        System.out.println("Buildings:");
        System.out.println(building1);
        System.out.println(building2);
        System.out.println();
        apartment1.showApartmentBuilding();
        System.out.println();
        apartment2.showApartmentBuilding();
        System.out.println();
        apartment3.showApartmentBuilding();
        System.out.println();
        apartment4.showApartmentBuilding();
    }
}