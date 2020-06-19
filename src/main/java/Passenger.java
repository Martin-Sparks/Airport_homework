public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }


    public String getPassenger() {
        return this.name;
    }
}



//        Assumptions:
//
//        Each passenger bag weighs the same
//        Planes reserve half of their total weight for passenger bags
//        The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//        Passengers exist for a single flight only


//        Create a Flight class which has:
//
//        an empty list of booked Passenger's
//        a Plane
//        flight number (i.e. "FR756")
//        destination (i.e. GLA, EDI)
//        departure airport (i.e. GLA, EDI)
//        departure time (use a String)
//        The Flight class should have methods to:
//
//        return the number of available seats
//        book a passenger (if there are remaining seats)
