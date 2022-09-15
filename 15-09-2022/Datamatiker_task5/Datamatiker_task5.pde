

/*
3.i Returning to the Datamatik class add a setup() function
 and in this function, create a new object/instance of the type
 Teacher and give it the name, age and gender of your teacher.
 
 3.j Also in the setup() function of Datamatik, create two new objects/instances
 of the type Student. The first one, with your own name, age and gender.
 The second one with the name, age and gender of a student in your study group.
 
 3.k in the setup() function print the name of the teacher.
 
 3.l in the setup() function print the names of both students and which teams they are from.
 */

Student[] students = new Student[10];

void setup() {

  Student Nelly = new Student ("Nelly", 24, true, "B");
  Student Chris = new Student ("Chris", 22, false, "A");

  println("name: " + Nelly.name + ", datamatikerTeam: " + Nelly.datamatikerTeam);
  println("name; " + Chris.name + ", datamatikerTeam: " + Chris.datamatikerTeam);

  /*Task 5
   You will need your Datamatik and Student tab from task 3.
   If you have created a new sketch for task 5, you can copy the files Datamatik.pde
   and Student.pde from the folder Task3 (or whatever sketch you used to do task 3)
   to the folder Task5 (or whatever you named the sketch you are using for this task)
   
   5.a In your tab Datamatik add an array of Students with 10 elements in it.
   This should be a global variable. From the setup() method, add 10 student instances to the array.
   */

  students[0] = new Student("a", 18, true, "A");
  students[1] = new Student("b", 20, true, "A");
  students[2] = new Student("c", 31, true, "B");
  students[3] = new Student("d", 24, false, "A");
  students[4] = new Student("e", 25, true, "B");
  students[5] = new Student("e", 26, true, "A");
  students[6] = new Student("f", 27, true, "A");
  students[7] = new Student("g", 28, true, "B");
  students[8] = new Student("h", 29, false, "A");
  students[9] = new Student("i", 21, false, "B");

  println(findName(students, 6));
  println(indexOfstudents(students, "h"));
}

/*
 5.b Create a function in Datamatik that takes in the array from 5.a as a
 parameter as well as an integer. The function should return the field "name"
 (the name of the student) and print it (the integer should be used as the index
 nuber of the student to be printed). Call this method with different parameters
 (only the integer - not the array) from the setup() of Datamatik.
 */

String findName (Student[] array, int index) {
  return array[index].name;
}

/*
5.c Create a similar function to that of 5.b, but instead of receiving
 the array and an integer, it receives the array and a string. Loop through
 all elements in the array until you find the element with the name received
 as a parameter. Then return the index of that student. Call this method with
 different names from the setup() method of Datamatik.
 */

int indexOfstudents (Student[] array, String searchname) {
  for (int i = 0; i < array.length; i++) {
    if (array[i].name == searchname) {
      return i;
    }
  }
  return -1;
}
