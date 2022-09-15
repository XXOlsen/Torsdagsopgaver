/*
1.a Create a sketch and name it Task1. Write a void setup()-function in the sketch.

 1.b Write a function that prints an empty line and call it from setup();
 
 1.c Write a function that receives a string as a parameter and prints it.
 call this function from setup().
 
 1.d Write a function that receives a string called "name" and an integer called "age"
 and call it from setup with your own name and age. Have the function print
 the text "My name is <name>, I am years old".
 */

String movie = "Disney";
String name = "Nemo";
int age = 6;

void setup () {
  printEmpty();
  stringParameter(movie);
  NameAndAge();
}

void printEmpty() {
  println();
}

//1.c Write a function that receives a string as a parameter and prints it.
//call this function from setup().
void stringParameter(String movie) {
  println("A " + movie, "movie called Finding " + name);
}

void NameAndAge() {
  print("Hello, my name is " + name, ". I am " + age, "years old.");
}
