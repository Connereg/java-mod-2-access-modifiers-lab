import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Garage garage = new Garage();

        Car car1 = new Car("Charger", "Red", 4, 220);
        Car car2 = new Car("Pinto", "Blue", 4, 120);
        Car car3 = new Car("SAAB", "Black", 4, 180);
        Car car4 = new Car("Angel's Car", "Blue", 4, 100);
        while (true) {
            System.out.println("Would you like to add a car to the garage? \n 1. Add Car \n 2. Remove Car \n 3. List Cars \n 4. Set car");
            String userInput = scanner.nextLine();
            int input = getInput(userInput);

            switch (input) {
                case 1:
                    garage.addCar(car1);
                    garage.addCar(car2);
                    garage.addCar(car3);
                    break;
                case 2:
                    garage.removeCar(car1);
                case 3:
                    garage.listCars();
                case 4:
                    garage.setCarInGarage(0, car4);
            }

        }

    }

    private static int getInput(String sampleString) {
        try {
            return Integer.parseInt(sampleString);
        } catch (Exception e) {

            return -1;
        }
    }
}
