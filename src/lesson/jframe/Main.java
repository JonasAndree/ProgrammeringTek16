package lesson.jframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements WindowListener {
	
	public Main() {
		// Closes the program when x button is presseed.  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Hämtar en panel som man kan lägga andra grafiska object på
		Container contentPane = this.getContentPane();
		// Lägger till sjig sjålv som en lysner till sitt egna fönster
		this.addWindowListener(this);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
		this.setUndecorated(true);
		this.setOpacity(0.95f);
		this.setLocationRelativeTo(null);
		
		// Kör funktionen addButtons 
		addButtons(contentPane);
	}
	
	public void addButtons(Container contentPane) {
		// Create a  JButton
		JButton okButton = new JButton("OK");
		contentPane.add(okButton, BorderLayout.SOUTH);
		okButton.addActionListener(e -> buttonAction());
		

		JButton closeButton = new JButton("Close");
		contentPane.add(closeButton, BorderLayout.NORTH);
		closeButton.addActionListener(e -> buttonActionClose());


		JButton nextButton = new JButton("Next");
		contentPane.add(nextButton, BorderLayout.EAST);
		nextButton.addActionListener(e -> buttonActionNext());


		JButton backButton = new JButton("Back");
		contentPane.add(backButton, BorderLayout.WEST);
		backButton.addActionListener(e -> buttonActionBack());
		
		
	}

	public void buttonActionNext() {
		System.out.println("Next Button pressed!");
	}
	public void buttonActionBack() {
		System.out.println("Back Button pressed!");
	}
	public void buttonAction() {
		System.out.println("Ok Button pressed!");
	}
	public void buttonActionClose() {
		System.out.println("Close Button pressed!");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Main frame = new Main();
		frame.setVisible(true);
	}

	

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");			
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");		
		
	}

}