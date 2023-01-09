public class Booking {
    private static int prevId = 10000;
    private int id;
    private Trip trip;
    private int bookedSeats;
    private String vendorName = "";

    public Booking(Trip trip, int seats, String vendorName) {
        this.trip = trip;
        bookedSeats = seats;
        this.vendorName = vendorName;
        id = prevId + 1;
        prevId = id;
    }
    
    public Trip getTrip() {
        return trip;
    }
   
    public String toString() { // booking successful toString method
        return  "Booking #" + id + "\n" +
                "Trip: " + vendorName + "#" + trip.getID() + "\n" +
                 trip.getStartingLocation() + "\t to \t" + trip.getDestination() + "\n" +
                 trip.getDateOfDeparture() + "\t\t" + trip.getDateOfArrival() + "\n" +
                "Booked seats: " + bookedSeats + "\n";
    }
}
