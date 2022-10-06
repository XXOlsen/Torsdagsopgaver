package Task2;

import Task1.Driver;

import java.util.ArrayList;

public class Building {

    //2.D Create a Building.java class with the following fields (use appropriate types):
    //Rooms (make sure to use the 'final' keyword here as this variable should never change once it has been assigned a value)

    //numberOfBathrooms
    //numberOfFloors
    //isOfficeBuilding
    private final ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private int isOfficeBuilding;

    //2.E Create a constructor that populates all the fields above.
    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, int isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    //2.F As the fields of the Building class are private, create getters() for each of them.
    //Getter
    public ArrayList<Room> getRooms(){

        return rooms;
    }

    public int getNumberOfBathrooms() {

        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {

        return numberOfFloors;
    }

    public int getIsOfficeBuilding() {

        return isOfficeBuilding;
    }

}
