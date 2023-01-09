public class Bus_Ireland {
    
    public static void main(String[] args) {
        Server server = new Server();
        
        BusVendor busEireann = new BusEireann(server);
        BusVendor goBus = new GoBus(server);
        BusVendor cityLink = new CityLink(server);
        

        // Print all the trips from each bus company stored in the server
        busEireann.printAllTrips();
        goBus.printAllTrips();
        cityLink.printAllTrips();
        

        // Create a trip by calling the route and book all the seats
        Trip t1 = busEireann.getTrip(101);
        Booking bk1 = busEireann.bookTrip(t1, 5);

        // Print the booking and the updated trip to show the decremented seats function works
        System.out.println(bk1);
        System.out.println(t1);

        // route 101 won't print now as there are no seats left
        busEireann.printAllAvailableTrips();

        // test to book more seats than are available
        Booking bk2 = goBus.bookTrip(102, 100);
        bk2 = goBus.bookTrip(102, 12);
        System.out.println(bk2);

        // booking for cityLink
        Booking bk3 = cityLink.bookTrip(105, 10);
        System.out.println(bk3);

        // Display updated trips after the two new bookings above
        busEireann.printAllTrips();
        cityLink.printAllTrips();
    }
}
