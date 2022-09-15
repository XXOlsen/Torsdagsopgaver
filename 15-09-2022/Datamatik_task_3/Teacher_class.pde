/*
 3.f in the Teacher tab, declare the class "Teacher"
 and add 3 global variables: "name", "age", "isFemale",
 using appropriate data types for each.
 
 */

class Teacher {

  String name;
  int age;
  boolean isFemale;

  /*
3.g in the Teacher class, add a constructor
   that takes in 3 parameters with the names "tmpName", "tmpAge",
   "tmpIsFemale" with the same datatypes used in 3.f
   3.h populate the variables created in 3.f with the parameters of the constructor added in 3.g.
   */
  public Teacher (String tmpname, int tmpage, boolean tmpisFemale) {
    this.name = tmpname;
    this.age = tmpage;
    this.isFemale = tmpisFemale;
  }
}
