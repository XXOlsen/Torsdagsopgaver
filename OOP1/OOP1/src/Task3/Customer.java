package Task3;

import java.util.ArrayList;

public class Customer {


    //3.A Lav en klasse, Customer, med attributterne:
    //String firstName, String lastName, String userName int id.

    private String firstName;
    private String lastName;
    private String userName;
    int id;

    //3.B Klassen skal have en konstruktor der tager et parameter med kundens navn og brugernavn.
    //Giv klassen en toString() metode, der printer kundens detaljer pænt ud.
    //Gør alle klassens felter private, og tilføj getters().

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Customers information: " + firstName + " "+  lastName + ", and username: " + userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }


}






