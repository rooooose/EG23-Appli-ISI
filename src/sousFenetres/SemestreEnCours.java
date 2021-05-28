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
		
		//Barre de recherche//
		
		JPanel panelRequest = new JPanel();
		panelRequest.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		searchBar = new JTextField();
		searchBar.setForeground(ColorPalette.TLE_BRANCHE.getColor());
		searchBar.setHorizontalAlignment(SwingConstants.CENTER);
		searchBar.setCaretColor(ColorPalette.BKD_NAVBAR2_LIGHT.getColor());
		searchBar.setFont(new Font("Raleway Medium", Font.BOLD, 18));
		searchBar.setColumns(10);
		
		JComboBox cbBxSemestre = new JComboBox();
		cbBxSemestre.setForeground(Color.WHITE);
		cbBxSemestre.setBackground(ColorPalette.BKD_NAVBAR0_LIGHT.getColor());
		cbBxSemestre.setName("");
		cbBxSemestre.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxSemestre.setModel(new DefaultComboBoxModel(new String[] {"Semestre", "ISI1", "ISI2", "ISI3", "ISI4", "ISI5", "ISI6", "ISI7", "ISI8"}));
		((JLabel) cbBxSemestre.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox cbBxStatut = new JComboBox();
		cbBxStatut.setForeground(Color.WHITE);
		cbBxStatut.setBackground(ColorPalette.BKD_NAVBAR0_LIGHT.getColor());
		cbBxStatut.setName("");
		cbBxStatut.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxStatut.setModel(new DefaultComboBoxModel(new String[] {"Statut", "Excellence", "Normal", "Retard", "Retard critique"}));
		((JLabel) cbBxStatut.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
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
			.addComponent(cbBxSemestre, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
			.addGap(108)
			.addComponent(cbBxStatut, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
			.addContainerGap(536, Short.MAX_VALUE))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.TRAILING)
			.addGroup(Alignment.LEADING, gl_panelRequest.createSequentialGroup()
			.addGap(9)
			.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
			.addComponent(cbBxSemestre, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
			.addComponent(cbBxStatut, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
			.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
			.addGap(8))
			.addGroup(Alignment.LEADING, gl_panelRequest.createSequentialGroup()
			.addGap(13)
			.addComponent(lblSearch)
			.addContainerGap(13, Short.MAX_VALUE))
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
		// Espace d'affichage des résultats de recherche //
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(1.0);
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
		panelResult.setPreferredSize(new Dimension(5, 5));
		FlowLayout fl_panelResult = new FlowLayout(FlowLayout.CENTER, 10, 10);
		panelResult.setLayout(fl_panelResult);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(1, 1));
		splitPane.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
		ItemEtudiant.initPanelItems(panelResult, splitPane);
		
		// Affichage du profil de l'étudiant choisi //
		
		SemestreProfile panelProfile = new SemestreProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
	}
}
