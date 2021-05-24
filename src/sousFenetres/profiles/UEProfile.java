package sousFenetres.profiles;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;
import sousFenetres.graphs.GraphEvEffectifs;
import sousFenetres.graphs.GraphEvResultats;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UEProfile extends JPanel {

	private JPanel contentPane;
	
	private JPanel panelBottom;
	private JPanel graphEvResultats = new GraphEvResultats();
	private JPanel graphEvEffectifs = new GraphEvEffectifs();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UEProfile frame = new UEProfile();
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
	public UEProfile() {
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		add(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {735};
		gbl_contentPane.rowHeights = new int[] {120, 40, 200};
		gbl_contentPane.columnWeights = new double[]{1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		contentPane.add(panelTop, gbc_panelTop);
		
		JLabel lblCategory = new JLabel("CS");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblUE = new JLabel("NF16 Bases de données");
		lblUE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblProf = new JLabel("Responsable : Sophie LORIETTE");
		lblProf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addGap(29)
					.addComponent(lblCategory, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblProf, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblUE, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTop.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTop.createSequentialGroup()
							.addComponent(lblUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblProf))
						.addComponent(lblCategory))
					.addGap(5))
		);
		panelTop.setLayout(gl_panelTop);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		FlowLayout flowLayout = (FlowLayout) panelCenter.getLayout();
		flowLayout.setHgap(10);
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		GridBagConstraints gbc_panelCenter = new GridBagConstraints();
		gbc_panelCenter.fill = GridBagConstraints.BOTH;
		gbc_panelCenter.insets = new Insets(0, 0, 5, 0);
		gbc_panelCenter.gridx = 0;
		gbc_panelCenter.gridy = 1;
		contentPane.add(panelCenter, gbc_panelCenter);
		
		JButton btnEvResults = new JButton("Evolution des résultats");
		btnEvResults.setBackground(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
		btnEvResults.setForeground(Color.WHITE);
		btnEvResults.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		panelCenter.add(btnEvResults);
		
		JButton btnEvEffectifs = new JButton("Evolution des effectifs");
		btnEvEffectifs.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		panelCenter.add(btnEvEffectifs);
		
		JPanel panelSpace = new JPanel();
		panelSpace.setPreferredSize(new Dimension(0, 12));
		panelCenter.add(panelSpace);
		
		panelBottom = new JPanel();
		panelBottom.setLayout(new CardLayout(0, 0));
		panelBottom.add(graphEvResultats, "name_443806163018900");
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.insets = new Insets(0, 0, 5, 0);
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 2;
		contentPane.add(panelBottom, gbc_panelBottom);
		
		////////////
		
		btnEvResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEvEffectifs.setBackground(new Color(240, 240, 240));
				btnEvEffectifs.setForeground(Color.BLACK);
				btnEvResults.setBackground(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
				btnEvResults.setForeground(Color.WHITE);
				
				panelBottom.removeAll();
				panelBottom.add(graphEvResultats);
				panelBottom.repaint();
				panelBottom.validate();
			}
		});
		btnEvEffectifs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEvResults.setBackground(new Color(240, 240, 240));
				btnEvResults.setForeground(Color.BLACK);
				btnEvEffectifs.setBackground(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
				btnEvEffectifs.setForeground(Color.WHITE);
				
				panelBottom.removeAll();
				panelBottom.add(graphEvEffectifs);
				panelBottom.repaint();
				panelBottom.validate();
			}
		});
	}
}
