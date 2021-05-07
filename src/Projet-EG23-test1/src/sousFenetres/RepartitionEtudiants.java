package sousFenetres;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class RepartitionEtudiants extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RepartitionEtudiants frame = new RepartitionEtudiants();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RepartitionEtudiants() {
		setBackground(Color.RED);
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
