package repetition.exercises.solutions.basic;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner iscanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num1 = iscanner.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}
	}
}