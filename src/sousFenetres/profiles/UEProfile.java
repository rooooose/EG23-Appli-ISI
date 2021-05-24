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
		contentPane.setLayout(new CardLayout(60, 0));
		
		JPanel panelBoard = new JPanel();
		panelBoard.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		contentPane.add(panelBoard, "name_460935948811300");
		GridBagLayout gbl_panelBoard = new GridBagLayout();
		gbl_panelBoard.columnWidths = new int[] {735};
		gbl_panelBoard.rowHeights = new int[] {120, 40, 200};
		gbl_panelBoard.columnWeights = new double[]{1.0};
		gbl_panelBoard.rowWeights = new double[]{0.0, 0.0, 1.0};
		panelBoard.setLayout(gbl_panelBoard);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		panelBoard.add(panelTop, gbc_panelTop);
		
		JLabel lblUE = new JLabel("NF16 - Bases de données");
		lblUE.setForeground(ColorPalette.TLE_DEFAULT.getColor());
		lblUE.setFont(new Font("Raleway", Font.PLAIN, 28));
		
		JLabel lblProf = new JLabel("Responsable : Sophie LORIETTE");
		lblProf.setForeground(ColorPalette.BKD_NAVBAR2.getColor());
		lblProf.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		
		JPanel tagBorder = new JPanel();
		tagBorder.setBackground(ColorPalette.TLE_DEFAULT.getColor());
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addGap(25)
					.addComponent(tagBorder, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblProf, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblUE, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelTop.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTop.createSequentialGroup()
							.addComponent(lblUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblProf))
						.addComponent(tagBorder, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addGap(14))
		);
		tagBorder.setLayout(null);
		
		JPanel tagBkd = new JPanel();
		tagBkd.setBackground(ColorPalette.TLE_GRAY_LIGHT.getColor());
		tagBkd.setBounds(3, 3, 89, 58);
		tagBorder.add(tagBkd);
		tagBkd.setLayout(null);
		
		JLabel lblCategory = new JLabel("CS");
		lblCategory.setBounds(18, 9, 53, 38);
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setForeground(new Color(60, 60, 60));
		lblCategory.setFont(new Font("Raleway", Font.PLAIN, 32));
		tagBkd.add(lblCategory);
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
		panelBoard.add(panelCenter, gbc_panelCenter);
		
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
		CardLayout cardLayout_0 = (CardLayout) graphEvResultats.getLayout();
		cardLayout_0.setVgap(5);
		cardLayout_0.setHgap(15);
		CardLayout cardLayout_1 = (CardLayout) graphEvEffectifs.getLayout();
		cardLayout_1.setVgap(5);
		cardLayout_1.setHgap(15);
		panelBottom.add(graphEvResultats, "name_443806163018900");
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.insets = new Insets(0, 0, 5, 0);
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 2;
		panelBoard.add(panelBottom, gbc_panelBottom);
		
		////////////
		
		btnEvResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEvEffectifs.setBackground(new Color(240, 240, 240));
				btnEvEffectifs.setForeground(ColorPalette.TLE_DEFAULT.getColor());
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
				btnEvResults.setForeground(ColorPalette.TLE_DEFAULT.getColor());
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
