package Task1;

public class Main {

    //1.H In the main method, instantiate a new Driver, populating the fields with your own name and age.
    public static void main(String[] args) {
        Driver driver = new Driver("Anette", 88);

        //1.I In the main method, instantiate a new car, populating the field with whatever values you see fit.
        Car cars = new Car("Hyundai", "Type827", 1967, "auto giant");

        //1.J In the main method, assign the driver to the car created, using the setter method created in step 1.E
        cars.setDriver(driver);

        //1.K print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println(driver);
        System.out.println(cars);

        //1.L In the main method, create yet another car and assign the same driver to this car.
        Car car2 = new Car("Porsche", "Type356", 1948, "automobile");

        //1.M repeat the step 1.K for the new car created in 1.L.
        System.out.println(driver);
        System.out.println(car2);
    }


}
