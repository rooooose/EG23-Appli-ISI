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
import sousFenetres.graphs.GraphHeuresSup;

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
import javax.swing.ImageIcon;

public class EnseignantProfile extends JPanel {

	private JPanel contentPane;
	
	private JPanel panelBottom;
	private JPanel graphHeuresSup = new GraphHeuresSup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnseignantProfile frame = new EnseignantProfile();
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
	public EnseignantProfile() {
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		add(contentPane);
		contentPane.setLayout(new CardLayout(60, 0));
		
		JPanel panelBoard = new JPanel();
		panelBoard.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		contentPane.add(panelBoard);
		GridBagLayout gbl_panelBoard = new GridBagLayout();
		gbl_panelBoard.columnWidths = new int[] {735};
		gbl_panelBoard.rowHeights = new int[] {150, 40, 200};
		gbl_panelBoard.columnWeights = new double[]{1.0};
		gbl_panelBoard.rowWeights = new double[]{0.0, 0.0, 1.0};
		panelBoard.setLayout(gbl_panelBoard);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.fill = GridBagConstraints.BOTH;
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		panelBoard.add(panelTop, gbc_panelTop);
		
		JLabel lblUE = new JLabel("Jean-Pierre Pernault");
		lblUE.setForeground(ColorPalette.TLE_DEFAULT.getColor());
		lblUE.setFont(new Font("Raleway", Font.PLAIN, 28));
		
		JLabel lblProf = new JLabel("Maître des conférences");
		lblProf.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		lblProf.setFont(new Font("Raleway Medium", Font.PLAIN, 16));
		
		JPanel panelUE = new JPanel();
		panelUE.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		FlowLayout flowLayout_1 = (FlowLayout) panelUE.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelTop.add(panelUE);
		
		JPanel tagUE1 = new JPanel();
		tagUE1.setPreferredSize(new Dimension(58, 28));
		tagUE1.setLayout(null);
		tagUE1.setBackground(new Color(60, 60, 60));
		panelUE.add(tagUE1);
		
		JPanel tagBkd = new JPanel();
		tagBkd.setLayout(null);
		tagBkd.setBackground(SystemColor.scrollbar);
		tagBkd.setBounds(3, 3, 52, 22);
		tagUE1.add(tagBkd);
		
		JLabel lblCategory = new JLabel("EG23");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setForeground(new Color(60, 60, 60));
		lblCategory.setFont(new Font("Raleway", Font.PLAIN, 14));
		lblCategory.setBounds(0, 0, 52, 24);
		tagBkd.add(lblCategory);
		
		JPanel panel = new JPanel();
		panel.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUE, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
						.addComponent(lblProf, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
						.addGroup(gl_panelTop.createSequentialGroup()
							.addComponent(panelUE, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
							.addGap(7)))
					.addContainerGap())
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelTop.createSequentialGroup()
							.addComponent(lblUE)
							.addGap(8)
							.addComponent(lblProf)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panelUE, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JLabel lblPhoto = new JLabel("");
		lblPhoto.setIcon(new ImageIcon(EnseignantProfile.class.getResource("/icons/menu/white/photo_default_x100.png")));
		panel.add(lblPhoto);
		
		JPanel tagUE2 = new JPanel();
		tagUE2.setLayout(null);
		tagUE2.setPreferredSize(new Dimension(58, 28));
		tagUE2.setBackground(new Color(60, 60, 60));
		panelUE.add(tagUE2);
		
		JPanel tagBkd_1 = new JPanel();
		tagBkd_1.setLayout(null);
		tagBkd_1.setBackground(SystemColor.scrollbar);
		tagBkd_1.setBounds(3, 3, 52, 22);
		tagUE2.add(tagBkd_1);
		
		JLabel lblLo = new JLabel("LO02");
		lblLo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLo.setForeground(new Color(60, 60, 60));
		lblLo.setFont(new Font("Raleway", Font.PLAIN, 14));
		lblLo.setBounds(0, 0, 52, 24);
		tagBkd_1.add(lblLo);
		panelTop.setLayout(gl_panelTop);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		FlowLayout flowLayout = (FlowLayout) panelCenter.getLayout();
		flowLayout.setHgap(10);
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panelCenter = new GridBagConstraints();
		gbc_panelCenter.fill = GridBagConstraints.BOTH;
		gbc_panelCenter.insets = new Insets(0, 0, 5, 0);
		gbc_panelCenter.gridx = 0;
		gbc_panelCenter.gridy = 1;
		panelBoard.add(panelCenter, gbc_panelCenter);
		
		JPanel panelSpace = new JPanel();
		panelSpace.setPreferredSize(new Dimension(0, 12));
		panelCenter.add(panelSpace);
		
		JLabel lblArrivalLabel = new JLabel("Enseigne en ISI depuis le :");
		lblArrivalLabel.setPreferredSize(new Dimension(179, 18));
		lblArrivalLabel.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		lblArrivalLabel.setFont(new Font("Raleway Medium", Font.PLAIN, 14));
		panelCenter.add(lblArrivalLabel);
		
		JLabel lblArrivalDate = new JLabel("26 juin 2001");
		lblArrivalDate.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		lblArrivalDate.setFont(new Font("Raleway", Font.PLAIN, 15));
		panelCenter.add(lblArrivalDate);
		
		panelBottom = new JPanel();
		panelBottom.setLayout(new CardLayout(0, 0));
		CardLayout cardLayout_0 = (CardLayout) graphHeuresSup.getLayout();
		cardLayout_0.setVgap(5);
		cardLayout_0.setHgap(15);
		panelBottom.add(graphHeuresSup);
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.insets = new Insets(0, 0, 5, 0);
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 2;
		panelBoard.add(panelBottom, gbc_panelBottom);
	}
}
