public class TESTstudent {

    public static void main(String[] args) {
        Student a = new Student("Alex");
        Student b = new Student("Bent");
        Student c = new Student("Catty");

        Course math = new Course("Math");
        Course bio = new Course("Bio");
        Course DK = new Course("Danish");

        a.addCourse(math);
        a.addCourse(DK);

        b.addCourse(bio);
        b.addCourse(DK);

        c.addCourse(DK);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
