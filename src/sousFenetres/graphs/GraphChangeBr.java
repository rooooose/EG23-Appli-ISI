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
import java.awt.Font;

public class GraphChangeBr extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphChangeBr frame = new GraphChangeBr();
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
	public GraphChangeBr() {
		setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelGraph = new JPanel();
		panelGraph.setBackground(Color.WHITE);
		contentPane.add(panelGraph, BorderLayout.CENTER);
		panelGraph.setLayout(new CardLayout(0, 0));
		
		JLabel lblGraphBar = new JLabel("");
		lblGraphBar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGraphBar.setIcon(new ImageIcon(GraphChangeBr.class.getResource("/imgGraphOthers/GrapheChangementsBranche_small.png")));
		lblGraphBar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraphBar.setForeground(Color.LIGHT_GRAY);
		panelGraph.add(lblGraphBar, "name_727069137798200");
	}

}
