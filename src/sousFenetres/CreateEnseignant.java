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
import fenetres.NavigationWindow;
import sousFenetres.profiles.EnseignantProfile;
import javax.swing.JCheckBox;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Rectangle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateEnseignant extends JPanel {
	
	private static JSplitPane splitPane = new JSplitPane();;

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

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
	public CreateEnseignant() {
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(Color.WHITE);
		add(contentPane_1, "name_45138853281900");
		contentPane_1.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPanel = new JLayeredPane();
		layeredPanel.setLayout(null);
		contentPane_1.add(layeredPanel, "name_45241378733300");
		
		JPanel backPanel = new JPanel();
		backPanel.setBackground(Color.WHITE);
		backPanel.setBounds(0, 0, 1370, 728);
		layeredPanel.add(backPanel);
		
		JPanel panelAjout = new JPanel();
		panelAjout.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblNewLabel_2 = new JLabel("Ajout d'un enseignant");
		lblNewLabel_2.setFont(new Font("Raleway ExtraBold", Font.PLAIN, 24));
		lblNewLabel_2.setForeground(ColorPalette.BKD_NAVBAR1.getColor());
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setFont(new Font("Raleway", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
	
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.setFont(new Font("Raleway", Font.PLAIN, 13));
		btnNewButton_1.setBackground(ColorPalette.BKD_NAVBAR1.getColor());
		btnNewButton_1.setForeground(Color.WHITE);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getPanelRequest());
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getSplitPane());
				Enseignants.getPanelRequest().setVisible(true);
				Enseignants.getSplitPane().setVisible(true);
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getPlus());
				Enseignants.getPlus().setVisible(true);
				
	
//				Enseignants.getContentPane().remove(contentPane_1);
				contentPane_1.setVisible(false);
			}
		});
		
		JLabel lblNewLabel_3_1 = new JLabel("UEs :");
		lblNewLabel_3_1.setFont(new Font("Raleway", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		 btnNewButton.setBackground(ColorPalette.BKD_NAVBAR1.getColor());
		 btnNewButton.setForeground(Color.WHITE);

		btnNewButton.setFont(new Font("Raleway", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getPanelRequest());
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getSplitPane());
				Enseignants.getPanelRequest().setVisible(true);
				Enseignants.getSplitPane().setVisible(true);
				NavigationWindow.getFrame().getContentPane().add(Enseignants.getPlus());
				Enseignants.getPlus().setVisible(true);
				
	
//				Enseignants.getContentPane().remove(contentPane_1);
				contentPane_1.setVisible(false);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(CreateEnseignant.class.getResource("/icons/menu/black/close24.png")));
		
		JLabel lblNewLabel_3 = new JLabel("Statut :");
		lblNewLabel_3.setFont(new Font("Raleway", Font.PLAIN, 16));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_panelAjout = new GroupLayout(panelAjout);
		gl_panelAjout.setHorizontalGroup(
			gl_panelAjout.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAjout.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panelAjout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addGroup(gl_panelAjout.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
							.addGap(700)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelAjout.createSequentialGroup()
							.addGroup(gl_panelAjout.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelAjout.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelAjout.createSequentialGroup()
									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)
							.addGap(31)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panelAjout.setVerticalGroup(
			gl_panelAjout.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAjout.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panelAjout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(50)
					.addGroup(gl_panelAjout.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelAjout.createSequentialGroup()
							.addGroup(gl_panelAjout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelAjout.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panelAjout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_3_1)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(42)
							.addComponent(btnNewButton_1)
							.addGap(723))
						.addGroup(Alignment.LEADING, gl_panelAjout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		panelAjout.setLayout(gl_panelAjout);
		GroupLayout gl_backPanel = new GroupLayout(backPanel);
		gl_backPanel.setHorizontalGroup(
			gl_backPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_backPanel.createSequentialGroup()
					.addGap(134)
					.addComponent(panelAjout, GroupLayout.PREFERRED_SIZE, 1128, Short.MAX_VALUE)
					.addGap(108))
		);
		gl_backPanel.setVerticalGroup(
			gl_backPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_backPanel.createSequentialGroup()
					.addGap(92)
					.addComponent(panelAjout, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(370, Short.MAX_VALUE))
		);
		backPanel.setLayout(gl_backPanel);
		
	}
}

