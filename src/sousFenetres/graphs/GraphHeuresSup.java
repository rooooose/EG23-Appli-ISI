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
import java.awt.FlowLayout;

public class GraphHeuresSup extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphHeuresSup frame = new GraphHeuresSup();
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
	public GraphHeuresSup() {
		setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelGraph = new JPanel();
		panelGraph.setBackground(Color.WHITE);
		contentPane.add(panelGraph, BorderLayout.CENTER);
		FlowLayout fl_panelGraph = new FlowLayout(FlowLayout.CENTER, 60, 0);
		panelGraph.setLayout(fl_panelGraph);
		
		JLabel lblGraphBar = new JLabel("");
		lblGraphBar.setIcon(new ImageIcon(GraphHeuresSup.class.getResource("/imgGraphOthers/GraphBar.png")));
		lblGraphBar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraphBar.setForeground(Color.LIGHT_GRAY);
		panelGraph.add(lblGraphBar);
	}

}
