public class Vehicle {
private int numberOfPassangers;
private String color;

public Vehicle(int numberOfPassangers, String color){
this.numberOfPassangers = numberOfPassangers;
this.color = color;
}

public int getNumberOfPassangers(){
    return numberOfPassangers;
}
public String getColor(){
    return color;
}
public String getType() {
    return " Generic Vehicle";
}

public static void add(MountainBike mountainBike) {
}
}