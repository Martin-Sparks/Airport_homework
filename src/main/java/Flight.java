import java.util.ArrayList;

public class Flight {

        private ArrayList<Passenger> passengers;
        private String plane;
        private String flightNumber;
        private String destination;
        private String departureAirport;
        private String departureTime;

        public Flight(String plane, String flightNumber,String destination, String departureAirport, String departureTime){
            this.plane = plane;
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureAirport = departureAirport;
            this.departureTime = departureTime;
            this.passengers = new ArrayList<Passenger>();
        }



}

