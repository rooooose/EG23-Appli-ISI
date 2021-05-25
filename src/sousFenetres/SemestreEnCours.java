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
import elements.ItemEnseignant;
import elements.ItemEtudiant;

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
		splitPane.setResizeWeight(0.32);
		splitPane.setDividerLocation(1.0);
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
		panelResult.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
//		panelResult.setBounds(2, 2, 392, 612);
		panelResult.setPreferredSize(new Dimension(12, 12));
		FlowLayout fl_panelResult = new FlowLayout(FlowLayout.CENTER, 10, 10);
		panelResult.setLayout(fl_panelResult);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
		ItemEtudiant.initPanelItems(panelResult);
		
		SemestreProfile panelProfile = new SemestreProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
	}
}
