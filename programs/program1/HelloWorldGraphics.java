/*************************************************************************
 *  Compilation:  javac -classpath '*':'.' HelloWorldGraphics.java
 *  Execution:   CLASSPATH='*':'.' appletviewer myapplet.html
 *  Requires: objectdraw.jar
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *  - uses the objectdraw library to display in a graphical window
 *  - runs in appletviewer 
 *************************************************************************/
import objectdraw.*;
import java.awt.*;

public class HelloWorldGraphics extends WindowController {
    /* These are methods called when certain events occur */
   	/* it is the objectdraw library that handles events   */
   	public void onMousePress(Location point) {
        	new Text("Hello World!", 40, 50, canvas );
	}

   	public void onMouseRelease(Location point) {
		canvas.clear();
	}
}
