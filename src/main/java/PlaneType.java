public enum PlaneType {

    CESSNA162(4, 100);



    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}

// an enum PlaneType (e.g. BOEING747) which stores capacity and total weight
// Create a Flight class which has:
