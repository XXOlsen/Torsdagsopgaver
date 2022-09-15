/*
3.c in the Student tab, declare the class "Student"
 and add 4 global variables: "name", "age", "isFemale",
 "datamatikerTeam" using appropriate data types for each.
 */

class Student {

  String name;
  int age;
  boolean isFemale;
  String datamatikerTeam;

  /*
3.d in the Student class, add a constructor that takes in
   4 parameters with the names "tmpName", "tmpAge", "tmpIsFemale", "tmpDatamatikerTeam"
   with the same data types used in 3.c. 
3.e populate the variables created in 3.c with the parameters of the constructor added in 3.d.
(hint: 3.e er at tilføje public og this.)
   */

  public Student (String tmpname, int tmpage, boolean tmpisFemale, String tmpdatamatikerTeam) {
    this.name = tmpname;
    this.age = tmpage;
    this.isFemale = tmpisFemale;
    this.datamatikerTeam = tmpdatamatikerTeam;
  }
}
