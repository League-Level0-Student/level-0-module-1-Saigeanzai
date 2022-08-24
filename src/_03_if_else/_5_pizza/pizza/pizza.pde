PImage pepperoni;
PImage mushroom;
void setup() {
   size(500, 500); 
      pepperoni = loadImage("pepperoni.png");
      mushroom = loadImage("mushroom.png");
}
void draw() {
    fill(209, 182, 133);
    ellipse(250, 200, 300, 300);
   image(pepperoni,200,200);
 image (mushroom,250, 100);
}
