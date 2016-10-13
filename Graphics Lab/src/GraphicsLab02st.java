// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		
		for (x1 = 10; x1 < 990; x1 +=14){ 
		
		g.drawLine(x1, y1, x2, y2 -=9);}
		
		int x3 = 10;
				int y3 = 10;
				int x4 = 990;
				int y4 = 10;
		for (x3 = 10; x3 < 990; x3 +=14) {
			g.drawLine(x3,  y3,  x4,  y4 +=9);
			
			
			
		}
		int x5 = 990;
				int y5 = 10;
				int x6 = 10;
				int y6 = 10;
				
				for (x5 = 990; x5 > 10; x5 -=14){
					g.drawLine(x5,  y5,  x6, y6 +=9);
				}
				int x7 = 990;
						int y7 = 640;
						int x8 = 10 ;
						int y8 = 10;
				for (x7 = 10; x7 < 990; x7 +=14){
					g.drawLine(x7, y7, x8, y8 +=9);
				}
		
	}
}

