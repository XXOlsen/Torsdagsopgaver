package Task3;

import Task2.Building;
import Task2.Room;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        //Customer peopletry = new Customer("BingBong Ding", "DingDong");
        //System.out.println(peopletry);

        // 3.C Skriv en Main klasse med en main metode, hvor der oprettes en beholder af typen ArrayList,
        // som du kalder 'customers'. Denne skal være erklæret som static global variabel -
        // dvs tilgængelig udenfor main metoden. I customers skal du placere 6 instanser af Customer typen.

        Customer people1 = new Customer("Bing Bong", "Ding", "DingDong");
        Customer people2 = new Customer("Sadness", "Saddy", "Shinny");
        Customer people3 = new Customer("Joy", "Jonny", "Happy");
        Customer people4 = new Customer("Disgust", "Thing", "Ew");
        Customer people5 = new Customer("Fear", "Less", "FastAndFurious");
        Customer people6 = new Customer("Anger", "Hottie", "Hangry");

        customers.add(people1);
        customers.add(people2);
        customers.add(people3);
        customers.add(people4);
        customers.add(people5);
        customers.add(people6);

        // (Du kan oprette instanserne først, og så add'e dem til array'et.
        // Du kan også adde og instantiere i samme linie.)
        //customers.add(new Customer("BingDong","DingDong"));

        printCustomers(customers);
    }

    //3.D Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud ved
    //at gennemløbe 'customers' med et ’for each’ loop. Test metoden fra main ved at kalde den. (Linje 30)

    public static void printCustomers(ArrayList<Customer> c) {
        for (Customer people : c) {
            System.out.println(people);
        }
    }


}
