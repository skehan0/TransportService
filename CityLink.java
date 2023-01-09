import java.util.ArrayList;

public class CityLink extends BusVendor {

    private Server server;
    private static final String VENDOR_NAME = "CityLink";

    public CityLink(Server server) {
        this.server = server;
    }

    public ArrayList<Trip> getAllTrips() {
        return server.getAllTrips(VENDOR_NAME);
    }
    
    public String getVendorName() {
        return VENDOR_NAME;
    }

    public boolean bookTripServer(Booking booking) {
        return server.bookTrip(VENDOR_NAME, booking);
    }
}