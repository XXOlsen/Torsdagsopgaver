package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2.G In your main method, instantiate at least three different rooms.
        Room room1 = new Room(5, 10, 7);
        Room room2 = new Room(8, 16, 9);
        Room room3 = new Room(10, 20, 10);
        Room room4 = new Room(3, 4, 5);

        //2.H Add the rooms to a collection (preferably of the same data type
        // used for the "Rooms" field in your Building.java class).

        ArrayList<Room> rooms = new ArrayList<>();
        //ArrayList<Room> rooms = Arrays

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        //2.I In your main method, instantiate a new building.

        Building b = new Building(rooms, 2, 3, true);

        System.out.println("Lamps in this building is: " + countLampsInBuilding(b));
        System.out.println("Number of lamps in building is: " + isNormal(b));
    }

    //2.J create a static method in Main, countLampsInBuilding,
    // that takes an object of type Building, and returns the total number of lamps in the entire building.
    public static int countLampsInBuilding(Building building){
        int count = 0;
        for (int i = 0; i < building.getRooms().size(); i++) { //fordi det er ArrayList, dermed .size()
            count += building.getRooms().get(i).getnumberOfLamps();
        }
        return count;

        //en anden måde, ved brug af for each metoden:
        /*
        int result = 0;
        for (Room building : building.getRooms()){
        result += building.getnumberOfLamps();
        }
        return result;
        */
    }

    //2.K create another static method in Main, isNormal, that takes an object of type Building.
    // The method should return true if the number of Rooms is greater than the Building's numberOfFloors.
    // If not it should print "This is an odd building" and return false.

    public static boolean isNormal(Building building) {
        int floors = building.getNumberOfFloors();
        int rooms = building.getRooms().size();

        if (floors <= rooms) {
            return true;
        } else {
            System.out.println("This is an odd building.");
            return false;
        }
    }

}
