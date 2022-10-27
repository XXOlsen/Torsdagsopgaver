public class Main {
    public static void main(String[] args){


        //lav 3 biler:

        FleetOfCars carOfFleet = new FleetOfCars();

        carOfFleet.addCar(new GasolineCar(30, "AJ6666", "Lamborghini", "FKP 37", 2));
        carOfFleet.addCar(new ElectricCar(24, 26,15,"XX8888", "Fiat", "500e", 2));
        carOfFleet.addCar(new DieselCar(26, "KS9999", "Porsche", "911 RSR", 2));

        System.out.println(carOfFleet.getTotalRegistrationFeeForFleet());

        carOfFleet.PrintArrayList();


    }
}
