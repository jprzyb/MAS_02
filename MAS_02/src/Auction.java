import java.util.Date;

public class Auction {
    private final Date date;
    private final int id;
    private final Property property;
    private final double actualPrice;
    public Auction(Property property, Date date, double actualPrice, int id) {
        this.date = date;
        this.id = id;
        this.property = property;
        this.actualPrice = actualPrice;
    }

    @Override
    public String toString() {
        return "Property " + property + " is on sale for " + actualPrice + " at " + date + ".";
    }

    public int getId() {
        return id;
    }

    public Property getProperty() {
        return property;
    }
}
