public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;
    public int getWhPrKm;

    private String Fueltype = "Electric Car";

    public ElectricCar(int Capacity, int maxKm, int WhPrKm, String numberPl, String make, String model, int doors) {
        super(numberPl, make, model, doors);

        batteryCapacity = Capacity;
        maxRange = maxKm;
        getWhPrKm = WhPrKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return 0;
    }

    public int getWhPrKm() {
        return 0;
    }

    public int getRegistrationFee() {
        //beregning af El biler:

        double firstnumb = getWhPrKm / 91.25;
        int kmPrLitre = (int) firstnumb / 100;
        int feeRes = 0;

        if (kmPrLitre <= 5) {
            feeRes = 10470;
        }
        if (kmPrLitre >= 5 && kmPrLitre >= 10) {
            feeRes = 5500;
        }
        if (kmPrLitre >= 10 && kmPrLitre >= 15) {
            feeRes = 2340;
        }
        if (kmPrLitre >= 15 && kmPrLitre >= 20) {
            feeRes = 1050;
        }
        if (kmPrLitre >= 20 && kmPrLitre >= 50) {
            feeRes = 330;
        }

        return feeRes;
    }

    //Override String toString():
    @Override
    public String toString() {

        return "Fueltype: " + Fueltype + "\n" + "Brand: " + make + "\n" + "Model: " + model + "\n" + "Number of doors: " + numberOfDoors + "\n" + "Registration number: " + registrationNumber + "\n" + "Battery capacity:" + batteryCapacity + "\n" + "Max km range: " + maxRange + "\n" + "Watts pr.km: " + getWhPrKm + "\n";
    }
}

