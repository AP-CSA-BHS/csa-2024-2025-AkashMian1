public class Cars extends Vehicle {
    private int topSpeed;
    
    public Cars(int numberOfPassengers, int topSpeed, String color) {
        super(numberOfPassengers, color);
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed() {
    return topSpeed;
    }
    
    public String getType() {
    return "Car";
    }
}
