package sousFenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

public class SemestreEnCours extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;

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
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
	}

}
