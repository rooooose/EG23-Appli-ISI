package sousFenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import net.miginfocom.swing.MigLayout;
import sousFenetres.profiles.SemestreProfile;
import sousFenetres.profiles.UEProfile;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import elements.ColorPalette;

import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;

public class SemestreEnCours extends JPanel {

	private JPanel contentPane;
	private JPanel panelRequest;
	private JTextField searchBar;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JPanel panelResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemestreEnCours frame = new SemestreEnCours();
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
	public SemestreEnCours() {
		//setBounds(100, 100, 450, 300);
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		add(contentPane);
		
		//////////////////////////////////////////
		
		JPanel panelRequest = new JPanel();
		panelRequest.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		searchBar = new JTextField();
		searchBar.setForeground(ColorPalette.TLE_BRANCHE.getColor());
		searchBar.setHorizontalAlignment(SwingConstants.CENTER);
		searchBar.setCaretColor(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
		searchBar.setFont(new Font("Raleway Medium", Font.BOLD, 18));
		searchBar.setColumns(10);
		
		JComboBox cbBxCategory = new JComboBox();
		cbBxCategory.setForeground(Color.WHITE);
		cbBxCategory.setBackground(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
		cbBxCategory.setName("");
		cbBxCategory.setToolTipText("Catégorie");
		cbBxCategory.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxCategory.setModel(new DefaultComboBoxModel(new String[] {"Catégorie", "CS", "TM", "ME", "HT", "CT"}));
		((JLabel) cbBxCategory.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			lblSearch.setIcon(new ImageIcon(UE.class.getResource("/icons/menu/white/search.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			lblSearch.setIcon(new ImageIcon(UE.class.getResource("/icons/menu/search.png")));
			}
		});
		lblSearch.setIcon(new ImageIcon(UE.class.getResource("/icons/menu/search.png")));
		
		GroupLayout gl_panelRequest = new GroupLayout(panelRequest);
		gl_panelRequest.setHorizontalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panelRequest.createSequentialGroup()
			.addGap(11)
			.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
			.addGap(15)
			.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
			.addGap(108)
			.addComponent(cbBxCategory, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
			.addContainerGap(536, Short.MAX_VALUE))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.TRAILING)
			.addGroup(Alignment.LEADING, gl_panelRequest.createSequentialGroup()
			.addGap(9)
			.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
			.addComponent(cbBxCategory, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
			.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
			.addGap(8))
			.addGroup(Alignment.LEADING, gl_panelRequest.createSequentialGroup()
			.addGap(13)
			.addComponent(lblSearch)
			.addContainerGap(13, Short.MAX_VALUE))
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
//		requestPanel = new JPanel();
//		
//		textField = new JTextField();
//		textField.setColumns(10);
//		GroupLayout gl_requestPanel = new GroupLayout(requestPanel);
//		gl_requestPanel.setHorizontalGroup(
//			gl_requestPanel.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_requestPanel.createSequentialGroup()
//					.addContainerGap()
//					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(167, Short.MAX_VALUE))
//		);
//		gl_requestPanel.setVerticalGroup(
//			gl_requestPanel.createParallelGroup(Alignment.LEADING)
//				.addGroup(Alignment.TRAILING, gl_requestPanel.createSequentialGroup()
//					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//		);
//		requestPanel.setLayout(gl_requestPanel);
		
//		GroupLayout gl_contentPane = new GroupLayout(contentPane);
//		gl_contentPane.setHorizontalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addComponent(panelRequest, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
//		);
//		gl_contentPane.setVerticalGroup(
//			gl_contentPane.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_contentPane.createSequentialGroup()
//					.addGap(270)
//					.addComponent(panelRequest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//		);
//		contentPane.setLayout(gl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(1.0);
		splitPane.setDividerLocation(0.1);
		splitPane.setContinuousLayout(true);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(splitPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
						.addComponent(panelRequest, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1128, Short.MAX_VALUE))
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panelRequest, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
					.addGap(36))
		);
		contentPane.setLayout(gl_contentPane);
		
		
		panelResult = new JPanel();
		
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
		SemestreProfile panelProfile = new SemestreProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
	}

//	panel = new JPanel();
//	panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//	
//	panel_2 = new JPanel();
//	panel.add(panel_2);
//	panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
//	
//	panel_3 = new JPanel();
//	panel_2.add(panel_3);
//	GridBagLayout gbl_panel_3 = new GridBagLayout();
//	gbl_panel_3.columnWidths = new int[]{150, 150, 150, 0};
//	gbl_panel_3.rowHeights = new int[]{0, 13, 0};
//	gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
//	gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
//	panel_3.setLayout(gbl_panel_3);
//	
//	lblNewLabel_3 = new JLabel("CS/TM");
//	GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
//	gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
//	gbc_lblNewLabel_3.gridx = 0;
//	gbc_lblNewLabel_3.gridy = 0;
//	panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
//	
//	lblNewLabel_4 = new JLabel("ME");
//	GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
//	gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
//	gbc_lblNewLabel_4.gridx = 1;
//	gbc_lblNewLabel_4.gridy = 0;
//	panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
//	
//	lblNewLabel_5 = new JLabel("CT");
//	GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
//	gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
//	gbc_lblNewLabel_5.gridx = 2;
//	gbc_lblNewLabel_5.gridy = 0;
//	panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
//	
//	lblNewLabel = new JLabel("4/12");
//	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//	GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
//	gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
//	gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
//	gbc_lblNewLabel.gridx = 0;
//	gbc_lblNewLabel.gridy = 1;
//	panel_3.add(lblNewLabel, gbc_lblNewLabel);
//	
//	lblNewLabel_1 = new JLabel("7/6");
//	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
//	GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
//	gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
//	gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
//	gbc_lblNewLabel_1.gridx = 1;
//	gbc_lblNewLabel_1.gridy = 1;
//	panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
//	
//	lblNewLabel_2 = new JLabel("2/6");
//	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
//	GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
//	gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
//	gbc_lblNewLabel_2.gridx = 2;
//	gbc_lblNewLabel_2.gridy = 1;
//	panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
//	
//	panel_4 = new JPanel();
//	panel_2.add(panel_4);
//	panel_4.setLayout(new GridLayout(0, 5, 0, 0));
//	
//	lblNewLabel_6 = new JLabel("CS");
//	lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_6);
//	
//	lblNewLabel_10 = new JLabel("TM");
//	lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_10);
//	
//	lblNewLabel_11 = new JLabel("ME");
//	lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_11);
//	
//	lblNewLabel_12 = new JLabel("CT");
//	lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_12);
//	
//	lblNewLabel_13 = new JLabel("NPML");
//	lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_13);
//	
//	lblNewLabel_7 = new JLabel("GL02 A");
//	lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_7);
//	
//	label = new JLabel("");
//	panel_4.add(label);
//	
//	lblNewLabel_14 = new JLabel("GE21 B");
//	lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_14);
//	
//	label_1 = new JLabel("");
//	panel_4.add(label_1);
//	
//	lblNewLabel_15 = new JLabel("Valid\u00E9");
//	lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_15);
//	
//	lblNewLabel_8 = new JLabel("IF02 A");
//	lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_8);
//	
//	label_3 = new JLabel("");
//	panel_4.add(label_3);
//	
//	label_4 = new JLabel("");
//	panel_4.add(label_4);
//	
//	label_5 = new JLabel("");
//	panel_4.add(label_5);
//	
//	label_6 = new JLabel("");
//	panel_4.add(label_6);
//	
//	lblNewLabel_9 = new JLabel("LO02 C");
//	lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
//	panel_4.add(lblNewLabel_9);
//	
//	label_7 = new JLabel("");
//	panel_4.add(label_7);
//	
//	label_8 = new JLabel("");
//	panel_4.add(label_8);
//	
//	label_9 = new JLabel("");
//	panel_4.add(label_9);
//	
//	label_10 = new JLabel("");
//	panel_4.add(label_10);
//	
//	label_11 = new JLabel("");
//	panel_4.add(label_11);
//	
//	label_12 = new JLabel("");
//	panel_4.add(label_12);
//	
//	label_13 = new JLabel("");
//	panel_4.add(label_13);
//	
//	label_14 = new JLabel("");
//	panel_4.add(label_14);
}
