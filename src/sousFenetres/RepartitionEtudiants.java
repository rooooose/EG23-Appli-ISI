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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import elements.ColorPalette;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;

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
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		
		JPanel panelBoard = new JPanel();
		panelBoard.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelBoard.setBackground(ColorPalette.BKD_PURPLE_VERY_LIGHT.getColor());
		panelBoard.setLayout(new CardLayout(60, 20));
		
		JPanel panelGraph = new JPanel();
		panelGraph.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelGraph.setBackground(ColorPalette.BKD_GRAY_VERY_LIGHT.getColor());
		panelBoard.add(panelGraph, "name_557470725796400");
		panelGraph.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		panelGraph.add(panelCenter, BorderLayout.NORTH);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(Color.WHITE);
		panelGraph.add(panelBottom, BorderLayout.SOUTH);
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
		contentPane.setLayout(gl_contentPane);
		
		//TITLE LABEL
		JLabel lblTitle = new JLabel("Semestre");
		lblTitle.setFont(new Font("Raleway", Font.PLAIN, 28));
		lblTitle.setForeground(ColorPalette.TLE_DEFAULT.getColor());
		
		///IMAGE 1///
		JLabel lblImg1 = new JLabel();
		URL urlObj1 = RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam1.png");
		lblImg1.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam0.png")));
		lblImg1.setForeground(Color.WHITE);
		lblImg1.setHorizontalAlignment(SwingConstants.CENTER);
		
		///IMAGE 2///
		JLabel lblImg2 = new JLabel();
		lblImg2.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/green/cam0.png")));
		lblImg2.setForeground(Color.WHITE);
		lblImg2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelCenter = new GroupLayout(panelCenter);
		gl_panelCenter.setHorizontalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCenter.createSequentialGroup()
							.addGap(33)
							.addComponent(lblImg1)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblImg2))
						.addGroup(gl_panelCenter.createSequentialGroup()
							.addGap(32)
							.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panelCenter.setVerticalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(35)
					.addComponent(lblTitle)
					.addGap(24)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImg2)
						.addComponent(lblImg1))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		panelCenter.setLayout(gl_panelCenter);
		
		///SLIDER///
		JSlider slider = new JSlider();
		slider.setPreferredSize(new Dimension(850, 100));
		slider.setValue(19);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setBackground(null);
		slider.addChangeListener(new ChangeListener() {
    		String[] arrTitles = generateTitles();
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
			    if (!source.getValueIsAdjusting()) {
			    	int tick = source.getValue();
			    	if (RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam"+tick+".png") != null && 
			    			RepartitionEtudiants.class.getResource("/imgCamembert/green/cam"+tick+".png") != null) {
				    	//System.out.println(tick);
			    		lblImg1.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam"+tick+".png")));
			    		lblImg2.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/green/cam"+tick+".png")));
			    		//System.out.println(Arrays.toString(arrTitles));
			    		lblTitle.setText(arrTitles[tick]);
					}
			    }
			}
		});
		slider.setMinimum(0);
		slider.setMaximum(19);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		//Slider Labels
		Hashtable<Integer, JLabel> labels = generateSliderTags();
		slider.setLabelTable(labels);
		slider.setPaintLabels(true);
		panelBottom.add(slider, "cell 1 0,alignx center,aligny top");
	}
	
	public Hashtable<Integer, JLabel> generateSliderTags() {
		Hashtable<Integer, JLabel> labels = new Hashtable<>();
		int annee = 12; int k = 0;
		JLabel lbl;
		while (annee<22) {
			lbl = new JLabel("A"+String.valueOf(annee));
			lbl.setFont(new Font("Raleway Bold", Font.PLAIN, 16));
			lbl.setForeground(Color.BLACK);
			labels.put(k, lbl);
			k++;
			lbl = new JLabel("P"+String.valueOf(annee));
			lbl.setFont(new Font("Raleway Medium", Font.PLAIN, 15));
			lbl.setForeground(Color.BLACK.brighter().brighter().brighter());
			labels.put(k, lbl);
			k++;
			annee++;
		}
		return labels;
	}
	
	public String[] generateTitles() {
		String arrTitles[] = new String[20];
		int annee = 12; int k = 0;
		while (annee<22) {
			arrTitles[k] = "Automne 20"+String.valueOf(annee);
			k++;
			arrTitles[k] = "Printemps 20"+String.valueOf(annee);
			k++;
			annee++;
		}
		return arrTitles;
	}
}
