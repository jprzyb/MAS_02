import java.util.ArrayList;
import java.util.List;

public class Building {
    private final Adress adress;
    private final List<Apartment> apartments;

    public Building(Adress adress, List<Apartment> apartments) {
        this.adress = adress;
        this.apartments = new ArrayList<>();
        this.apartments.addAll(apartments);
    }
    public Building(Adress adress, Apartment apartment) {
        this.adress = adress;
        this.apartments = new ArrayList<>();
        this.apartments.add(apartment);
    }
    private String getAllApartmentsNumbers(){
        StringBuilder s = new StringBuilder();
        for(Apartment a : apartments){
            s.append(a.getApartmentNumber());
            s.append(", ");
        }
        s.delete(s.lastIndexOf(","),s.lastIndexOf(",")+2);
        return s.toString();
    }
    @Override
    public String toString() {
        return "Building at " + adress + ", have apartments with numbers: " + getAllApartmentsNumbers() + ".";
    }
}
