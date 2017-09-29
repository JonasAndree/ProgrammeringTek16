/**
 * 
 */
package loops.lesson;

/**
 * Loop exercise 1
 * Repetitive exercises (analyze the loops and test them) if you don't remember for 
 * example what modulus is ask me or look it up):
 *	Loop 1
 *		for(int i = 0; i < 20; i++) {
 *			if(i % 2 == 0) {
 *				System.out.println(i * 2);
 *			}
 *		}
 * 
 *	Loop 2
 *		for(int i = 20; i > 0 ; i-- ) {
 *			if(i % 2 == 0) {
 *				System.out.println(i);
 *			}
 *		}
 *
 * 	Loop 3
 *		int mysteryInt = 100;
 *		for(int i = 5; i > 0;i-- ) {
 *			mysteryInt -= i;
 *			System.out.println(mysteryInt)
 *		}
 *
 *	Loop 4
 *		for(int i = 5; i > 0;i-- ) {
 *			int mysteryInt = 100;
 *			mysteryInt -= i;
 *			System.out.println(mysteryInt);
 *		}
 *		
 * 	Loop exercise 2: 
 * 		Use a while loop
 * 		int mysteryInt = 1;
 * 		int counter=1;
 * 		while(mysteryInt <  3 ) {
 * 			mysteryInt = mysteryInt * counter;
 *			counter++;
 *		}
 *		System.out.println(mysteryInt);
 * 
 * 
 * Loop exercise 3
 * public class WhileLoops  {
 * 		Prompt the user for a number using (Scanner) and print good if the number is greater than 5, 
 * 		and between 8 & 10 or greater than 33. 
 * 		Otherwise, print bad. Use the && and || operator in your if statement.
 * 		Capsulate the program with a while loop asking the user the same questions forever.
 * 
 * Loop exercise 7
 *		Write program to allow the user to input his/her age. 
 *		Then the program will show if the person is eligible to vote (using System.out.println();) 
 *		A person who is eligible to vote must be older than or equal to 18 years old. 
 *
 * 		Loop the code two times. 
 *  	
 *  	if the user wrote a number below 18 the first time and the second time the user wrote 18 
 *  		or above write something like: 
 *  			“So you have changed your age?! Hmm I don’t believe you. YOU ARE NOT ALLOWED TO VOTE!!!.
 *  
 *		If the age was more than 18 the first time then the second time lower than 18. Tell the user:
 * 			I thought so! You can’t fool me my friend :D. YOU ARE NOT ALLOWED TO VOTE!!!.
 * 		
 * 		Else if the user enters above or equal to 18 replay with:
 * 			You are eligible to vote.
 * 
 * Loop exercise 8
 *  	Add a quitting question/option to the loop 1 in exercise 6.
 *			For example if the user replays with “esc” to the program the loop ends. 
 *
 * Loop exercise 9
 * 		Write a small story within a loop. 
 * 		Where you use different questions depending on what the integer variable “stage” is.
 * 		Example:
 * 			If the variable “stage” is 1 ask one question where there is more than one answer possible 
 * 			and depending on the users answer, the variable “stage” gets a new value and a new question is asked. 
 *
 *
 * Loop exercise 10
 * 
 * 		To do 1:
 * 			Write a command line program that will print out the lyrics to 99 Bottles.
 * 			
 * 			99 bottles of beer on the wall, 99 bottles of beer.
 * 			Take one down and pass it around, 98 bottles of beer on the wall.
 * 
 * 			98 bottles of beer on the wall, 98 bottles of beer.
 * 			Take one down and pass it around, 97 bottles of beer on the wall.
 * 
 * 			97 bottles of beer on the wall, 97 bottles of beer.
 * 			Take one down and pass it around, 96 bottles of beer on the wall. 
 * 
 *  		...
 * 
 * 
 * @author jonas.andree
 *
 */
public class Loops {

}
