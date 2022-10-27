public class DieselCar extends AFuelCar{

    private boolean YesToParticleFilter;
    private String FuelType = "Fuel Car";

    public DieselCar(int kmPrLitre, String numberPl, String make, String model, int doors){
        super(kmPrLitre, numberPl, make, model, doors);


    }

    public String getFuelType(){

        return FuelType = "Diesel";
    }

    public int getRegistrationFee() {
        //beregning:
        int kmPrLitre = getKmPrLitre();
        int feeRes = 0;

        if (kmPrLitre <= 5) {
            feeRes = 10470 + 15260;
        }
        if (kmPrLitre >= 5 && kmPrLitre >= 10) {
            feeRes = 5500 + 2770;
        }
        if (kmPrLitre >= 10 && kmPrLitre >= 15) {
            feeRes = 2340 + 1850;
        }
        if (kmPrLitre >= 15 && kmPrLitre >= 20) {
            feeRes = 1050 + 1390;
        }
        if (kmPrLitre >= 20 && kmPrLitre >= 50) {
            feeRes = 330 + 130;
        }
        if (YesToParticleFilter == false) {
            feeRes = kmPrLitre + 1000;
        }

        return feeRes;
    }

    public String toString(){
        return  "Fueltype: " + FuelType + "\n" + "Brand: " + make + "\n" +  "Model: " + model + "\n" + "Number of doors: " + numberOfDoors + "\n" + "Registration number: " + registrationNumber + "\n";
    }
}
