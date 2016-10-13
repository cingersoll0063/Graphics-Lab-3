
// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class GraphicsLab03st extends Applet {

	public void paint(Graphics g) {
		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		Random rnd = new Random(1234);
		{

			// Draw Random Lines

			for (int w = 1; w <= 100; w++) {
				int x1 = rnd.nextInt(390) + 400;

				int y1 = rnd.nextInt(290) + 10;
				int x2 = rnd.nextInt(390) + 400;
				
			int y2 = rnd.nextInt(290) + 10;
			int rojo = rnd.nextInt(256);
			int verde = rnd.nextInt(256);
			int azul = rnd.nextInt(256);
			g.setColor(new Color(rojo, verde, azul));
			g.drawLine(x1, y1, x2, y2);
			
			}
			// Draw Random Squares

			for (int k = 1; k <= 100; k++) {
				int x = rnd.nextInt(340) + 10;

				int y = rnd.nextInt(240) + 10;
				int red = rnd.nextInt(256);

				int green = rnd.nextInt(256);

				int blue = rnd.nextInt(256);

				g.setColor(new Color(red, green, blue));

				g.fillRect(x, y, 50, 50);
			}
				// Draw Random Circles
				Random rndCr = new Random ();
			for (int p = 1; p < 50; p++){int c1 = rndCr.nextInt(200);
				 int x4 = rndCr.nextInt(390-c1)+10;
				 int y4 = rndCr.nextInt(290-c1)+300;
				 
				 Random rndInt = new Random();
				 int re= rndInt.nextInt(256);
				 int gre = rndInt.nextInt(256);
				 int bloo = rndInt.nextInt(256);
		g.setColor(new Color(re, gre, bloo));
		g.drawOval(x4,y4,c1,c1);


		}
				// Draw 3-D Box
				Polygon cube1 = new Polygon () ;
				cube1.addPoint(550, 400);
				cube1.addPoint(650, 400);
				cube1.addPoint(650,  500);
				cube1.addPoint(550,  500);
				g.drawPolygon(cube1);
				
				Color myRed = new Color(255,0,64);
				g.setColor(myRed);
				g.fillPolygon(cube1);
				
				
				Polygon cube2 = new Polygon ();
				cube2.addPoint(550,400);
				cube2.addPoint(500,350);
				cube2.addPoint(500,450);
				cube2.addPoint(550, 500);
				g.drawPolygon(cube2);
				Color mygreen = new Color (0,255,0);
				g.setColor(mygreen);
				g.fillPolygon(cube2);
				
				
				Polygon cube3 = new Polygon ();
				cube3.addPoint(500, 350);

				cube3.addPoint(600, 350);
				cube3.addPoint(600, 400);
				cube3.addPoint(550, 400);
				g.drawPolygon(cube3);
			Color myyellow = new Color (255, 255, 0);
			g.setColor(myyellow);
			g.fillPolygon(cube3);
			
			
			Polygon cube4 = new Polygon ();
			cube4.addPoint(600, 350);
			cube4.addPoint(650, 400);
			cube4.addPoint(600, 400);
			g.drawPolygon(cube4);
			Color myblue = new Color (0,0,255);
			g.setColor(myblue);
			g.fillPolygon(cube4);
		
			}
		}
	}

