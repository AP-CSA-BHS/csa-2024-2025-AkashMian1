public class Helicopter extends Vehicle {
    private int maximumAltitude;
    private int numberOfBlades;

    public Helicopter(int numberOfPassengers, int maximumAltitude, int numberOfBlades, String color) {
        super(numberOfPassengers, color);
        this.maximumAltitude = maximumAltitude;
        this.numberOfBlades = numberOfBlades;
    }

    public int getMaximumAltidude() {
        return maximumAltitude;
    }

    public int getNumberOfBlades() {
    return numberOfBlades;
    }
    public String getType() {
        return "Helicopter";
    }
}