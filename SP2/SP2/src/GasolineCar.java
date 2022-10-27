public class GasolineCar extends AFuelCar {

    private String fuelType = "Fuel Car";

    public GasolineCar(int kmPrLitre, String numberPl, String make, String model, int doors){
        super(kmPrLitre, numberPl, make, model, doors);
    }

    public String getFuelType() {

        return fuelType = "Gasoline";
    }

    public int getRegistrationFee() {
        //beregning:
        int kmPrLitre = getKmPrLitre();
        int feeRes = 0;

        if (kmPrLitre <= 5){
            feeRes = 10470;
        }
        if (kmPrLitre >= 5 && kmPrLitre >= 10){
            feeRes = 5500;
        }
        if (kmPrLitre >= 10 && kmPrLitre >= 15){
            feeRes = 2340;
        }
        if (kmPrLitre >= 15 && kmPrLitre >= 20){
            feeRes = 1050;
        }
        if (kmPrLitre >= 20 && kmPrLitre >= 50){
            feeRes = 330;
        }

        return feeRes;
    }

   public String toString (){
       return  "Fueltype: " + fuelType + "\n" + "Brand: " + make + "\n" +  "Model: " + model + "\n" + "Number of doors: " + numberOfDoors + "\n" + "Registration number: " + registrationNumber + "\n";

   }


}
