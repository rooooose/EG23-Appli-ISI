package sousFenetres.graphs;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import elements.ColorPalette;
import sousFenetres.RepartitionEtudiants;

import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JSlider;
import java.awt.Dimension;

public class GraphEvResultats extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphEvResultats frame = new GraphEvResultats();
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
	public GraphEvResultats() {
		setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		
		JLabel lblGraph = new JLabel();
		lblGraph.setIcon(new ImageIcon(GraphEvResultats.class.getResource("/imgCamembert/results/cam0.png")));
		
		JLabel lblSemestre = new JLabel("Printemps 21");
		lblSemestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblSemestre.setForeground(ColorPalette.TLE_DEFAULT.getColor());
		lblSemestre.setFont(new Font("Raleway", Font.PLAIN, 24));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JLabel lblLeg = new JLabel();
		lblLeg.setIcon(new ImageIcon(GraphEvResultats.class.getResource("/imgCamembert/results/camLeg.png")));
		GroupLayout gl_panelCenter = new GroupLayout(panelCenter);
		gl_panelCenter.setHorizontalGroup(
			gl_panelCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(35)
					.addComponent(lblGraph)
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblSemestre)
						.addComponent(lblLeg, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
					.addGap(55))
		);
		gl_panelCenter.setVerticalGroup(
			gl_panelCenter.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelCenter.createSequentialGroup()
					.addGap(22)
					.addComponent(lblSemestre)
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(gl_panelCenter.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGraph)
						.addComponent(lblLeg, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
					.addGap(29))
		);
		panelCenter.setLayout(gl_panelCenter);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(Color.WHITE);
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		panelBottom.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		///SLIDER///
		JSlider slider = new JSlider();
		slider.setPreferredSize(new Dimension(600, 50));
		slider.setValue(19);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setBackground(null);
		slider.setToolTipText("");
		slider.addChangeListener(new ChangeListener() {
    		String[] arrTitles = generateTitles();
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
			    if (!source.getValueIsAdjusting()) {
			    	int tick = source.getValue();
			    	if (RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam"+tick+".png") != null && 
			    			RepartitionEtudiants.class.getResource("/imgCamembert/green/cam"+tick+".png") != null) {
				    	//System.out.println(tick);
			    		  //lblImg1.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/blue/cam"+tick+".png")));
			    		  //lblImg2.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/imgCamembert/green/cam"+tick+".png")));
			    		//System.out.println(Arrays.toString(arrTitles));
			    		  //lblTitle.setText(arrTitles[tick]);
					}
			    }
			}
		});
		slider.setMinimum(0);
		slider.setMaximum(19);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setForeground(Color.WHITE);
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
			lbl.setFont(new Font("Raleway Bold", Font.PLAIN, 12));
			lbl.setForeground(Color.BLACK);
			labels.put(k, lbl);
			k++;
			lbl = new JLabel("P"+String.valueOf(annee));
			lbl.setFont(new Font("Raleway Medium", Font.PLAIN, 11));
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
