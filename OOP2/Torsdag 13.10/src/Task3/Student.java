package Task3;

import java.util.ArrayList;

//3.2 Lav klassen Student, som arver fra Person, (dvs. extends Person).
//3.2 Lav konstruktøren til klassen, som kalder Persons konstruktør ved at bruge keywordet super().
public class Student extends Person {

    public Student(String name, ArrayList<String> arr) {
        super(name);
        passedCourses = arr;
    }

    //3.3 Lav to ArrayList i Student kaldet passedCourses og currentCourses.
    public static ArrayList<String> passedCourses;
    public static ArrayList<String> currentCourses = new ArrayList<>();

    //3.3 Lav om i konstruktørerne,
    //så der skal gives en ArrayList af passedCourses eller canTeach med, når objektet oprettes.
    //Lavet i linje 9


    //3.4 Override metoden addCourse i Student.
    @Override
    protected boolean addCourse(String course) {

        //Når metoden bliver kaldt, skal du sikre, at kurset ikke ligger i den
        //studerendes passedCourses-ArrayList, da en studerende ikke kan tage kurser,
        //som allerede er bestået én gang.
        //Linje 35 og 36.

        //Hvis den studerende ikke tidligere har bestået kurset, lægges det i currentCourses.
        //Lad metoden returnere true eller false alt efter om kurset blev tilføjet til currentCourses.
        //Linje 38 og 39.

        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }


}
