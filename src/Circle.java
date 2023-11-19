import processing.core.PApplet;

/**
 * Represents a circle
 */
public class Circle extends Shape {
    double diameter;
    PApplet mySketch;
    public Circle(double diameter,PApplet mysketch){
        this.diameter=diameter;
        this.mySketch=mysketch;
    }
    public double computeArea(){
        return .25*Math.PI*diameter*diameter;
    }
    public double computePerimeter(){
        return Math.PI*diameter;
    }
    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f, Diameter: %f", getClass().getName(),
        getId(), computeArea(),computePerimeter(),diameter);
    }
    public void draw(double x, double y){
        mySketch.ellipse(x, y, (float)diameter, (float)diameter);
    }

}