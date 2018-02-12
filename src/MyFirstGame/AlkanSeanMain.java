package MyFirstGame;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlkanSeanMain {

	private static String playerName = "User name";
	
	public static void main(String[] args) {
		
		welcome();
		

	}
	
	public static void welcome() {
		JOptionPane.showMessageDialog(null, "Welcome", "Welcome title", -1);
		setName();
	}

	public static void setName() {
		ImageIcon diceIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/dice.png");
		playerName = (String) JOptionPane.showInputDialog(null, "Enter name:", "Name", -1, diceIcon, null, "Username");
		level0();
	}
	public static void level0() {
		String[] options = { "Left", "Right", "Up", "Down", "Change name" };
		
		int response = JOptionPane.showOptionDialog(null, "You have reached a dungeon \nWhat would you like to do?",
				"DUNGEON ENTRENCE!!!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);
		
		if (response == 4) {
			setName();
		}
		
	}
			

}
