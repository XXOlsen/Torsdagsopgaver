package Task2;

import Task1.Driver;

public class Room {

    //2.A Create a Room.java class with the following fields (use appropriate types and make them private):
    //numberOfDoors, numberOfLamps, numberOfWindows
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //2.B Create a constructor that populates all the fields above.

    public Room (int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //2.C As the fields of the Room class are private, create getters() for each of them,
    //Getter
    public int getnumberOfDoors() {

        return numberOfDoors;
    }

    public int getnumberOfLamps() {

        return numberOfLamps;
    }

    public int getnumberOfWindows() {

        return numberOfWindows;
    }











}
