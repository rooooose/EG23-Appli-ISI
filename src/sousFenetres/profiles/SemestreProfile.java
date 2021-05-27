package sousFenetres.profiles;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

import elements.ColorPalette;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class SemestreProfile extends JPanel {
	private JPanel table1;
	private JPanel table2;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JPanel headerPanel;
	private JPanel contentPanel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JPanel headerPanel_1;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JPanel contentPanel_1;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	
//	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemestreProfile frame = new SemestreProfile();
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
	public SemestreProfile() {
		
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		add(contentPane);
		contentPane.setLayout(new CardLayout(60, 0));
		contentPane.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		JPanel panelBoard = new JPanel();
		contentPane.add(panelBoard, "name_10584365765800");
		panelBoard.setLayout(new BoxLayout(panelBoard, BoxLayout.Y_AXIS));
		panelBoard.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		JPanel panelTop = new JPanel();
		panelBoard.add(panelTop);
		panelTop.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(SemestreProfile.class.getResource("/icons/menu/white/photo_default_x100.png")));
		
		JLabel lblNewLabel_7 = new JLabel("Vincent Florent");
		lblNewLabel_7.setForeground(Color.GRAY);
		lblNewLabel_7.setFont(new Font("Raleway", Font.PLAIN, 28));
		
		JLabel lblNewLabel_8 = new JLabel("ISI4");
		Border border = BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(ColorPalette.BKD_NAVBAR0.getColor()), 
		        BorderFactory.createEmptyBorder(5, 8, 5, 8));
		lblNewLabel_8.setBorder(border);
		
		lblNewLabel_8.setFont(new Font("Raleway", Font.PLAIN, 15));
		lblNewLabel_8.setForeground(ColorPalette.BKD_NAVBAR0.getColor());
		lblNewLabel_8.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		lblNewLabel_8.setOpaque(true);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(SemestreProfile.class.getResource("/icons/critique.png")));
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250,250))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addGroup(gl_panelTop.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelTop.createSequentialGroup()
							.addGap(21)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_panelTop.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_panelTop.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_9))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_8)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panelTop.setLayout(gl_panelTop);
		panelTop.setPreferredSize(new Dimension(350, 70));
		
		JPanel panelBottom = new JPanel();
		panelBoard.add(panelBottom);
		panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.Y_AXIS));
		panelBottom.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		table1 = new JPanel();
		panelBottom.add(table1);
		

		ToolTipManager.sharedInstance().setInitialDelay(0);
		UIManager.put("ToolTip.background", Color.WHITE);
		table1.setLayout(new BoxLayout(table1, BoxLayout.Y_AXIS));
		
		headerPanel = new JPanel();
		headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 0));
		table1.add(headerPanel);
		Border borderBlack = BorderFactory.createLineBorder(Color.BLACK);
		headerPanel.setBorder(borderBlack);
		headerPanel.setPreferredSize(new Dimension(350, -70));
		headerPanel.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		lblNewLabel = new JLabel("CS/TM");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("ME");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("CT");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel.add(lblNewLabel_4);
		
		contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 0));
		table1.add(contentPanel);
		contentPanel.setBorder(borderBlack);
		contentPanel.setPreferredSize(new Dimension(350, -70));
		contentPanel.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		lblNewLabel_1 = new JLabel("4/12");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setToolTipText("-1CS");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Raleway", Font.PLAIN, 15));
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("7/6");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setToolTipText("+1CS");
		
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Raleway", Font.PLAIN, 15));
		contentPanel.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("2/6");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		UIManager.put("ToolTip.foreground", Color.BLACK);
		lblNewLabel_5.setToolTipText("+0CS");
		lblNewLabel_5.setFont(new Font("Raleway", Font.PLAIN, 15));
		contentPanel.add(lblNewLabel_5);
		
		panelBottom.add(Box.createRigidArea(new Dimension(0, 50)));
		
		table2 = new JPanel();
		panelBottom.add(table2);
		table2.setLayout(new BoxLayout(table2, BoxLayout.Y_AXIS));
		
		
		headerPanel_1 = new JPanel();
		table2.add(headerPanel_1);
		headerPanel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		headerPanel_1.setBorder(borderBlack);
		headerPanel_1.setPreferredSize(new Dimension(350, -60));
		headerPanel_1.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		lblNewLabel_12 = new JLabel("CS");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel_1.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("TM");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel_1.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("ME");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel_1.add(lblNewLabel_14);
		
		lblNewLabel_20 = new JLabel("CT");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Raleway", Font.PLAIN, 15));
		headerPanel_1.add(lblNewLabel_20);
		
		contentPanel_1 = new JPanel();
		table2.add(contentPanel_1);
		contentPanel_1.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
//		contentPanel_1.setPreferredSize(new Dimension(350, -10));
		
		lblNewLabel_15 = new JLabel("GL02 A");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		lblNewLabel_15.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		
		lblNewLabel_16 = new JLabel("GE21 B");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setForeground(ColorPalette.BKD_NAVBAR0.getColor());
		lblNewLabel_16.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		
		lblNewLabel_17 = new JLabel("Validé");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Raleway", Font.PLAIN, 15));
		
		lblNewLabel_18 = new JLabel("IF02A A");
		lblNewLabel_18.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_18.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		
		lblNewLabel_19 = new JLabel("LO02 C");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Raleway", Font.PLAIN, 15));
		GroupLayout gl_contentPanel_1 = new GroupLayout(contentPanel_1);
		gl_contentPanel_1.setHorizontalGroup(
			gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel_1.createSequentialGroup()
					.addGap(117)
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGap(163)
							.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, 150))
		);
		gl_contentPanel_1.setVerticalGroup(
			gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel_1.createSequentialGroup()
					.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_16)
							.addComponent(lblNewLabel_17))
						.addGroup(gl_contentPanel_1.createSequentialGroup()
							.addComponent(lblNewLabel_15)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_18)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_19)))
					.addContainerGap())
		);
		contentPanel_1.setLayout(gl_contentPanel_1);
		contentPanel_1.setBorder(borderBlack);
		


	}
}
