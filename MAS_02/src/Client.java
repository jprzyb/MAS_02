import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<Auction> auctions;
    private int telNr;
    private String firstName;
    private String lastName;

    public Client(int telNr, String firstName, String lastName) {
        this.telNr = telNr;
        this.firstName = firstName;
        this.lastName = lastName;
        auctions = new ArrayList<>();
    }
    public void addAuction(Auction a){
        auctions.add(a);
    }
    public void removeAuction(Auction a){
        auctions.remove(a);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append("Client ").append(firstName).append(" ").append(lastName).append(" is interested in auctions:\n`");
        for(Auction a : auctions){
            res.append(" - ").append(a).append("\n");
        }
        return res.toString();
    }
}
