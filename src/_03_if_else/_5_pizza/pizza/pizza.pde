PImage pepperoni;
PImage mushroom;
PImage olive;
PImage pizzaBox;
 
void setup() {
   size(500, 500); 
      pepperoni = loadImage("pepperoni.png");
      mushroom = loadImage("mushroom.png");
      olive = loadImage("olive.png");
      olive.resize(50, 50);
      pepperoni = loadImage("pepperoni.png");
      mushroom = loadImage("mushroom.png");
      olive = loadImage("olive.png");
      
}
void draw() {
    fill(209, 182, 133);
    ellipse(250, 200, 300, 300);
 
 if (mousePressed && (mouseButton == RIGHT)) {  image (olive, 289, 200);}
 if (mousePressed && (mouseButton == RIGHT)) {  image (olive, 150, 105);}

 if (mousePressed && (mouseButton == RIGHT)) {  image (pepperoni, 100, 150);}
  if (mousePressed && (mouseButton == RIGHT)) {  image (pepperoni, 200, 200);}
    if (mousePressed && (mouseButton == RIGHT)) {  image (mushroom, 250, 100);}
        if (mousePressed && (mouseButton == RIGHT)) {  image (mushroom, 150, 240);}


}
{
}
