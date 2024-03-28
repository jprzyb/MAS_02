import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Worker {
    private String firstName;
    private String lastName;
    private static List<Worker> workers = new ArrayList<>();

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

    public static Worker getWorkers(int id){
        for(Worker w : workers){
            if(w.auctions.containsKey(id)) return w;
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder("");
        res.append("Worker "+firstName+" "+lastName+" are take care of auctions:\n");
        auctions.forEach((key, value) -> {
            res.append("\t- ").append(value).append("\n");
        });

        return res.toString();
    }
}
