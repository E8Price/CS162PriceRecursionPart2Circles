
import processing.core.PApplet;

/**
 * This program draws can draw concectric circles where mouse is clicked
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