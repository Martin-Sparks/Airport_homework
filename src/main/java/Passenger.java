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


//        book a passenger (if there are remaining seats)
