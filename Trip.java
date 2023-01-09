public class Trip {
    private static int prevId = 99;
    int id;
    private int availableSeats;
    String startingLocation, destination,
    dateOfDeparture, timeOfDeparture,
    dateOfArrival, timeOfArrival;
    private double fare;

    public Trip(String startingLocation, String destination, String dateOfDeparture, String timeOfDeparture,  
    String dateOfArrival, String timeOfArrival, double fare, int availableSeats) {
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.availableSeats = availableSeats;
        this.fare = fare;

        id = prevId + 1;
        prevId = id;

        }

    public boolean bookSeats(int seats) { // seats decrementing method
        // Check if there are enough seats, if so update the seats number
        if (availableSeats >= seats) {
            availableSeats -= seats; // decrement
            return true;
        }
        // else print a message
        System.out.println("There are not enough available seats " +
                "(" + availableSeats + ") for your booking!");
        return false;
    }
    // getter methods
    public int getID() { // trip ID
        return id;
    }
    
    public String getStartingLocation() {
        return startingLocation;
    }
    public String getDestination() {
        return destination;
    }
    
    public String getDateOfDeparture(){
        return dateOfDeparture;
    }
    public String getTimeOfDeparture(){
        return timeOfDeparture;
    }
    
    public String getDateOfArrival(){
        return dateOfArrival;
    }
    public String getTimeOfArrival(){
        return timeOfArrival;
    }
    
    public double getFare() {
        return fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public String toString() { // toString method
        return  "ID: " + id + "\n" +
                "Origin: " + startingLocation + "\n" +
                "Destination: " + destination + "\n" +
                "Departure Date: " + dateOfDeparture + "\n" +
                "Departure Time: " + timeOfDeparture + "\n" +
                "Arrival Date: " + dateOfArrival + "\n" +
                "Arrival Time: " + timeOfArrival + "\n" +
                "Fare: " + fare + "\n" +
                "Currently available seats: " + availableSeats + "\n";
    }
}