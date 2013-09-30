/*
 * ID: A11259419
 * NAME: Eugene Che
 * LOGIN:cs11eac
 */

import objectdraw.*;
import java.awt.*;

public class Fred extends WindowController 
{
    public void onMousePress(Location point) {
        new FilledOval(point.getX(), point.getY(), 30, 30, canvas).setColor(Color.BLUE);
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
