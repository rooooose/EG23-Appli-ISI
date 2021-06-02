package sousFenetres.graphs;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;
import javax.swing.ImageIcon;

public class GraphEvEffectifs extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphEvEffectifs frame = new GraphEvEffectifs();
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
	public GraphEvEffectifs() {
		setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGraph = new JLabel("");
		lblGraph.setIcon(new ImageIcon(GraphEvEffectifs.class.getResource("/imgGraphOthers/GraphEffectifs.png")));
		lblGraph.setForeground(Color.LIGHT_GRAY);
		lblGraph.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblGraph);
	}

}
