void setup() {
    size(500, 500);
}
void draw() {
    background(255, 250, 250);
    noStroke();
    fill(185, 73, 73, 500);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(33, 121, 39, 500);
    rect(176, 103, 12, 32);
    fill(255, 250, 250, 500);
    if(mousePressed){
        ellipse(125,100,90,150);
    }
}
