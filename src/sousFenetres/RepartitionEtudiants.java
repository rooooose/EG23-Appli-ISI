package sousFenetres;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

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
		contentPane.setBackground(new Color(106, 90, 205).brighter());
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTop = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTop.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelTop.setBackground(contentPane.getBackground());
		contentPane.add(panelTop, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(contentPane.getBackground());
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(contentPane.getBackground());
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		panelBottom.setLayout(new MigLayout("", "[200px,left][800px,grow,fill][200px,right]", "[44px]"));
		
		//TITLE LABEL
		JLabel lblTitle = new JLabel("Semestre");
		lblTitle.setFont(new Font("Raleway", Font.PLAIN, 22));
		panelTop.add(lblTitle);
		
		///IMAGE 1///
		JLabel lblImg1 = new JLabel();
		lblImg1.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/blue/cam1.png")));
		lblImg1.setForeground(Color.WHITE);
		lblImg1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenter.add(lblImg1);
		
		///IMAGE 2///
		JLabel lblImg2 = new JLabel();
		lblImg2.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/green/cam1.png")));
		lblImg2.setForeground(Color.WHITE);
		lblImg2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenter.add(lblImg2);
		
		///SLIDER///
		JSlider slider = new JSlider();
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		slider.setBackground(null);
		slider.setToolTipText("");
		slider.addChangeListener(new ChangeListener() {
    		String[] arrTitles = generateTitles();
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
			    if (!source.getValueIsAdjusting()) {
			    	int tick = source.getValue();
			    	if (RepartitionEtudiants.class.getResource("/img-camembert/blue/cam"+tick+".png") != null && 
			    			RepartitionEtudiants.class.getResource("/img-camembert/green/cam"+tick+".png") != null) {
				    	//System.out.println(tick);
			    		lblImg1.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/blue/cam"+tick+".png")));
			    		lblImg2.setIcon(new ImageIcon(RepartitionEtudiants.class.getResource("/img-camembert/green/cam"+tick+".png")));
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
			lbl.setForeground(Color.WHITE);
			labels.put(k, lbl);
			k++;
			lbl = new JLabel("P"+String.valueOf(annee));
			lbl.setForeground(Color.GRAY.brighter());
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
			arrTitles[k] = "Automne "+String.valueOf(annee);
			k++;
			arrTitles[k] = "Printemps "+String.valueOf(annee);
			k++;
			annee++;
		}
		return arrTitles;
	}
}
