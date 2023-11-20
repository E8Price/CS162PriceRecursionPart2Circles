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
        
        display(shapes);
        background(200);
    }

    public static void display(ArrayList<Shape> shapes) {
        
        for(Shape shape: shapes){
            System.out.println(shape);
        }
        
    }
    public void mousePressed(){
        shapes.add(new Circle(500.00,this));
        drawConcentricCircle(mouseX,mouseY);
        
    }
    public void drawConcentricCircle(double x, double y){
        
        for(Shape shape: shapes){
            if (shape.getClass().getName() == "Circle"){
               if (shape.getDiameter()<=1){
                    shape.draw((int)x,(int)y);
               }
               else{shape.setDiameter(shape.getDiameter()-5);
               shape.draw((int)x,(int)y);
               drawConcentricCircle(x,y);
               }
            }
        }
    }

    public void draw() {
        
        

    }
}
