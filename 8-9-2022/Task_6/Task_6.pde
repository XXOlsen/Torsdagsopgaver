//Task 6

//6.a
/*
*6.a make 2 integer variables named a and b.
 *Print "Success!" if either of them is equal to 10 or if the sum is.
 *If not, print "Failure!".
 */

float a = random(1, 9);
float b = random(1, 9);

if (a == 10 || b == 10 || a+b == 10) {
  println("Success!");
} else {
  println("Failure!");
}


//6.b
/*
*6.b make 3 integer variables named x, y and z.
 *Print "Success!"
 *if their sum is 30, but none of them may have the value of 10, 20 or 30.
 *Otherwise print "Failure!".
 */

float x = random(0, 9);
float y = random(0, 9);
float z = random(0, 9);

if ( x + y + z == 30) {
  println("Success!");
} else {
  println("Failure!");
}
