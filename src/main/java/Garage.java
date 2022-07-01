import java.util.ArrayList;
import java.util.List;
// import java.util.Map;
// import java.util.HashMap;


public class Garage {

    private List<Car> garage = new ArrayList<Car>();

    public void addCar(Car carToAdd) {
        garage.add(carToAdd);
        System.out.println(carToAdd.getCarName() + " has been added to the garage.");
    }

    public void removeCar(Car carToRemove) {
        garage.remove(carToRemove);
        System.out.println(carToRemove.getCarName() + " has been removed from the garage.");
    }

    public void setCarInGarage(int indexLocation, Car carToSet) {
        garage.set(indexLocation, carToSet);
        System.out.println(carToSet.getCarName() + " has been set at index locations " + indexLocation);
    }

    public void listCars() {
        for (Car car : garage) {
            System.out.println(car.getCarName() + "\n" + car.getCarColor() + "\n" + car.getNumberOfWheels());
        } 
    }

    // SET METHODS TO TEST ABILITY TO ALTER CARS FROM GARAGE

    // public Car getCarFromGarage(int indexLocation ) {
    //     garage.get(Car )
    // }



    // public void addOccupantToTable(String userInput) {
    //     tableOccupant = userInput;
    // }


    
}
