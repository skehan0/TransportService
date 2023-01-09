import java.util.ArrayList;

// server stores the bus routes
// we create our array lists here for trips and bookings
public class Server {
    // Initialise array list Trip for each company
    private ArrayList<Trip> goBusTrips = new ArrayList<>();
    private ArrayList<Trip> cityLinkTrips = new ArrayList<>();
    private ArrayList<Trip> busEireannTrips = new ArrayList<>();

    // Initialise array list Booking for each company
    private ArrayList<Booking> goBusBookings = new ArrayList<>();
    private ArrayList<Booking> cityLinkBookings = new ArrayList<>();
    private ArrayList<Booking> busEireannBookings = new ArrayList<>();

    public Server() {
        busEireannTrips.add(new Trip( // add new trips 
                "Laois",
                "Galway",
                "15/11/2022",
                "09:00",
                "01/12/2022",
                "12:02",
                6.25,
                20
        ));

        busEireannTrips.add(new Trip(
                "Galway",
                "Laois",
                "23/11/2022",
                "07:30",
                "23/11/2022",
                "09:47",
                12.05,
                5
        ));
        
        
        goBusTrips.add(new Trip(
                "Dublin",
                "Belfast",
                "21/11/2022",
                "15:30",
                "21/11/2022",
                "17:50",
                20.99,
                12
        ));

        goBusTrips.add(new Trip(
                "Dublin",
                "Laois",
                "01/01/2023",
                "16:30",
                "01/01/2023",
                "17:15",
                10.55,
                35
        ));
        

        cityLinkTrips.add(new Trip(
                "Galway",
                "Dublin",
                "28/11/2022",
                "11:20",
                "28/11/2022",
                "14:13",
                19.99,
                36
        ));

        cityLinkTrips.add(new Trip(
                "Cork",
                "Limerick",
                "01/12/2022",
                "18:05",
                "01/12/2022",
                "20:09",
                18.50,
                10
        ));
    }

    public ArrayList<Trip> getAllTrips(String vendor) { // return getAllTrips array list for stated company
        if (vendor.equalsIgnoreCase("gobus")) { // The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
            return goBusTrips;
        }
        else if (vendor.equalsIgnoreCase("citylink")) {
            return cityLinkTrips;
        }
        else if (vendor.equalsIgnoreCase("buseireann")) {
            return busEireannTrips;
        }
        else {
            throw new RuntimeException("Undefined vendor: " + vendor);
        }
    }

    public boolean bookTrip(String vendor, Booking booking) { // // return the booking information for stated company
        if (vendor.equalsIgnoreCase("gobus")) {
            return goBusBookings.add(booking);
        }
        else if (vendor.equalsIgnoreCase("citylink")) {
            return cityLinkBookings.add(booking);
        }
        else if (vendor.equalsIgnoreCase("buseireann")) {
            return busEireannBookings.add(booking);
        }
        else {
            throw new RuntimeException("Undefined vendor: " + vendor);
        }
    }
}
