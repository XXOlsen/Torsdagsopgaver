// Game introduction:
String name = "Klask";

//You need to press the key, when you see the number on the left side match the random number. 

//Counter
int firstNumber = 0;
int currentNumber = firstNumber;

//String cards index starter 0
int currentCard = 0;

//Delay
int frameTimer = 0;
int delayframeTimer = 100;

//Count cards
int hasRun = 0;
//52 cards in total
int shouldRun = 52;

//Cards frome A to K
String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

//max kort
int maxCards = cards.length;

void setup() {
  size(100, 100); 
  println("Hello there. Welcome to " + name+".");
}

void draw(){
  String card;

  if (currentNumber < maxCards){
    if (frameTimer > delayframeTimer){
      frameTimer = 0;
      currentCard = (int)random(cards.length); // random metode
      card = cards[currentCard]; 
      println("[" + (currentNumber+1)  + "] " + card);  
      // Prints one of the cards and currentNumber+1 is because the number startes at 1. 

      currentNumber ++; 
      hasRun++;
    }
  }
  
  if (currentNumber == maxCards) { // if the number are equals to card length, then it will repeat from the start. 
    currentNumber = firstNumber;
  }
  
  frameTimer ++;

//There is 52 cards in total, so after dealing 52 cards, the game stops.
  if (hasRun == shouldRun) {
     exit();
  }
}


void keyPressed() {
  if (currentCard == currentNumber -1 ){
    println("Klask!");
  } else {
    println("Wrong!");
  }
}
