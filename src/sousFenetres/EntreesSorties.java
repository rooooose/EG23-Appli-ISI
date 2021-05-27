package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.net.URL;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import elements.ColorPalette;
import net.miginfocom.swing.MigLayout;
import sousFenetres.graphs.GraphChangeBr;
import sousFenetres.graphs.GraphStatsGlob;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntreesSorties extends JPanel {

	private JPanel contentPane;
	
	private GraphStatsGlob graphStatsGlob = new GraphStatsGlob();
	private GraphChangeBr graphChangeBr = new GraphChangeBr();

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
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		
		JPanel panelBoard = new JPanel();
		panelBoard.setBackground(ColorPalette.BKD_NAVBAR4_LIGHT.getColor());
		panelBoard.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JPanel panelInnerBoard = new JPanel();
		panelInnerBoard.setBackground(ColorPalette.BKD_GRAY_VERY_LIGHT.getColor());
		panelInnerBoard.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(ColorPalette.BKD_NAVBAR4_LIGHT.getColor());
		FlowLayout flowLayout = (FlowLayout) panelTop.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelInnerBoard.add(panelTop, BorderLayout.NORTH);
		
		JButton btnStats = new JButton("Statistiques Globales");
		btnStats.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		btnStats.setForeground(Color.WHITE);
		btnStats.setBackground(ColorPalette.BKD_NAVBAR4_LIGHT.getColor());
		panelTop.add(btnStats);
		
		JButton btnChange = new JButton("Changements de branche");
		btnChange.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		panelTop.add(btnChange);
		
		JPanel panelGraph = new JPanel();
		panelGraph.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelGraph.setBackground(Color.WHITE);
		panelGraph.setLayout(new CardLayout(0, 0));
		panelGraph.add(graphStatsGlob, "name_728031369821300");
		
		panelInnerBoard.add(panelGraph, BorderLayout.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addComponent(panelBoard, GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panelBoard, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
					.addGap(36))
		);
		GroupLayout gl_panelBoard = new GroupLayout(panelBoard);
		gl_panelBoard.setHorizontalGroup(
			gl_panelBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBoard.createSequentialGroup()
					.addGap(60)
					.addComponent(panelInnerBoard, GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
					.addGap(60))
		);
		gl_panelBoard.setVerticalGroup(
			gl_panelBoard.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBoard.createSequentialGroup()
					.addGap(20)
					.addComponent(panelInnerBoard, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
					.addGap(20))
		);
		panelBoard.setLayout(gl_panelBoard);
		contentPane.setLayout(gl_contentPane);
		

		btnStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnChange.setBackground(ColorPalette.BKD_DEFAULT.getColor());
				btnChange.setForeground(Color.BLACK);
				
				btnStats.setBackground(ColorPalette.BKD_NAVBAR4_LIGHT.getColor());
				btnStats.setForeground(Color.WHITE);
				
				panelGraph.removeAll();
				panelGraph.add(graphStatsGlob);
				panelGraph.repaint();
				panelGraph.validate();
			}
		});
		btnChange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnStats.setBackground(ColorPalette.BKD_DEFAULT.getColor());
				btnStats.setForeground(Color.BLACK);
				
				btnChange.setBackground(ColorPalette.BKD_NAVBAR4_LIGHT.getColor());
				btnChange.setForeground(Color.WHITE);
				
				panelGraph.removeAll();
				panelGraph.add(graphChangeBr);
				panelGraph.repaint();
				panelGraph.validate();
			}
		});
	}
}