/* WeightTest.java 
 * Author: Philip Papadopoulos
 * Course: CSE11 Fall 2013
 * Assignment: Program #1
 *
 * Date Written: 1  October 2013
 * Last Modified: 1 October 2013
 *
 * Description: A test program that can be used to test the WeigthBox class 
 *		The animation is driven by clicking the mouse button.
 *
 *		extends WindowController from objectdraw.
 *
 * Build:  javac -classpath '*':'.' WeightTest.java
 * Dependencies:  WeightBox.java, objectdraw.jar
 *
 * Public methods defined:
 * 	main (String[]) - main program method
 * 	begin() - initialize a weight box 
 * 	onMouseClick(Location) - action when mouse is pressed. Moves box 
 *
 * Public class variables:
 * 	None
 *
 **********************************************************************/
import objectdraw.*;
import java.awt.*;

public class BlockAndTackle extends WindowController
{

	// *** Constants defined by this class ***
	public static final int CANVAS_HEIGHT = 600;
	public static final int CANVAS_WIDTH = 400;
	public static final int BOXWIDTH = 64;
    public static final int PULLEYDIAMETER = 100;
	public static final int STEP = 33;

	// *** Instance Variables ***  
    private FilledOval pulley;
	private WeightBox leftBox;
    private WeightBox rightBox;
	// *** Methods ***
	// Method: begin
	// Make a WeightBox instance in the middle of canvas 
	public void begin() 
	{
		int midX = CANVAS_WIDTH/2;	// Middle of the Canvas 
		pulley = new FilledOval(new Location(midX - PULLEYDIAMETER / 2, PULLEYDIAMETER / 2),
                                PULLEYDIAMETER, PULLEYDIAMETER, canvas);
        leftBox = new WeightBox(new Location(midX - PULLEYDIAMETER / 2, PULLEYDIAMETER),
                                CANVAS_HEIGHT / 4, BOXWIDTH, canvas);
        leftBox.setColor(Color.BLUE);
        rightBox = new WeightBox(new Location(midX + PULLEYDIAMETER / 2, PULLEYDIAMETER),
                                CANVAS_HEIGHT / 4, BOXWIDTH, canvas);
        rightBox.setColor(Color.YELLOW);
       

	}

	// Method: onMouseClick
	// Move the Box up or down a bit each time the mouse is clicked
	public void onMouseClick(Location point) 
	{
        int delta = STEP;
        if (point.getX() > CANVAS_WIDTH/2) 
        {
            delta = -STEP;
        }
        if (leftBox.getRopeLength() + delta >= PULLEYDIAMETER / 2 && 
            rightBox.getRopeLength() - delta >= PULLEYDIAMETER / 2) 
        {
            leftBox.hoist(delta);
            rightBox.hoist(-delta);
        }
	}

	// Method: main
	// Make this a Java Application
	public static void main (String[] args) 
	{
		new BlockAndTackle().startController(CANVAS_WIDTH,CANVAS_HEIGHT); 
	}
}
