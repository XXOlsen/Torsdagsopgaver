/*
4.a Create arrays of the following type and assign it at least 3 different values:
 
 Integer array
 String array
 boolean array
 */
 
int age[] = {12, 31, 2};

String[] things = {"Cat", "Dog", "Horse"};

boolean[] answers = {true, false};

void setup() {
  //  printString(things);
  //  sum(age);
  //  average(age);
  fromLowtoHigh(age);
}

/*
4.b Write a function that takes in an array of
 strings as parameter and prints each string.*/

void printString(String[] arr) { //har brugt void, da det kun skal printes og ikke skal retur noget tilbage.
  for (int i = 0; i < arr.length; i++) {
    println(arr[i]);
  }
}

/*
4.c Write a function that receives an integer
 array as a parameter and returns the sum of all
 elements in the array. */

int sum(int[] arr) {
  int all = 0; //til at starte med, er summen 0.
  for (int i = 0; i < arr.length; i++) {
    all = all + arr[i] ;
  }
  return all;
}

/*
4.d Write a function that receives an integer
 array as a parameter and returns the average value. */

float average(int[] arr) { //kunne det være at det er dicimaltal.
  int t = sum(arr);
  float y = t / age.length;
  return y;
}


/*
4.e Consider how you could write a function that takes
 in an integer array as a parameter and returns the
 array sorted from lowest to highest value. */

int[] fromLowtoHigh(int[] arr) {
  for ( int i = 0; i < arr.length; i++) {
    arr = sort(arr);
  }
  return arr;
}
