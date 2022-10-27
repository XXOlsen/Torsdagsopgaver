import java.util.ArrayList;

public class FleetOfCars {

    public ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car) {
        fleet.add(car);
    }

    public void PrintArrayList() {
        for (Car c : fleet) {
            System.out.println(fleet);
        }
    }

    public int getTotalRegistrationFeeForFleet() {
        int fee = 0;
        for (Car c : fleet) {
            fee += c.getRegistrationFee();
        }

        return fee;
    }

    @Override
    public String toString() {
        String text = "";

        for(Car c : fleet){
            text += c.toString();
        }

        return text;
    }
}
