package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;
import elements.ItemEnseignant;
import sousFenetres.profiles.EnseignantProfile;
import sousFenetres.profiles.UEProfile;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.SoftBevelBorder;

public class Enseignants extends JPanel {

	private JPanel contentPane;
	private JTextField searchBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enseignants frame = new Enseignants();
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
	public Enseignants() {
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
		
		JComboBox cbBxUE = new JComboBox();
		cbBxUE.setForeground(Color.WHITE);
		cbBxUE.setBackground(ColorPalette.BKD_NAVBAR1_LIGHT.getColor());
		cbBxUE.setName("");
		cbBxUE.setToolTipText("UE");
		cbBxUE.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxUE.setModel(new DefaultComboBoxModel(new String[] {"UE", "LO02", "GL02", "NF16", "IF02A", "PH15", "EG23", "QX01", "IF15", "LO07", "GE21", "MG06", "LE01", "LE02", "LE03", "LE08"}));
		((JLabel) cbBxUE.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblSearch.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/white/search.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblSearch.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/search.png")));
			}
		});
		lblSearch.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/search.png")));
		
		JComboBox cbBxStatut = new JComboBox();
		cbBxStatut.setModel(new DefaultComboBoxModel(new String[] {"Statut", "Contractuel", "Prag", "Professeur", "Maître de conférence"}));
		cbBxStatut.setToolTipText("Statut");
		cbBxStatut.setName("");
		cbBxStatut.setForeground(Color.WHITE);
		cbBxStatut.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxStatut.setBackground(new Color(16, 120, 188));
		((JLabel) cbBxStatut.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		GroupLayout gl_panelRequest = new GroupLayout(panelRequest);
		gl_panelRequest.setHorizontalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(12)
					.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(cbBxUE, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(cbBxStatut, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(400, Short.MAX_VALUE))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelRequest.createParallelGroup(Alignment.TRAILING)
								.addComponent(cbBxStatut, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
								.addComponent(cbBxUE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addGap(13)
							.addComponent(lblSearch))
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addGap(11)
							.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
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
		
		JPanel panelResult = new JPanel();
		panelResult.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		panelResult.setBounds(2, 2, 392, 612);
		panelResult.setPreferredSize(new Dimension(12, 12));
		FlowLayout fl_panelResult = new FlowLayout(FlowLayout.CENTER, 10, 10);
		panelResult.setLayout(fl_panelResult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(224, 255, 255));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
//		
//		final int itemWidth = 340;
//		final int itemHeight = 90;
//		
//		JPanel panel_0 = new JPanel();
//		panel_0.setPreferredSize(new Dimension(itemWidth, itemHeight));
//		panel_0.setBackground(new Color(255, 255, 255));
//		panel_0.setLayout(null);
//		panel_0.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
//		panelResult.add(panel_0);
//		
//		JLabel lblPhoto0 = new JLabel("");
//		lblPhoto0.setBounds(10, 6, 76, 76);
//		lblPhoto0.setPreferredSize(new Dimension(77, 20));
//		lblPhoto0.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/white/photo_default_x76.png")));
//		panel_0.add(lblPhoto0);
//		
//		JLabel lblUE0 = new JLabel("Jean-Pierre Pernault");
//		lblUE0.setForeground(new Color(60, 60, 60));
//		lblUE0.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
//		lblUE0.setBounds(97, 18, 233, 30);
//		panel_0.add(lblUE0);
//		
//		JLabel lblProf0 = new JLabel("Maître des conférences");
//		lblProf0.setForeground(new Color(14, 100, 161));
//		lblProf0.setFont(new Font("Raleway Medium", Font.PLAIN, 12));
//		lblProf0.setBounds(97, 47, 233, 22);
//		panel_0.add(lblProf0);
		
		ItemEnseignant.initPanelItems(panelResult);
		
		EnseignantProfile panelProfile = new EnseignantProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
	}
}
