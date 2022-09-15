
//2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.

boolean happy = true;

void setup() {
  if (iAmHappy())
  {
    println("I clap my hands");
  } else
  {
    println("I don't clap my hands");
  }
}

boolean iAmHappy() {
  // fill out what is missing here:
  println("I am happy.");
  return true;
}



//2.b Write a function that receives to integers as parameters and returns the sum of them.

int a = 5;
int b = 15;

void setup() {
  sum();

  //2.c Write a function that receives a string and returns it as uppercase.
  //(Hint: use the String-method ".toUpperCase()" on your string.
  //Notice that toUpperCase() has a string as returntype)

  String text = "To travel is to live.";
  println(text.toUpperCase());


  // It will return the sum of a and b.
  int sum() {
    int sum = a + b;
    println("The sum of a and b is = " + sum);
    return sum;
  }


  //2.d Write a function that receives a string and returns true
  //if the first letter of the string is uppercase.
  //(Hints: use the String-method ".charAt(0)" and "Character.isUpperCase('a');" )

  char t = text.charAt(0);

  boolean T = true;

  if (Character.isUpperCase('T')) {
    println("true");
  } else {
    println("false");
  }
}
