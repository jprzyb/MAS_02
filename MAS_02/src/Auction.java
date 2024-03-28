import java.util.Date;

public class Auction {
    private Date date;
    private int id;
    private Property property;
    private double actualPrice;
    public Auction(Property property, Date date, double actualPrice, int id) {
        this.date = date;
        this.id = id;
        this.property = property;
        this.actualPrice = actualPrice;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        res.append("Property " + property + " is on sale for "+actualPrice+" at "+date+".");
        return res.toString();
    }

    public int getId() {
        return id;
    }

    public Property getProperty() {
        return property;
    }

    public Worker getWorker(){
        return Worker.getWorkers(id);
    }
}
