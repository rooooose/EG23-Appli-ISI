package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;
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

public class UE extends JPanel {

	private JPanel contentPane;
	private JTextField searchBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UE frame = new UE();
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
	public UE() {
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
					.addGap(12)
					.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(lblSearch, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(cbBxCategory, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(615, Short.MAX_VALUE))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(9)
					.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(13)
					.addComponent(lblSearch)
					.addContainerGap(13, Short.MAX_VALUE))
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(9)
					.addComponent(cbBxCategory, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
					.addGap(9))
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
		JSplitPane splitPaneUE = new JSplitPane();
		splitPaneUE.setEnabled(false);
		splitPaneUE.setResizeWeight(1.0);
		splitPaneUE.setDividerLocation(1.0);
		splitPaneUE.setContinuousLayout(true);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(splitPaneUE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
						.addComponent(panelRequest, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1128, Short.MAX_VALUE))
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panelRequest, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(splitPaneUE, GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
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
		splitPaneUE.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
		
		final int itemWidth = 340;
		final int itemHeight = 70;
		
		List<JPanel> UEItems = new ArrayList<JPanel>();
		for (int i=0;i<5;i++) {
			String[] arrCategory = {"CS", "TM", "HT", "TM", "TM", "CS"};
			String[] arrUETitle = {"NF16 - Bases de données", "LO07 - Technologies du Web", "<html>PH15 - Essor des technologies"+"<br>"+" et crise de l'idée de progrès</html>",
					"GL02 - Génie Logiciel", "<html>LO02 - Programmation"+"<br>"+" Orientée Objet</html>", "<html>EG23 - Interface Homme-Machine"+"<br>"+" et ergonomie</html>"};

			UEItems.add(i, new JPanel());
			UEItems.get(i).setPreferredSize(new Dimension(itemWidth, itemHeight));
			UEItems.get(i).setBackground(new Color(255, 255, 255));
			UEItems.get(i).setLayout(null);
			UEItems.get(i).setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panelResult.add(UEItems.get(i));
			
			JPanel tagBorder = new JPanel();
			tagBorder.setLayout(null);
			tagBorder.setBackground(new Color(60, 60, 60));
			tagBorder.setBounds(10, 12, 64, 47);
			UEItems.get(i).add(tagBorder);
			
			JPanel tagBkd = new JPanel();
			tagBkd.setLayout(null);
			tagBkd.setBackground(SystemColor.scrollbar);
			tagBkd.setBounds(3, 3, 58, 41);
			tagBorder.add(tagBkd);
			
			JLabel lblCategory = new JLabel(arrCategory[i]);
			lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
			lblCategory.setForeground(new Color(60, 60, 60));
			lblCategory.setFont(new Font("Raleway Medium", Font.PLAIN, 22));
			lblCategory.setBounds(10, 6, 37, 31);
			tagBkd.add(lblCategory);
			
			JLabel lblUE = new JLabel(arrUETitle[i]);
			lblUE.setForeground(new Color(60, 60, 60));
			lblUE.setFont(new Font("Raleway Medium", Font.PLAIN, 16));
			lblUE.setBounds(93, 12, 245, 47);
			UEItems.get(i).add(lblUE);
			
			if (i == 0) {
				UEItems.get(i).addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (Math.round(splitPaneUE.getDividerLocation()*0.1) == Math.round(splitPaneUE.getMaximumDividerLocation()*0.1)) {
							splitPaneUE.setDividerLocation(0.32);
							UEItems.get(0).setBackground(new Color(240,240,240));
						} else {
							splitPaneUE.setDividerLocation(1.0);
							UEItems.get(0).setBackground(Color.WHITE);
						}
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						UEItems.get(0).setBackground(new Color(240,240,240));
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if (Math.round(splitPaneUE.getDividerLocation()*0.1) == Math.round(splitPaneUE.getMaximumDividerLocation()*0.1)) {
							UEItems.get(0).setBackground(Color.WHITE);
						}
					}
				});
			}
		}
		
		UEProfile panelProfile = new UEProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPaneUE.setRightComponent(panelProfile);
	}
}
