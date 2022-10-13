package Task3;


import java.io.CharArrayReader;
import java.util.ArrayList;

//3.2 Lav en klassen Teacher, som arver fra Person, (dvs. extends Person).
//3.2 Lav konstruktøren til klassen, som kalder Persons konstruktør ved at bruge keywordet super().
public class Teacher extends Person {

    public Teacher(String name, ArrayList arr) {
        super(name);
        canTeach = arr;
    }

    //3.3 Lav to ArrayList i Teacher kaldet canTeach og currentCourses.
    public static ArrayList<String> canTeach;
    public static ArrayList<String> currentCourses = new ArrayList<>();

    //3.5 Override metoden addCourse i Teacher.
    @Override
    public boolean addCourse(String course) {

        //Når metoden bliver kaldt, skal du sikre, at kurset ligger i underviserens canTeach-ArrayList,
        //da underviseren skal være kvalificeret til at undervise for at blive sat på kurset.

        //Hvis underviseren er kvalificeret, lægges kurset i currentCourses.
        //Lad metoden returnere true eller false alt efter om kurset blev tilføjet til currentCourses.

        if (canTeach.contains(course)) { //contains = indeholder

            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }

}
