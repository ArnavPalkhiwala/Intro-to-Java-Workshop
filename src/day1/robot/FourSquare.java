package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot bob= new Robot("batman");

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() 
{bob.penDown();
bob.setPenColor(Color.ORANGE);
bob.setSpeed(10);
for (int i = 0; i < 4; i++){
bob.move(100); 
bob.turn(90);}
	
}
	

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
