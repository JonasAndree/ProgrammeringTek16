package swing.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		JFrame frame  = new JFrame("Swing");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screen);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		
		
		JLabel label = new JLabel();
		label.setText("This is a label.");
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		label.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		label.setBounds(50, 50, 250, 250);
		panel.add(label);

		label.setText("aspjdcpioasnd");
		label.setBounds(screen.width-350, screen.height - 350, 250, 250);
		
		
		JButton button = new JButton();
		button.setText("BIG");
		button.setBounds(20, 20, 200, 200);
		button.addActionListener(e -> start());
		panel.add(button);
	}
	
	public static void start() {
		panel.removeAll();
		JLabel label = new JLabel("<html><body style='color:white;'>Hejaisdjhfciosdhacioh</body></html>");
		label.setBounds(50, 50, 250, 250);
		panel.add(label);

		JButton button = new JButton();
		button.setText("Polis");
		button.setBounds(20, 20, 200, 200);
		button.addActionListener(e -> polis());
		panel.add(button);
		panel.repaint();
		
	}
	
	public static void polis() {
		panel.removeAll();
		
		
		//asdncasdjkoncjo
		//
		
		
		
		
		panel.repaint();
	}
	// ny function som representerar the big sjop 
		// 
	
	

}
