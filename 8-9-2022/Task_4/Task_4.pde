//Task 4
//4.a

//4.a print out numbers from 0 to 20 using a for loop.
for (int v = 0; v < 21; v++) {
    println(v);
}

//4.b

//4.b alter the for loop from 4.a to only print even numbers 
//(hint: google 'java modulus even number')
for (int p = 0; p < 21; p++) {
  if (p % 2 == 0) {
    println(p);
}
}

//4.c
//4.c print out the same result as in task 4.b using a while loop 
//instead of a for loop.
int w = 0;
while (w < 21){
  w++;
  if(w % 2 == 0){
  println(w);
  }
}
