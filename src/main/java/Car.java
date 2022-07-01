public class Car {

    private String carName;
    private String carColor;
    private int numberOfWheels;
    private int topSpeed;
    // private int carId;

    //Constructor
    public Car(String carName, String carColor, int numberOfWheels, int topSpeed) {
        this.carName = carName;
        this.carColor = carColor;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
    
}
