// GraphicsLab01st.java
// Student starting version of the GraphicsLab01 assignment.
// Resave this program as GraphicsLab01v80 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	g.drawRect(50,  50,  300,  300);
		g.drawRect(150,  150,  300,  300);
		g.drawLine(50,  50, 150, 150);
		g.drawLine(350, 350, 450, 450);
		g.drawLine(350, 50, 450, 150);
		g.drawLine(50, 350, 150, 450);
		// DRAW SPHERE
		g.drawOval(100, 100, 300, 300);
		g.drawOval(100, 225, 300, 50);
		g.drawOval(100, 175, 300, 150);
		g.drawOval(100, 125, 300, 250);
		g.drawOval(225, 100, 50, 300);
		g.drawOval(175, 100, 150, 300);
		g.drawOval(125, 100, 250, 300);;
		// DRAW TRIANGLE		
		g.drawLine(500, 650, 1100, 650);
		g.drawLine(500, 650, 800, 325);
		g.drawLine(1100,  650, 800 , 325);
		g.drawLine(800,  650, 800,  325);
		g.drawLine(500, 650, 950, 487);
		g.drawLine(1100,  650,  650,  487);
	}

}


