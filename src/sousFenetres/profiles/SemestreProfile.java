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
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class SemestreProfile extends JPanel {
	private JPanel table1;
	private JPanel table2;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblM;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	
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
		table1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelBottom.add(table1);
		table1.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		

		ToolTipManager.sharedInstance().setInitialDelay(0);
		UIManager.put("ToolTip.background", Color.WHITE);
		table1.setLayout(new GridLayout(2, 1, 0, 0));
		Border borderBlack = BorderFactory.createLineBorder(Color.BLACK);
		UIManager.put("ToolTip.foreground", Color.BLACK);
		
		lblNewLabel = new JLabel("CS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table1.add(lblNewLabel);
		lblNewLabel.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblM = new JLabel("TM");
		lblM.setHorizontalAlignment(SwingConstants.CENTER);
		lblM.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table1.add(lblM);
		lblM.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_2 = new JLabel("ME");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table1.add(lblNewLabel_2);
		lblNewLabel_2.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_4 = new JLabel("CT");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table1.add(lblNewLabel_4);
		lblNewLabel_4.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_1 = new JLabel("4/12");
		lblNewLabel_1.setToolTipText("-1CS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("Raleway", Font.PLAIN, 15));
		table1.add(lblNewLabel_1);
		
		lblNewLabel_21 = new JLabel("6/12");
		lblNewLabel_21.setToolTipText("-1CS");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setForeground(new Color(178, 34, 34));
		lblNewLabel_21.setFont(new Font("Raleway", Font.PLAIN, 15));
		table1.add(lblNewLabel_21);
		
		lblNewLabel_3 = new JLabel("7/6");
		lblNewLabel_3.setToolTipText("+1CS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Raleway", Font.PLAIN, 15));
		table1.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("2/6");
		lblNewLabel_5.setToolTipText("+0CS");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Raleway", Font.PLAIN, 15));
		table1.add(lblNewLabel_5);
		
		panelBottom.add(Box.createRigidArea(new Dimension(0, 50)));
		
		table2 = new JPanel();
		table2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelBottom.add(table2);
		table2.setLayout(new GridLayout(4,5));
		table2.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		
		lblNewLabel_12 = new JLabel("CS");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_12);
		lblNewLabel_12.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_13 = new JLabel("TM");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_13);
		lblNewLabel_13.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_14 = new JLabel("ME");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_14);
		lblNewLabel_14.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_20 = new JLabel("CT");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_20);
		lblNewLabel_20.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_22 = new JLabel("NPML");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Raleway SemiBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_22);
		lblNewLabel_22.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
		
		lblNewLabel_15 = new JLabel("GL02 A");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(new Color(14, 100, 161));
		lblNewLabel_15.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_15);
		
		lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_28);
		
		lblNewLabel_16 = new JLabel("GE21 B");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setForeground(new Color(9, 64, 103));
		lblNewLabel_16.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_16);
		
		lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_25);
		
		lblNewLabel_17 = new JLabel("Valid\u00E9");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("IF02A A");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setForeground(new Color(14, 100, 161));
		lblNewLabel_18.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 15));
		table2.add(lblNewLabel_18);
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_26);
		
		lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_24);
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_23);
		
		lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_27);
		
		lblNewLabel_19 = new JLabel("LO02 C");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_19);
		
		lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setFont(new Font("Raleway", Font.PLAIN, 15));
		table2.add(lblNewLabel_29);
		


	}
}
