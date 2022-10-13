package Task3;

//3.1 Lav en klasse Person:

public class Person {

    //3.1 med feltet name.
    String name;

    //3.1 Lav også en konstruktør og relevant getter- og setter-metode:

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //3.1 Lav derudover metoden boolean addCourse(String course).
    //3.1 Metoden skal ikke gøre noget, så du kan lade den returnere true og ikke gøre andet (en dummy-metode).
    protected boolean addCourse(String course) {
        return true;
    }


}
