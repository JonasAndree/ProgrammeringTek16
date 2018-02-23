package lesson.jframe.labelandstructure;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Main extends JFrame implements WindowListener {
	
	
	private JButton nextButton = new JButton("Next");
	private JButton backButton = new JButton("Back");

	private Toolkit tk = Toolkit.getDefaultToolkit();
	private JPanel panel = new JPanel();
	private JButton closeButton = new JButton("Close");
	
	
	
	public Main() {
		// Closes the program when x button is presseed.  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Hämtar en panel som man kan lägga andra grafiska object på
		Container contentPane = this.getContentPane();
		
		// Lägger till sjig sjålv som en lysner till sitt egna fönster
		this.addWindowListener(this);
		
		
		this.setSize(tk.getScreenSize().width, tk.getScreenSize().height);
		this.setUndecorated(true);
		this.setOpacity(0.95f);
		this.setLocationRelativeTo(null);
		
		// Kör funktionen addButtons 
		addButtons(contentPane);
	}
	
	public void addButtons(Container contentPane) {
		
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		ImageIcon poopIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/poop.jpeg");
		

		Image image = poopIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		poopIcon = new ImageIcon(newimg);  // transform it back
		
		JLabel labelIcon = new JLabel(poopIcon);
		panel.add(labelIcon);
		labelIcon.setBackground(new Color(20, 20, 20));
		labelIcon.setBounds(1200,200, 400, 400);
		
		JLabel label = new JLabel("<html>"
				+ "<body>"
				+ "<b style='color:red;text-decoration:underline;'>"
				+ "Press the use key button! Press the use key button!<br>"
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br>"
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br>"
				+ "</b>" );
		panel.add(label);
		label.setBackground(new Color(20, 20, 20));
		label.setBounds(400,200, 800, 800);

		JTextArea textArea = new JTextArea("<html>"
				+ "<body>"
				+ "<b style='color:red;text-decoration:underline;'>"
				+ "Press the use key button! Press the use key button!<br>"
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br>"
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br> "
				+ "Press the use key button! Press the use key button!<br>"
				+ "</b>" );
		panel.add(textArea);
		textArea.setBackground(new Color(20, 20, 20));
		textArea.setBounds(200,200, 800, 800);
		
		// Create a  JButton
		JButton okButton = new JButton("Use key");
		panel.add(okButton);
		okButton.addActionListener(e -> buttonAction(label));
		Dimension sizeOKButton = okButton.getPreferredSize();
		okButton.setBounds(tk.getScreenSize().width - 400,tk.getScreenSize().height - 200, sizeOKButton.width, sizeOKButton.height);
		
		// Create a  JButton
		JButton clearButton = new JButton("Clear");
		panel.add(clearButton);
		clearButton.addActionListener(e -> buttonActionClear(label));
		Dimension sizeClearButton = okButton.getPreferredSize();
		clearButton.setBounds(tk.getScreenSize().width - 420 - sizeOKButton.width ,tk.getScreenSize().height - 200, sizeClearButton.width, sizeClearButton.height);
				
		
		panel.add(closeButton);
		closeButton.addActionListener(e -> buttonActionClose());
		closeButton.setMnemonic(KeyEvent.VK_C);
		Dimension size = closeButton.getPreferredSize();
		closeButton.setBounds(tk.getScreenSize().width - 200, 20, size.width, size.height);

		
		
		
		contentPane.add(nextButton, BorderLayout.EAST);
		nextButton.addActionListener(e -> buttonActionNext());
		nextButton.setToolTipText("<html><body><b style='color:red;text-decoration:underline;'>N</b><b>ext</b></body></html>");


		contentPane.add(backButton, BorderLayout.WEST);
		backButton.addActionListener(e -> buttonActionBack());
		backButton.setBackground(Color.RED);
		Border  matteBorder = BorderFactory.createMatteBorder(1,3,5,7,  Color.BLUE);
		backButton.setBorder(matteBorder);
		
		
	}

	private void buttonActionClear(JLabel label) {
		label.setText("<html><body><b><br>Cleard</b>");

	}

	public void buttonActionNext() {
		nextButton.setText("<html><body><b style='color:red;text-decoration:underline;'>N</b><b>ext</b></body></html>"); 
		System.out.println("Next Button pressed!");	

		panel.removeAll();
		
		panel.add(closeButton);
		
		panel.repaint();
	}
	
	
	
	
	public void buttonActionBack() {
		System.out.println("Back Button pressed!");
	}
	public void buttonAction(JLabel label) {
		label.setText(label.getText() + "<b><br>Use key button pressed!</b>");
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