public abstract class ACar implements Car {

    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    public ACar (String numberPl, String make, String model, int doors){
        registrationNumber = numberPl;
        this.make = make;
        this.model = model;
        numberOfDoors = doors;

    }

    public String getRegistrationNumber(){

        return null;
    }

    public String getMake(){

        return null;
    }

    public String getModel(){

        return null;
    }

    public int getNumberOfDoors(){

        return 0;
    }

    //override String toString()

    @Override
    public String toString() {
        return "Brand: " + make + "\n" +  "Model: " + model + "\n" + "Number of doors: " + numberOfDoors + "\n" + "Registration number: " + registrationNumber;
    }
}
