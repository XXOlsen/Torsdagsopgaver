import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Course> course = new ArrayList<Course>();

    public Student(String name) {
        this.name = name;
    }

    public void addCourse (Course ofc){
        course.add(ofc);
    }

    public String toString() {
        return "Student: " + name + " has the following courses:" + course;
    }
}


