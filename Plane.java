public class Plane extends Vehicle{
    private int maximumAltitude;
    private int numberOfEngines;
    public Plane(int numberOfPassengers, int maximumAltitude, int numberOfEngines, String color) {
        super(numberOfPassengers, color);
        this.maximumAltitude = maximumAltitude;
        this.numberOfEngines = numberOfEngines;
    }
    public int getMaximumAltitude() {
        return maximumAltitude;
    }
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public String getType(){
        return "plane";
    }
}
