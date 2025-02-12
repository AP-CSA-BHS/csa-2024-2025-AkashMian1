public class MountainBike extends Vehicle {
    private int numberOfGears;
    private String typeOfShocks;
    private String typeOfBrakes;

    public MountainBike(int numberOfPassangers, int numberOfGears, String typeOfShocks, String typeOfBrakes, String color) {
        super(numberOfPassangers, color);
        this.numberOfGears = numberOfGears;
        this.typeOfShocks = typeOfShocks;
        this.typeOfBrakes = typeOfBrakes;
    }

    public int getNumberOfGears(){
        return numberOfGears;
    }

    public String getTypeOfShocks(){
        return typeOfShocks;
    }

    public String getTypeOfBrakes(){
        return typeOfBrakes;
    }
  
    public String getType() {
    return "Mountain Bike";
    }
}