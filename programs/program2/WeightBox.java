/*************************************************************************
/* WeightBox.java 
 * Author: Philip Papadopoulos
 * Course: CSE11 Fall 2013
 * Assignment: Program #1
 *
 * Date Written: 1  October 2013
 * Last Modified: 1 October 2013
 *
 * Description: 
 *		Implements the WeightBox class, a box at the end of a rope
 *		that can be raised or lowered	
 *
 *
 * Build:  javac -classpath '*':'.' WeightBox.java
 * Dependencies:  objectdraw.jar
 *
 * Public methods defined:
 * 		public void hoist (double l)
 * 		public void setColor (Color newColor)
 * 		public double getRopeLength()
 *
 * Public class variables:
 * 	None
 *
 **********************************************************************/
import objectdraw.*;
import java.awt.*;

public class WeightBox  
{
	// class instance variables. This is an incomplete list
    private double ropeLength;

	private FilledRect box;
	private Line rope;

	public WeightBox(Location anchorPoint, double ropeLength,
			double boxSize, DrawingCanvas canvas)
	{
        this.ropeLength = ropeLength;
		// create the rope and the box as Line and FilledRect objects
        box = new FilledRect(new Location(anchorPoint.getX() - boxSize/2, anchorPoint.getY() + ropeLength),
                             boxSize, boxSize, canvas); 
        rope = new Line(anchorPoint, new Location(anchorPoint.getX(), anchorPoint.getY() + ropeLength), canvas);
	}

	/* Method: hoist
	 * 		raise (lower) the box and shorten (lengthen) the rope
	 */ 
	public void hoist(double deltaY)
	{
        if (ropeLength + deltaY >= 0) {
            ropeLength += deltaY;
            rope.setEnd(new Location(rope.getStart().getX(), rope.getStart().getY() + ropeLength));
            box.move(0, deltaY);
        }
	}

	/* Method: getRopeLength() 
	 * 	return the current length of the rope	
	 */ 
	public double getRopeLength()
	{
        return ropeLength;
	} 

	public void setColor(Color newColor)
	{
		// set the color of the box
        box.setColor(newColor);
	}

}
