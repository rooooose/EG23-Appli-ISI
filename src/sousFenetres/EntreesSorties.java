package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;

public class EntreesSorties extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreesSorties frame = new EntreesSorties();
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
	public EntreesSorties() {
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(ColorPalette.BKD_NAVBAR4.getColor());
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("STATISTIQUES SUR LES ENTREES/SORTIES");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}

}
