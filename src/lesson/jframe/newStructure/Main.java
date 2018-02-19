package lesson.jframe.newStructure;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main extends JFrame implements WindowListener {
	private Toolkit tk = Toolkit.getDefaultToolkit();
	private int screenWidth = tk.getScreenSize().width;
	private int screenHeight = tk.getScreenSize().height;
	
	public Main() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(this);
		this.setSize(screenWidth, screenHeight);
		this.setUndecorated(true);
		this.setOpacity(0.95f);
		Container contentPane = this.getContentPane();
		
		contentPane.setLayout(null);
		
		addButtons(contentPane);
	}

	public void addButtons(Container contentPane) {
		JButton closeButton = new JButton(
				"<html><body><b style='text-decoration: underline; color:orange;'>X</b></body></html>");
		closeButton.setMnemonic(KeyEvent.VK_X);
		//contentPane.add(closeButton, BorderLayout.SOUTH);
		closeButton.addActionListener(e -> buttonAction());
		
		Dimension size = closeButton.getPreferredSize();
		
		closeButton.setBounds(screenWidth - 20 - size.width, 20,
		             size.width, size.width);
		
		closeButton.setBackground(new Color(40, 40, 40));
		
		contentPane.add(closeButton);
		
		
	}

	public void buttonAction() {
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