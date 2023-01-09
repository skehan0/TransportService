import java.util.ArrayList;

public abstract class BusVendor {
    // abstract methods
    public abstract ArrayList<Trip> getAllTrips();
    public abstract boolean bookTripServer(Booking booking);
    public abstract String getVendorName();

    public ArrayList<Trip> getAllAvailableTrips() { 
        ArrayList<Trip> allTrips = getAllTrips();
        ArrayList<Trip> allAvailableTrips = new ArrayList<>();

        for (Trip trip : allTrips) {
            if (trip.getAvailableSeats() > 0) { // available trips = trips with more than 0 seats available
                allAvailableTrips.add(trip); 
            }
        }
        return allAvailableTrips;
    }
     
    private void printTrips(ArrayList<Trip> trips) { 
        if (getVendorName() != null) {
            System.out.println(getVendorName() + "\n");
        }

        for (Trip trip : trips) {
            System.out.println(trip);
        }
    }
    // print methods
    public void printAllTrips() { 
        ArrayList<Trip> allTrips = getAllTrips();
        printTrips(allTrips);
    }

    public void printAllAvailableTrips() { 
        ArrayList<Trip> allAvailableTrips = getAllAvailableTrips(); 
        printTrips(allAvailableTrips);
    }
    // trip id method
    public Trip getTrip(int id) {
        ArrayList<Trip> allTrips = getAllTrips();

        for (Trip trip : allTrips) {
            if(trip.getID() == id) {
                return trip;
            }
        }
        return null;
    }
    // booking method checks all cases are valid before determining whether successful or unsuccessful
    public Booking bookTrip(Trip trip, int seats) {
        Booking booking = new Booking(trip, seats, getVendorName());
        if (trip.bookSeats(seats) && bookTripServer(booking)) {
            System.out.println("Your booking was successful!");
            return booking;
        }
        System.out.println("Your booking was unsuccessful!\n" + "\n" +
        "===============================================");
        return null;
    }

    public Booking bookTrip(int tripId, int seats) {
        Trip trip = getTrip(tripId);
        return bookTrip(trip, seats);
    }
}