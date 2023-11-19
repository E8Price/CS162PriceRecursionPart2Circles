import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;

public class MySketch extends PApplet{
    ArrayList<Shape> shapes = new ArrayList<Shape>();
        
  
    final int SIZEX = 1000;
    final int SIZEY = 1000;
    int x = SIZEX/2;
    int y = SIZEY/2;
    
    public void settings() {
        size(SIZEX, SIZEY);
    }
    
    public void setup() {
        shapes.add(new Circle(50.0,this));
        display(shapes);
    }

    public static void display(ArrayList<Shape> shapes) {
        
        for(Shape shape: shapes){
            System.out.println(shape);
        }
        
    }
    public void drawConcentricCircle(){

    }

    public void draw() {
        background(0);
        for(Shape shape: shapes){
            shape.draw(x,y);
        }

    }
}
