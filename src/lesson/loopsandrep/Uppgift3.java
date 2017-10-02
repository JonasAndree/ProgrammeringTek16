package lesson.loopsandrep;

import java.util.Scanner;

/*
* public class WhileLoops  {
* 		Prompt the user for a number using (Scanner) and print good if the number is greater than 5, 
* 		and between 8 & 10 or greater than 33. 
* 		Otherwise, print bad. Use the && and || operator in your if statement.
* 		Capsulate the program with a while loop asking the user the same questions forever.
*/
public class Uppgift3 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		while(true) {
			System.out.print("Whrite a number: ");
			String usersLine = myScanner.nextLine();
			if(usersLine.equals("esc")) {
				break;
			}
			// Gör om usersLine till en int.
			int usersNumber = Integer.parseInt(usersLine);	
			
			
			if (usersNumber > 5) {
				if(usersNumber > 8 && usersNumber < 10 ||  usersNumber > 33) {
					System.out.println("Good");
				} else {
					System.out.println("The number was not larger then 8 and smaler then 10 or larger then 33.");
				}
			} else {
				System.out.println("The number was not larger then 5.");
			}
		}
		
		System.out.println("Closing the program.");
		
		
	}
}
