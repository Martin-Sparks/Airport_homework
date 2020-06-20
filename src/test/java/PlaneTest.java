import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane( PlaneType.CESSNA162,"CESS");
    }

//    @Test
//    public void canAddPlane(){
//        assertEquals(plane, plane.canAddPlane());
//    }

    @Test
    public void canGetPlane(){
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

    @Test
    public void getPlaneName(){
        assertEquals("CESS", plane.getName());
    }

}
