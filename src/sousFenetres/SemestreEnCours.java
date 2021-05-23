package sousFenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.Insets;

public class SemestreEnCours extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JPanel panel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;

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
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		panel_3 = new JPanel();
		panel_2.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{150, 150, 150, 0};
		gbl_panel_3.rowHeights = new int[]{0, 13, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		lblNewLabel_3 = new JLabel("CS/TM");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 0;
		panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("ME");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		panel_3.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("CT");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 0;
		panel_3.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		lblNewLabel = new JLabel("4/12");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("7/6");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("2/6");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 1;
		panel_3.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 5, 0, 0));
		
		lblNewLabel_6 = new JLabel("CS");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_6);
		
		lblNewLabel_10 = new JLabel("TM");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("ME");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("CT");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("NPML");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_13);
		
		lblNewLabel_7 = new JLabel("GL02 A");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_7);
		
		label = new JLabel("");
		panel_4.add(label);
		
		lblNewLabel_14 = new JLabel("GE21 B");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_14);
		
		label_1 = new JLabel("");
		panel_4.add(label_1);
		
		lblNewLabel_15 = new JLabel("Valid\u00E9");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_15);
		
		lblNewLabel_8 = new JLabel("IF02 A");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_8);
		
		label_3 = new JLabel("");
		panel_4.add(label_3);
		
		label_4 = new JLabel("");
		panel_4.add(label_4);
		
		label_5 = new JLabel("");
		panel_4.add(label_5);
		
		label_6 = new JLabel("");
		panel_4.add(label_6);
		
		lblNewLabel_9 = new JLabel("LO02 C");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_9);
		
		label_7 = new JLabel("");
		panel_4.add(label_7);
		
		label_8 = new JLabel("");
		panel_4.add(label_8);
		
		label_9 = new JLabel("");
		panel_4.add(label_9);
		
		label_10 = new JLabel("");
		panel_4.add(label_10);
		
		label_11 = new JLabel("");
		panel_4.add(label_11);
		
		label_12 = new JLabel("");
		panel_4.add(label_12);
		
		label_13 = new JLabel("");
		panel_4.add(label_13);
		
		label_14 = new JLabel("");
		panel_4.add(label_14);
	}

}
