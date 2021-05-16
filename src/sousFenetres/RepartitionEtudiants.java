package sousFenetres;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(106, 90, 205));
		add(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImg = new JLabel("REPARTITION DES ETUDIANTS DANS LE PARCOURS");
		lblImg.setBounds(10, 55, 499, 521);
		lblImg.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/blue/cam1.png")));
		lblImg.setForeground(Color.WHITE);
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImg);
		
		JSlider slider = new JSlider();
		slider.setToolTipText("");
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
			    if (!source.getValueIsAdjusting()) {
			    	int tick = source.getValue();
			    	//System.out.println(tick);
			    	if (RepartitionEtudiants.class.getResource("/img-camembert/blue/cam"+tick+".png") != null) {
			    		lblImg.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/blue/cam"+tick+".png")));
					}
			    }
			}
		});
		slider.setMaximum(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setBounds(270, 621, 454, 45);
		contentPane.add(slider);
	}
}
