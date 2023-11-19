
import processing.core.PApplet;

/**
 * This program draws shapes sorted by area onto a 2D canvas
 *
 * @author
 * @version
 * @since
 */
public class Main {

    public static void main(String[] args) {
        MySketch mySketch = new MySketch();
	    String[] processingArgs = {"MySketch"};
	    PApplet.runSketch(processingArgs, mySketch);
        
    }

    

    

}