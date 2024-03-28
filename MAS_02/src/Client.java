import java.util.ArrayList;
import java.util.List;

public class Client {

    private final List<Auction> auctions;
    private final int telNr;
    private final String firstName;
    private final String lastName;

    public Client(int telNr, String firstName, String lastName) {
        this.telNr = telNr;
        this.firstName = firstName;
        this.lastName = lastName;
        auctions = new ArrayList<>();
    }
    public void addAuction(Auction a){
        auctions.add(a);
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Client ").append(firstName).append(" ").append(lastName).append(" is interested in auctions:\n");
        for(Auction a : auctions){
            res.append(" - ").append(a).append("\n");
        }
        return res.toString();
    }
}
