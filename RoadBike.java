public class RoadBike extends Vehicle{
    private int numberOfGears;
    private String typeOfBrakes;

    public RoadBike(int numberOfPassengers, int numberOfGears, String typeOfBrakes, String color){
        super(numberOfPassengers, color);
        this.numberOfGears = numberOfGears;
        this.typeOfBrakes = typeOfBrakes;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getTypeOfBrakes() {
        return typeOfBrakes;
    }

    public String getType() {
        return "Road Bike";
    }
}