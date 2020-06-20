import java.util.ArrayList;

public class Flight {

        private ArrayList<Passenger> passengers;
        private Plane plane;
        private String flightNumber;
        private String destination;
        private String departureAirport;
        private String departureTime;

        public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
            this.plane = plane;
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureAirport = departureAirport;
            this.departureTime = departureTime;
            this.passengers = new ArrayList<Passenger>();
        }


    public String planeName() {
            return this.plane.getName();
    }


    public int getFreeSeats() {
            return getCapacityOfPlane() - passengers.size();
    }

    public int getCapacityOfPlane(){
            return this.plane.getCapacity();
    }


    public boolean addPassenger(Passenger passenger) {
            if (getCapacityOfPlane() == passengers.size())
                return false;
            else
                this.passengers.add(passenger);
                return true;

    }

    public int emptySeatCount() {
            return getCapacityOfPlane() - passengers.size();
    }

    public int countPassengers(){
            return this.passengers.size();
    }
}

