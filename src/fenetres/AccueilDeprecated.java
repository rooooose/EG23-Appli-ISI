package fenetres;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AccueilDeprecated {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccueilDeprecated window = new AccueilDeprecated();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccueilDeprecated() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/Fichier 3.png")));
		
//		ImageIcon myImage = new ImageIcon(Accueil.class.getResource("/img/entrees-sorties.png"));
//		Image img = myImage.getImage();
//		Image newImg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
//		ImageIcon image = new ImageIcon(newImg);
//		lblNewLabel.setIcon(image);
		lblNewLabel.setBounds(36, 106, 107, 89);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/Fichier 6.png")));
		lblNewLabel_1.setBounds(143, 146, 65, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/Fichier 7.png")));
		lblNewLabel_2.setBounds(218, 146, 73, 59);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/Fichier 8.png")));
		lblNewLabel_3.setBounds(273, 54, 65, 76);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/Fichier 9.png")));
		lblNewLabel_4.setBounds(301, 157, 107, 96);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(AccueilDeprecated.class.getResource("/img/logo_UTT_petit.png")));
		lblNewLabel_1_1.setBounds(0, 0, 248, 96);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
