package Task2;

import java.util.ArrayList;

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

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        //2.I In your main method, instantiate a new building.

        Building building = new Building(rooms, 2, 3, 1);

        System.out.println(countLampsInBuilding(building));
        System.out.println(isNormal(building));
    }

    //2.J create a static method in Main, countLampsInBuilding,
    // that takes an object of type Building, and returns the total number of lamps in the entire building.
    public static int countLampsInBuilding(Building r) {
        int count = 0;
        for (int i = 0; i < r.getRooms().size(); i++) { //fordi det er ArrayList, dermed .size()
            count += r.getRooms().get(i).getnumberOfLamps();
        }
        return count;
    }

     //2.K create another static method in Main, isNormal, that takes an object of type Building.
     // The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
     // If not it should print "This is an odd building" and return false.

    public static boolean isNormal(Building r){
        if(r.getNumberOfFloors() > r.getRooms().size()){
            return true;
        } else {
            System.out.println("This is an odd building.");
            return false;
        }
    }

}
