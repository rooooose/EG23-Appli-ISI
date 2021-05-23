package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import elements.ColorPalette;

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
		
		JPanel panelRequest = new JPanel();
		
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
		
		JPanel panelResult = new JPanel();
		splitPane.setLeftComponent(panelResult);
		
		JPanel panelProfile = new JPanel();
		panelProfile.setMinimumSize(new Dimension(0, 0));
		panelProfile.setPreferredSize(new Dimension(0, 0));
		panelProfile.setBackground(new Color(255, 255, 240));
		splitPane.setRightComponent(panelProfile);
		
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
		contentPane.setLayout(gl_contentPane);
		

		JCheckBox chckbxTest = new JCheckBox("Test Switch");
		chckbxTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxTest.isSelected()) {
					splitPane.setDividerLocation(0.4);
				} else {
					splitPane.setDividerLocation(1.0);
				}
			}
		});
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
					.addGap(20))
		);
		gl_panelRequest.setVerticalGroup(
			gl_panelRequest.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelRequest.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panelRequest.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSearch, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
						.addGroup(gl_panelRequest.createParallelGroup(Alignment.BASELINE)
							.addComponent(cbBxCategory, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addComponent(chckbxTest))
						.addComponent(searchBar, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
					.addContainerGap())
		);
		panelRequest.setLayout(gl_panelRequest);
	}
}
