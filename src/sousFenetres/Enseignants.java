package sousFenetres;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import elements.ColorPalette;
import elements.ItemEnseignant;
import sousFenetres.profiles.EnseignantProfile;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Rectangle;

public class Enseignants extends JPanel {
	
	private static JSplitPane splitPane = new JSplitPane();;

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
		contentPane.setLayout(new CardLayout(0, 0));
		add(contentPane);
		
		//////////////////////////////////////////
		
		JLayeredPane layeredPanel = new JLayeredPane();
		contentPane.add(layeredPanel, "name_645254200883300");
		layeredPanel.setLayout(null);
		
		JPanel backPanel = new JPanel();
		backPanel.setBounds(0, 0, 1370, 728);
		layeredPanel.setLayer(backPanel, 0);
		layeredPanel.add(backPanel);

		JPanel panelRequest = new JPanel();
		panelRequest.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backPanel.add(panelRequest);
		
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
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TEST");
		
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
					.addPreferredGap(ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
								.addComponent(cbBxStatut, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
								.addComponent(cbBxUE, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addGap(13)
							.addComponent(lblSearch))
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addGap(11)
							.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRequest.createSequentialGroup()
							.addGap(19)
							.addComponent(chckbxNewCheckBox)))
					.addContainerGap())
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
		GroupLayout gl_backPanel = new GroupLayout(backPanel);
		gl_backPanel.setHorizontalGroup(
			gl_backPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backPanel.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_backPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(splitPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
						.addComponent(panelRequest, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1128, Short.MAX_VALUE))
					.addGap(108))
		);
		gl_backPanel.setVerticalGroup(
			gl_backPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_backPanel.createSequentialGroup()
					.addGap(22)
					.addComponent(panelRequest, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
					.addGap(36))
		);
		backPanel.setLayout(gl_backPanel);
		
		JPanel panelResult = new JPanel();
		panelResult.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		panelResult.setBounds(2, 2, 392, 612);
		panelResult.setPreferredSize(new Dimension(12, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(224, 255, 255));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportView(panelResult);
		
		
		final int itemWidth = 340;
		final int itemHeight = 90;
		
		//final int deltaX = 10;
		//final int deltaY = 10+itemHeight + 10;
		
		JPanel panel_0 = new JPanel();
		panel_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Math.round(Enseignants.getSplitPane().getDividerLocation()*0.1) == Math.round(Enseignants.getSplitPane().getMaximumDividerLocation()*0.1)) {
					Enseignants.getSplitPane().setDividerLocation(0.34);
				} else {
					Enseignants.getSplitPane().setDividerLocation(1.0);
				}
			}
		});
		panelResult.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		panel_0.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_0.setBackground(new Color(255, 255, 255));
		panel_0.setLayout(null);
		panel_0.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelResult.add(panel_0);
		
		JLabel lblPhoto0 = new JLabel("");
		lblPhoto0.setBounds(10, 6, 76, 76);
		lblPhoto0.setPreferredSize(new Dimension(77, 20));
		lblPhoto0.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/white/photo_default_x76.png")));
		panel_0.add(lblPhoto0);
		
		JLabel lblUE0 = new JLabel("Jean-Pierre Pernault");
		lblUE0.setForeground(new Color(60, 60, 60));
		lblUE0.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		lblUE0.setBounds(97, 18, 233, 30);
		panel_0.add(lblUE0);
		
		JLabel lblProf0 = new JLabel("Maître des conférences");
		lblProf0.setForeground(new Color(14, 100, 161));
		lblProf0.setFont(new Font("Raleway Medium", Font.PLAIN, 12));
		lblProf0.setBounds(97, 47, 233, 22);
		panel_0.add(lblProf0);
		
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxNewCheckBox.isSelected()) { //Math.round(splitPane.getDividerLocation()*0.1) == Math.round(splitPane.getMaximumDividerLocation()*0.1)
					System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
					splitPane.setDividerLocation(0.34);
					splitPane.repaint();
					//splitPane.validate();
				} else {
					System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
					splitPane.setDividerLocation(1.0);
					splitPane.repaint();
					//splitPane.validate();
				}
			}
		});
		
		EnseignantProfile panelProfile = new EnseignantProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		
		splitPane.setContinuousLayout(true);
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(1.0);
		splitPane.setLeftComponent(scrollPane);
		splitPane.setRightComponent(panelProfile);
		
		ItemEnseignant.initPanelItems(panelResult);
		
		JPanel frontPanel = new JPanel();
		frontPanel.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
		frontPanel.setBounds(158, 605, 64, 64);
		frontPanel.setLayout(null);
		layeredPanel.setLayer(frontPanel, 1);
		layeredPanel.add(frontPanel);
		
		JLabel lblAdd = new JLabel();
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lblAdd.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/white/add64.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblAdd.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/black/add64.png")));
			}
		});
		lblAdd.setBounds(0, 0, 64, 64);
		lblAdd.setIcon(new ImageIcon(Enseignants.class.getResource("/icons/menu/black/add64.png")));
		frontPanel.add(lblAdd);
	}
	
	public static JSplitPane getSplitPane() {
		return splitPane;
	}
}
