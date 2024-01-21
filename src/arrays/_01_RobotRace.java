package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[3];
		// 3. use a for loop to initialize the robots.
		for (int x = 0; x < robots.length; x++) {
			robots[x] = new Robot();
			robots[x].setX(100 + x * 100);
			robots[x].setY(400);
			robots[x].setAngle(0);
			robots[x].setSpeed(20);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean crossedFinishLine = false;
		while (!crossedFinishLine) {
			Random ran = new Random();
			for (int x = 0; x < robots.length; x++) {
				for (int t = 0; t < ran.nextInt(); t++) {
					robots[x].move(10);
					robots[x].turn(5);	
				}
				
				if (robots[x].getY() < 50) {	
					crossedFinishLine = true;
					System.out.println("Robot " + x + " is the WINNER!");
					break;				}
				
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner 
	
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}