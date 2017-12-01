package repetition.exercises.solutions.numbers;

import java.util.Scanner;

public class Example26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		int n1 = n;
		String stringInteger = Integer.toString(n);
		int d = stringInteger.length();
		int arr[] = new int[n];
		int i, sum;
		for (i = d - 1; i >= 0; i--) {
			arr[i] = n1 % 10;
			n1 = n1 / 10;

		}

		i = d;
		sum = 0;
		while (sum < n) {
			sum = 0;
			for (int j = 1; j <= d; j++) {
				sum = sum + arr[i - j];
			}
			arr[i] = sum;
			i++;
		}

		if (sum == n)
			System.out.println("Keith Number");
		else
			System.out.println("Not a Keith Number");
	}
}