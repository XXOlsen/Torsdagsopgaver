package Task1;

public class Car {
    //1.C Create a Car.java class with the following private fields (use appropriate types):
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //1.D Create a constructor, that populates all the fields above, except the Driver.
    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    //Getter
    public Driver getDriver() {

        return driver;
    }

    // Setter
    public void setDriver(Driver newDriver) {
        driver = newDriver;
    }

    /* 1.f override the toString method in the Car class, returning:
    "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle
     */
    @Override
    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle + ".";
    }

}
