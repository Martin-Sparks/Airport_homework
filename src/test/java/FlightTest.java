import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight1;
    private Plane plane1;
    private Passenger passenger1;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Martin", 1);
        plane1 = new Plane(PlaneType.CESSNA162,"CESS");
        flight1 = new Flight(plane1, "1","EDI", "NYC","13:00");
    }

    @Test
    public void hasPlaneName(){
        assertEquals("CESS", flight1.planeName());
        }
    }

//Passenger plane flight is the order
