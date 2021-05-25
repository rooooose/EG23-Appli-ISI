package sousFenetres.profiles;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

public class SemestreProfile extends JPanel {
	private JPanel table1;
	private JPanel table2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_9;
	
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
		
		JPanel panelBoard = new JPanel();
		contentPane.add(panelBoard, "name_10584365765800");
		GridBagLayout gbl_panelBoard = new GridBagLayout();
		gbl_panelBoard.columnWidths = new int[]{0, 0};
		gbl_panelBoard.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelBoard.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBoard.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		panelBoard.setLayout(gbl_panelBoard);
		
		JPanel panelTop = new JPanel();
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.fill = GridBagConstraints.BOTH;
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		panelBoard.add(panelTop, gbc_panelTop);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(SemestreProfile.class.getResource("/icons/menu/white/photo_default_x100.png")));
		
		JLabel lblNewLabel_7 = new JLabel("Vincent Florent");
		lblNewLabel_7.setForeground(Color.GRAY);
		lblNewLabel_7.setFont(new Font("Raleway", Font.PLAIN, 28));
		
		JLabel lblNewLabel_8 = new JLabel("ISI4");
		Border border = BorderFactory.createCompoundBorder(
		        BorderFactory.createLineBorder(Color.CYAN), 
		        BorderFactory.createEmptyBorder(5, 8, 5, 8));
		lblNewLabel_8.setBorder(border);
		
		lblNewLabel_8.setFont(new Font("Raleway", Font.PLAIN, 15));
		
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
					.addContainerGap())
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
		
		JPanel panelBottom = new JPanel();
		GridBagConstraints gbc_panelBottom = new GridBagConstraints();
		gbc_panelBottom.insets = new Insets(0, 0, 5, 0);
		gbc_panelBottom.fill = GridBagConstraints.BOTH;
		gbc_panelBottom.gridx = 0;
		gbc_panelBottom.gridy = 1;
		panelBoard.add(panelBottom, gbc_panelBottom);
		GridBagLayout gbl_panelBottom = new GridBagLayout();
		gbl_panelBottom.columnWidths = new int[]{0};
		gbl_panelBottom.rowHeights = new int[]{0, 0};
		gbl_panelBottom.columnWeights = new double[]{1.0};
		gbl_panelBottom.rowWeights = new double[]{1.0, 1.0};
		panelBottom.setLayout(gbl_panelBottom);
		
		table1 = new JPanel();
		GridBagConstraints gbc_table1 = new GridBagConstraints();
		gbc_table1.insets = new Insets(0, 0, 5, 0);
		gbc_table1.fill = GridBagConstraints.BOTH;
		gbc_table1.gridx = 0;
		gbc_table1.gridy = 0;
		panelBottom.add(table1, gbc_table1);
		GridBagLayout gbl_table1 = new GridBagLayout();
		gbl_table1.columnWidths = new int[]{45, 0};
		gbl_table1.rowHeights = new int[]{13, 0, 0, 0};
		gbl_table1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_table1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		table1.setLayout(gbl_table1);
		
		lblNewLabel = new JLabel("CS/TM");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		table1.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("4/12");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		table1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("ME");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		table1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("7/6");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		table1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("CT");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 0;
		table1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("2/6");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 1;
		table1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		table2 = new JPanel();
		GridBagConstraints gbc_table2 = new GridBagConstraints();
		gbc_table2.fill = GridBagConstraints.BOTH;
		gbc_table2.gridx = 0;
		gbc_table2.gridy = 1;
		panelBottom.add(table2, gbc_table2);
		GridBagLayout gbl_table2 = new GridBagLayout();
		gbl_table2.columnWidths = new int[]{0};
		gbl_table2.rowHeights = new int[]{0};
		gbl_table2.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_table2.rowWeights = new double[]{Double.MIN_VALUE};
		table2.setLayout(gbl_table2);


	}
}
