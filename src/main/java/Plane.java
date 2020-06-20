public class Plane {

    private PlaneType plane;
    private String name;

    public Plane(PlaneType plane, String name){
        this.plane = plane;
        this.name = name;
    }

    public PlaneType getPlane(){
        return this.plane;
    }

    public int getCapacity(){
        return this.plane.getCapacity();
    }

    public int getTotalWeight(){
        return this.plane.getTotalWeight();
    }

    public String getName(){
        return this.name;
    }

//    public Plane canAddPlane() {
//        return this.PlaneType.;
//    }
}
