package MyFirstGame;

import javax.swing.JOptionPane;

public class MainGame {

	
	private boolean level2 = false;
	
	public static void main(String[] args) {
		
		welcomeText();
		
		
		
	}

	private static void welcomeText() {
		JOptionPane.showMessageDialog(null, "Welcome to level1!");
		level1();
	}
	
	private static void level1() {
		String selection = JOptionPane.showInputDialog("Would you like go to level2 or level3.");
		if (selection.equalsIgnoreCase("level2")) {
			level2();
		} else if (selection.equalsIgnoreCase("level3")) {
			level3();
		} else {
			JOptionPane.showMessageDialog(null, "I did not understand that!");
			level1();
		}
	}
	
	private static void level2() {
		String selection = JOptionPane.showInputDialog("Would you like go to go back or level3.");
		if(selection.equalsIgnoreCase("go back")) {
			level1();
		} else {
			level3();
		}
	}
	private static void level3() {
		String selection = JOptionPane.showInputDialog("Would you like go to go back or leave.");
		if(selection.equalsIgnoreCase("go back")) {
			level2();
		} else {
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void helloMSG() {
		JOptionPane.showMessageDialog(null, "Welcome to your first game!\nThis will be a story based game!");
		level1();
	}
	public static void level1() {
		JOptionPane.showMessageDialog(null, "Enter your name!");
	}
	*/
	
	
}
