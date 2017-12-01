package repetition.exercises.solution.conditionalStatementsIfelse;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number:  ");
		int n = scanner.nextInt();
		int count = 1;
		int noOfSpaces = 1;
		int start = 0;

		for (int i = 1; i < (n * 2); i++) {

			for (int spc = n - noOfSpaces; spc > 0; spc--) {
				System.out.print(" ");
			}
			if (i < n) {
				start = i; // for number
				noOfSpaces++; // for spaces
			} else {
				start = n * 2 - i; // for number
				noOfSpaces--; // for space
			}
			for (int j = 0; j < count; j++) {
				System.out.print(start);
				if (j < count / 2) {
					start--;
				} else {
					start++;
				}
			}
			if (i < n) {
				count = count + 2;
			} else {
				count = count - 2;
			}

			System.out.println();
		}
	}
}