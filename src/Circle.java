import processing.core.PApplet;

/**
 * Represents a circle
 */
public class Circle extends Shape {
    double diameter;
    PApplet mySketch;
    public Circle(double diameter,PApplet mysketch){
        this.mySketch=mysketch;
        this.diameter = diameter;
    }
    public double computeArea(){
        return .25*Math.PI*diameter*diameter;
    }
    public double computePerimeter(){
        return Math.PI*diameter;
    }
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f, Diameter: %f", getClass().getName(),
        getId(), computeArea(),computePerimeter(),diameter);
    }

    public void draw(int x, int y){
        mySketch.fill(mySketch.random(0,256),mySketch.random(0,256),mySketch.random(0,256));
        mySketch.ellipse((float)x,(float) y, (float)diameter, (float)diameter);
    }

}