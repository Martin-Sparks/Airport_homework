import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Martin", 1);
    }

    @Test
    public void canGetPassengers(){
        assertEquals("Martin", passenger.getPassenger());
    }


}
