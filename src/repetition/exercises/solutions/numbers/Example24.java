package repetition.exercises.solutions.numbers;

import java.util.Scanner;

public class Example24 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		int sum = 0, r;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("It is a Palindrome number.");
		else
			System.out.println("Not a palindrome");
	}
}