package lesson.loopsandrep;

import java.util.Random;
import java.util.Scanner;

public class GGame {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		Scanner usersInput = new Scanner(System.in);
		
		int wins = 0;
		int loss = 0;
		
		
		for (int i = 0; i < 10; i++) {
			int computerNumber = randomGenerator.nextInt(2);
			System.out.print("Select number 0 or 1: ");
			int usersNumber = usersInput.nextInt();
			
			System.out.println("Computers number:" + computerNumber);
//			System.out.println(usersNumber);
			
			if (usersNumber == computerNumber) {
				wins = wins + 1;
			} else {
				loss = loss + 1;
			}
			System.out.println("Wins " + wins + " : Loss " + loss);
		}
		if(loss >= wins) {
			System.out.println("You loss.");
		} else {
			System.out.println("You win.");
		}

	}

}
