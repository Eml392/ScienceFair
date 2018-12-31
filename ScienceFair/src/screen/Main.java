package screen;

/*Eclipse will ask you to import these libraries automatically once you write code related to them.
Eclipse helps you a lot. I use a technique which is I write the name of the object then hit dot
For example, if I write screen. a lot of options will appear which are available for you. Test them out
You can do the same with any object, including d.                                                  */
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	//Ignore this lol its useless
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		
		//Makes integer (int) (Numbers without decimals) values of the width and height in pixels
		int width = 800;
		int height = 600;
		
		
		//Makes a screen with the Java Frame (JFrame) object called "Water Hardness"
		JFrame screen = new JFrame("Water Hardness");
		
		
		//Makes a new object called d which will indicate the dimensions of the screen
		Dimension d = new Dimension();

		
		//Sets the size of the dimension to the width and the height
		d.setSize(width, height);
		
		
		//Makes the size of the screen the same as the dimension object
		screen.setSize(d);
		
		
		//Makes the screen visible to the user
		screen.setVisible(true);
		
		
		//Recommended to keep false for complicated reasons. Just keep it false XD
		screen.setResizable(false);
		
		screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		System.out.println("Your mum");
	}

}
