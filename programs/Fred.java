/*
 * ID: A11259419
 * NAME: Eugene Che
 * LOGIN:cs11eac
 */

import objectdraw.*;
import java.awt.*;

public class Fred extends FrameWindowController 
{
    public void onMousePress(Location point) {
        new FilledOval(point.getX(), point.getY(), 30, 30, canvas).setColor(new Color(0,0,128));
        new Line(point.getX(), point.getY(), point.getX() + 45, point.getY(), canvas);
        new Line(point.getX(), point.getY(), point.getX(), point.getY() + 45, canvas);
    }

    public void onMouseRelease(Location point) {
        canvas.clear();
    }

    public static void main(String[] args) {	 
        new Fred().startController(400,400); 
    } 
}
