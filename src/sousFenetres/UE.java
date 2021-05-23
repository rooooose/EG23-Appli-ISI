package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class UE extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UE frame = new UE();
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
	public UE() {
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(ColorPalette.BKD_NAVBAR2.getColor());
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("GESTION DES UE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}

}
