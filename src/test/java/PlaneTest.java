import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.CESSNA162);
    }

    @Test
    public void canGetplane(){
        assertEquals(PlaneType.CESSNA162, plane.getPlane());
    }

    @Test
    public void getCapacity(){
        assertEquals(4, plane.getCapacity());
    }

    @Test
    public void getWeight(){
        assertEquals(100, plane.getTotalWeight());
    }

}
