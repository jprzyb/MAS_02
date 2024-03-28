import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Worker {
    private final String firstName;
    private final String lastName;
    private static final List<Worker> workers = new ArrayList<>();

    Map<Integer, Property> auctions;

    public Worker(String firstName, String lastName){
         this.firstName = firstName;
         this.lastName = lastName;
         auctions = new TreeMap<>();
         workers.add(this);
    }

    public void addAuction(Auction a){
        if(!auctions.containsKey(a.getId())){
            auctions.put(a.getId(), a.getProperty());
        }
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Worker ").append(firstName).append(" ").append(lastName).append(" are take care of auctions:\n");
        auctions.forEach((key, value) -> res.append("\t- ").append(value).append("\n"));

        return res.toString();
    }
}
