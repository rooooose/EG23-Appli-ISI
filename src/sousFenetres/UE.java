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
		contentPane.setBackground(ColorPalette.BKD_NAVBAR2.getColor());
		add(contentPane);
		
		//////////////////////////////////////////

		JPanel panelRequest = new JPanel();
		panelRequest.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		searchBar = new JTextField();
		searchBar.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		searchBar.setColumns(10);
		
		JButton btnSearch = new JButton("GO");
		btnSearch.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		
		JComboBox cbBxCategory = new JComboBox();
		cbBxCategory.setName("");
		cbBxCategory.setToolTipText("Catégorie");
		cbBxCategory.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
		cbBxCategory.setModel(new DefaultComboBoxModel(new String[] {"Catégorie", "CS", "TM", "ME", "HT", "CT"}));
		((JLabel) cbBxCategory.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox chckbxTest = new JCheckBox("Test Switch");
		
		GroupLayout gl_panelRequest = new GroupLayout(panelRequest);
		gl_panelRequest.setHorizontalGroup(
			gl_panelRequest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addContainerGap()
					.addComponent(searchBar, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearch)
					.addGap(103)
					.addComponent(cbBxCategory, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(428)
					.addComponent(chckbxTest, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSearch, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addGroup(gl_panelRequest.createParallelGroup(Alignment.BASELINE)
							.addComponent(cbBxCategory, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addComponent(chckbxTest))
						.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
					.addContainerGap())
		);
		panelRequest.setLayout(gl_panelRequest);
		
		//////////////////////////////////////////
		
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
		
		JPanel panelResult = new JPanel();
		panelResult.setBounds(2, 2, 392, 612);
		panelResult.setPreferredSize(new Dimension(12, 12));
		FlowLayout fl_panelResult = new FlowLayout(FlowLayout.CENTER, 10, 10);
		panelResult.setLayout(fl_panelResult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane.setLeftComponent(scrollPane);
		scrollPane.setViewportView(panelResult);
		
		final int itemWidth = 340;
		final int itemHeight = 80;
		
		JPanel panel_0 = new JPanel();
		panel_0.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_0.setBackground(new Color(178, 34, 34));
		panel_0.setLayout(null);
		panelResult.add(panel_0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_1.setBackground(new Color(255, 255, 0));
		panel_1.setLayout(null);
		panelResult.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setLayout(null);
		panelResult.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_3.setBackground(Color.MAGENTA);
		panel_3.setLayout(null);
		panelResult.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_4.setBackground(new Color(50, 205, 50));
		panel_4.setLayout(null);
		panelResult.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_5.setBackground(new Color(0, 191, 255));
		panel_5.setLayout(null);
		panelResult.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(itemWidth, itemHeight));
		panel_6.setBackground(new Color(138, 43, 226));
		panel_6.setLayout(null);
		panelResult.add(panel_6);
		
		UEProfile panelProfile = new UEProfile();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
		
		//////////////////////////////////////////////////////////
		
		chckbxTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxTest.isSelected()) {
					splitPane.setDividerLocation(0.4);
				} else {
					splitPane.setDividerLocation(1.0);
				}
			}
		});
	}
}
