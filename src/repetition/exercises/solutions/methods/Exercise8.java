package repetition.exercises.solutions.methods;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the investment amount: ");
		double investment = scanner.nextDouble();
		System.out.print("Input the rate of interest: ");
		double rate = scanner.nextDouble();
		System.out.print("Input number of years: ");
		int year = scanner.nextInt();

		rate *= 0.01;

		System.out.println("Years    FutureValue");
		for (int i = 1; i <= year; i++) {
			int formatter = 19;
			if (i >= 10)
				formatter = 18;
			System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate / 12, i));
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}