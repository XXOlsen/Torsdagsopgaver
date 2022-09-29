import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please type your name: ");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println("Your name is: " + name);

        System.out.println("Please type your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);


        System.out.println("Now we need to calculate how many years left until you retire, please type your age again: ");
        int result = scan.nextInt();
        int calculate = 67;
        System.out.println("There is: " + (calculate - result) + " years left until you retire");



    }
}