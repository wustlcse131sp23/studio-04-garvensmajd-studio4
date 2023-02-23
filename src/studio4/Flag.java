package studio4;



import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	Color green = new Color(0, 100, 50);
		StdDraw.setPenColor(green);
	StdDraw.filledRectangle(0.5,0.5,1,0.5);
	StdDraw.setPenColor(10,10,10);
	StdDraw.filledRectangle(0.1, 0.5, 0.1, 0.5);
	StdDraw.setPenColor(0,10,150);
	StdDraw.filledCircle(0.5, 0.5, 0.1);
	StdDraw.setPenColor(Color.YELLOW);
	double[]x= {0.4,0.5,0.6};
	double[]y= {0.6,0.7,0.6};
	StdDraw.filledPolygon(x,y);
	StdDraw.setPenColor(150,0,0);
	StdDraw.arc(1, 0.5, 0.5, 60, 30);
	StdDraw.setPenColor(150,0,0);
	StdDraw.arc(1, 0.5, 0.25, 60, 30);
	StdDraw.setPenColor(150,0,0);
	StdDraw.arc(1, 0.5, 0.1, 60, 30);
	}
}