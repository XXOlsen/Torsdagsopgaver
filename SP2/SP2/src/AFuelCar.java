public abstract class AFuelCar extends ACar{

    protected int kmPrLitre;

    abstract String getFuelType();

    public AFuelCar(int kmPrLitre, String numberPl, String make, String model, int doors) {
        super(numberPl, make, model, doors);
    }

    public int getKmPrLitre(){

        return kmPrLitre;
    }

}
