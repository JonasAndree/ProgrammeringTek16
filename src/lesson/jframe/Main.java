package lesson.jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
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
	private JPanel panel = new JPanel();
	
	private ImageIcon poopIcon = new ImageIcon("C:/Users/jonas.andree/Desktop/poop.jpeg");
	
	private JLabel imageLabel = new JLabel(poopIcon);
	
	private JButton okButton = new JButton("Use key");
	private JButton closeButton = new JButton("Close");
	private JButton nextButton = new JButton("Next");
	private JButton backButton = new JButton("Back");
	private Toolkit tk = Toolkit.getDefaultToolkit();
	
	private JLabel textInfo = new JLabel("Hej");
	
	private int level = 1;
	
	
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
		addComp(contentPane);
	}
	/**
	 * alt-shift-r gör så att alla referenser av ordet ändras
	 * @param contentPane
	 */
	public void addComp(Container contentPane) {
		// panel
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.BLACK);
		// end of panel
		
		{
			panel.add(imageLabel);
			Image image = poopIcon.getImage(); // transform it 
			Image newimg = image.getScaledInstance(400, 400,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			poopIcon = new ImageIcon(newimg);  // transform it back
			imageLabel.setIcon(poopIcon);
			imageLabel.setBounds(200, 200, 400, 400);
		}
		
		{
			JButton clearButton = new JButton("Clear");
			panel.add(clearButton);
			clearButton.addActionListener(e -> buttonActionClear());
			Dimension sizeOKButton = clearButton.getPreferredSize();
			clearButton.setBounds(tk.getScreenSize().width - 400 - sizeOKButton.width,tk.getScreenSize().height - 200, sizeOKButton.width, sizeOKButton.height);
			
		}
		
		{
			panel.add(textInfo);
			textInfo.setBounds(1000, 200, 400, 800);
			textInfo.setText("<html><body><b style='color:#FFFFFF'>Hej,<br> Välkommen till vårat spel! <br> Du hör en bil och ser ett ljus! <br> Vad gör du?</b>");

			Border  matteBorder = BorderFactory.createMatteBorder(1,3,5,7,  Color.BLUE);
			textInfo.setBorder(matteBorder);
		}
		
		{// ok button
			panel.add(okButton);
			okButton.addActionListener(e -> buttonAction());
			Dimension sizeOKButton = okButton.getPreferredSize();
			okButton.setBounds(tk.getScreenSize().width - 400,tk.getScreenSize().height - 200, sizeOKButton.width, sizeOKButton.height);
		}
		
		{ //close 
			panel.add(closeButton);
			closeButton.addActionListener(e -> buttonActionClose());
			closeButton.setMnemonic(KeyEvent.VK_C);
			Dimension size = closeButton.getPreferredSize();
			closeButton.setBounds(tk.getScreenSize().width - 200, 20, size.width, size.height);
		} // end of close
		
		{ // next
			contentPane.add(nextButton, BorderLayout.EAST);
			nextButton.addActionListener(e -> buttonActionNext());
			nextButton.setToolTipText("<html><body><b style='color:red;text-decoration:underline;'>N</b><b>ext</b></body></html>");
		} // end of next
		
		{// back
			contentPane.add(backButton, BorderLayout.WEST);
			backButton.addActionListener(e -> buttonActionBack());
			backButton.setBackground(Color.RED);
			Border  matteBorder = BorderFactory.createMatteBorder(1,3,5,7,  Color.BLUE);
			backButton.setBorder(matteBorder);
		}// end of back 
		
	}

	private void buttonActionClear() {
		textInfo.setText("<html><body>");

	}
	public void buttonActionNext() {
		nextButton.setText("<html><body><b style='color:red;text-decoration:underline;'>N</b><b>ext</b></body></html>"); 
		System.out.println("Next Button pressed!");	
		level++;
		if (level == 2) {
			panel.removeAll();
			panel.add(closeButton);
			panel.add(okButton);
			okButton.setText("BLuqsdchionshasiohioB");
			Dimension size = okButton.getPreferredSize();
			okButton.setSize(size);
			panel.repaint();
		} else if (level == 3) {
			panel.removeAll();
			panel.add(closeButton);
			panel.add(textInfo);
			panel.repaint();
		}
		
		
	}
	
	
	public void buttonActionBack() {
		
		System.out.println("Back Button pressed!");
	}
	public void buttonAction() {
		textInfo.setText(textInfo.getText() + "<b style='color:#FFFFFF;'> <br>Use key button pressed!</b>");
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