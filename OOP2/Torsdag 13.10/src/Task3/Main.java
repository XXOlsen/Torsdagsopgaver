package Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        //3.6 Lav en klasse Main med en main-metode, hvor du tester Student og Teacher.
        //Du skal oprette et antal studerende og et antal undervisere og give dem ArrayLists
        //af beståede kurser eller canTeach-kurser. Gem alle dine objekter i en ArrayList persons.

        Student S1 = new Student("Abba", new ArrayList<>(Arrays.asList("Matematik")));
        Student S2 = new Student("Barbie", new ArrayList<>(Arrays.asList("Idræt")));
        Student S3 = new Student("Carry", new ArrayList<>(Arrays.asList("Java 1.0")));

        Teacher T1 = new Teacher("Daniel", new ArrayList<>(Arrays.asList("Musik")));
        Teacher T2 = new Teacher("Ethon", new ArrayList<>(Arrays.asList("Java 1.0", "Idræt")));
        Teacher T3 = new Teacher("Frederik", new ArrayList<>(Arrays.asList("Matematik")));


        //3.7 Kør din persons-liste igennem med en for-løkke og tilføj kurset "Java 1.0" til dem alle
        //(sørg for at nogle af dine studerende allerede har bestået dette og andre ikke har, samt
        //at nogle af underviserne er kvalificerede til at undervise i det og andre ikke er).

        ArrayList<Person> People = new ArrayList<>();

        People.add(S1);
        People.add(S2);
        People.add(S3);
        People.add(T1);
        People.add(T2);
        People.add(T3);

        for (int i = 0; i < People.size(); i++){
            boolean result = People.get(i).addCourse("Java 1.0");
            if(!result){
                if(People.get(i) instanceof Student){
                    System.out.println(People.get(i).getName() + " har allerede bestået dette kursus.");
                } else {
                    System.out.println(People.get(i).getName() + " kan ikke undervise i dette fag.");
                }
            }
        }


    }
}
