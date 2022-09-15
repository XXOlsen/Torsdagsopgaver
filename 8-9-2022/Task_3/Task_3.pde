
//Task 3
//3.1

/*3.a Draw a traffic light using colors stored in 
*variables - one for each of the 4 colors (background is the 4th).
*3.b add a gray color for the turned off effect.
*3.c have the light turn on/off (green or red) automatically.
*/

int lys =1;
color lysFarver = #FF0000;

void setup(){
  size(600,600);
  rectMode(CENTER);
  frameRate(1);
}

void draw(){
  fill(0);
  rect(300,300,150,400);
  stroke(0);
  fill(175);
  ellipse(300,170,100,100);
  ellipse(300,430,100,100);
  ellipse(300,300,100,100);
  
  if (lys == 1){
    fill(#FF0000); //rød
    ellipse(300,170,100,100);
    /*
    fill(175);
    ellipse(300,430,100,100);
    ellipse(300,300,100,100);
    */
  }
  else if (lys == 2) {
    fill(#F6FF00);
    ellipse(300,300,100,100);
    /*
    fill(175);
    ellipse(300,170,100,100);
    ellipse(300,430,100,100);
    */
  } 
   else if (lys == 3) {
    fill(#00FF0E);//grøn
    ellipse(300,430,100,100);
    /*
    fill(175);
    ellipse(300,300,100,100);
    ellipse(300,170,100,100);
    */
    
  } 
  else {
    fill(#F6FF00);
    ellipse(300,300,100,100);
    /*
    fill(175);
    ellipse(300,170,100,100);
    ellipse(300,430,100,100);
    */
    lys = 0;
  }
  
  lys++;
  delay(1500);
}
