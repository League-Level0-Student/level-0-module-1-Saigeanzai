int x = 400; 
int y = 600; 

void setup() {
    size(800, 800);
    
}

void draw() {
    background(0, 0, 40); 
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
y-=15;
fill(247, 247, 247);
ellipse(100, 100, 150, 150);
fill(170, 165, 165);
ellipse(140, 100, 50, 50);
fill(170, 165, 165);
ellipse(80, 150, 20, 20);
}
