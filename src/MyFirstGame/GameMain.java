package MyFirstGame;

import javax.swing.JOptionPane;

public class GameMain {

	private static String playerName = "John"; 
	
	
	public static void main(String[] args) {
		level0();
	}
	
	public static void level0 () {
		JOptionPane.showMessageDialog(null, "Wlecome to the game!");
		playerName = JOptionPane.showInputDialog("Enter your players name: ");
		level1();
	}
	public static void level1() {
		String[] options = new String[] { "Left.", "Right", "Up", "Down.", "Show my inventory." };
		int response = JOptionPane.showOptionDialog(null, "You have reached a dungeon \nWhat would you like to do?",
				"DUNGEON ENTRENCE!!!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);
		
		JOptionPane.showMessageDialog(null, "Response: " + response);
		
		if (response == 0) {
			level2();
		} else if (response == 1) {
			level3();
		} else if (response == 2) {
			level4();
		} else {
			level5();
		}
	}
	
	public static void level2 () {
		JOptionPane.showMessageDialog(null, "LEVEL 2");	
	}
	
	public static void level3 () {	
		JOptionPane.showMessageDialog(null, "LEVEL 3");
		String[] options = new String[] { "Left.", "Right", "Up", "Back." };
		int response = JOptionPane.showOptionDialog(null, "You have reached a dungeon \nWhat would you like to do?",
				"DUNGEON ENTRENCE!!!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);
		
		if(response == 3) {
			level1();
		}
	}
	public static void level4 () {
		JOptionPane.showMessageDialog(null, "LEVEL 4");
		String[] options = new String[] { "Krona", "Klave" };
		int response = JOptionPane.showOptionDialog(null, "You have reached a dungeon \nWhat would you like to do?",
				"DUNGEON ENTRENCE!!!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[0]);
	}
	public static void level5 () {
		JOptionPane.showMessageDialog(null, "LEVEL 5");
		String[] choices = { "Sword", "Pipe", "Gold", "Poop", "Banana", "Grain" };
		
		String input = (String) JOptionPane.showInputDialog(null, "Choose now...", "The Choice of a LIFETIME!!!!!!",
				JOptionPane.QUESTION_MESSAGE, null, // Use
													// default
													// icon
				choices, // Array of choices
				choices[3]); // Initial choice
		
	}
}
