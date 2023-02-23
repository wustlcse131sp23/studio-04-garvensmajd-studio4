package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
// for whatever shape
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Color COLOR = new Color(red, green, blue);
		boolean isFilled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();

		if (shape.equals("ellipse")) {
			StdDraw.setPenColor(COLOR);
			if (isFilled == true) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}
			else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}
			
			
		}
		else if (shape.equals("rectangle")) {
			StdDraw.setPenColor(COLOR);
			if (isFilled == true) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}
			else {
				StdDraw.rectangle(p1, p2, p3, p4);
			}
			
		}
		else {
			double p5= in.nextDouble();
			double p6= in.nextDouble();
			StdDraw.setPenColor(COLOR);
			double []x = {p1, p3, p5};
			double []y = {p2, p4, p6};
			if (isFilled == true) {
				StdDraw.filledPolygon(x,y);
			}
			else {
				StdDraw.polygon(x,y);
			}
			
		}
		
		
		
	
		
		
		
		
		
	}
}
