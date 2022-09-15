/*
 *
 * Hvis du kører programmet får du en række fejl.
 * Fix programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *
 */

void setup() {
  int a = 7, b = 42;
  minimum(a, b);
}

void minimum(int a, int b) {
  if (a < b) {
    println(a + " is the smallest!");
  } else if (a == b) {
    println("Both is the smallest!");
  } else {
   println(b + " is the smallest!");
  }
  return;
}
