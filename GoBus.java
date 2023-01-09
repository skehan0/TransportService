import java.util.ArrayList;

public class GoBus extends BusVendor {
    private Server server;
    private static final String VENDOR_NAME = "GoBus";

    public GoBus(Server server) {
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