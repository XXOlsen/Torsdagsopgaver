
//Task 2:

//2.a

//2.a store your name in a variable and print it.
String name = "Xiaoxuan";
println(name);

//2.b
//2.b store your age in a varible and print it.
int age = 24;
println(age);

//2.c + 2.d
/*2.c store whether or not you are happy right now, 
*as a boolean (true for happy, false for sad).
*2.d using the above variables print 
*the following message:
*"Hi, my name is <name>"
*"I am <age> years old"
*"I <dont> clap my hands"
*where the <> refers to variables.
*the last variable (<dont>) is only to be printed 
*if the happy boolean is false.
*/

boolean sad = true;
println(sad);

print("Hi, my name is " + name, "I am " + age, "years old ");

if(sad == false){
  print("I clap my hands");
} else {
  print("I don't clap my hands");
}
