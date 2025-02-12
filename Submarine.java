public class Submarine extends Vehicle{
    private int maximumDepth;
    private int numberOfEngines;
    private String powerSource;

    public Submarine(int numberOfPassengers, int maximumDepth, int numberOfEngines, String powerSource, String color) {
        super(numberOfPassengers, color);
        this.maximumDepth = maximumDepth;
        this.numberOfEngines = numberOfEngines;
        this.powerSource = powerSource;
    }
    public int getMaximumDepth() {
        return maximumDepth;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getType() {
        return "Submarine";
    }

}
