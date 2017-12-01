package MyFirstGame;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MultipleChoises {

	public static void main(String[] args) {

		// En lista med text i!
		String[] options = new String[] { "Role the dice.", "Leave", "Look at it.", "Ask the old man infront." };
		// Hakparantes för att hämta en position.
		String option3 = options[3];
		// Bilden
		ImageIcon diceIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/dice.png");
		ImageIcon rulle = new ImageIcon("C:/Users/jonas.andree/Desktop/pargment/0003.png");
		ImageIcon leaveIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/leave.png");
		ImageIcon poopIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/poop.jpeg");
		// Random tal generator.
		Random diceRole = new Random();
		// Saves responce to an integer.
		int response = JOptionPane.showOptionDialog(null, "You have reached a dungeon \nWhat would you like to do?",
				"DUNGEON ENTRENCE!!!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);

		
		if (response == 0) {
			int diceValue = diceRole.nextInt(6);
			JOptionPane.showMessageDialog(null,
					"You role the dice " + "\nAnd you roled a: " + diceValue, "Dice", -1, diceIcon);
		} else if (response == 1) {
			JOptionPane.showMessageDialog(null, "You selected leave! ", "Leave", -1, leaveIcon);
		} else {
			JOptionPane.showMessageDialog(null, "You selected " + options[response], "You selected", -1);
		}

		
		
		
		
		
		
		
		
		
		String[] choices = { "Sword", "Pipe", "Gold", "Poop", "Banana", "Grain" };
		
		
		String input = (String) JOptionPane.showInputDialog(null, "Choose now...", "The Choice of a LIFETIME!!!!!!",
				JOptionPane.QUESTION_MESSAGE, null, // Use
													// default
													// icon
				choices, // Array of choices
				choices[3]); // Initial choice

		if (input.equals(choices[3]))
			JOptionPane.showMessageDialog(null, "You selected " + input, "Poop!!", -1, poopIcon);
		else
			JOptionPane.showMessageDialog(null, input);

	}

}
