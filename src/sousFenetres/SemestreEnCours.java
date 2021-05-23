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

public class SemestreEnCours extends JPanel {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTable table;
	private JTable table_1;

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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"4/12", "7/6", "2/6"},
			},
			new String[] {
				"CS/TM", "ME", "CT"
			}
		));
//		panel_2.add(table);
		JScrollPane scrollPane= new  JScrollPane(table);
		panel_2.add(scrollPane);
		
		table.addMouseMotionListener(new MouseAdapter(){
			public void mouseMoved(MouseEvent e) {
				int row=table.rowAtPoint(e.getPoint());
				int col=table.columnAtPoint(e.getPoint());
				if(row>-1 && col>-1){
					Object value=table.getValueAt(row, col);
					if(null!=value && !"".equals(value))
						 table.setToolTipText(value.toString());// floating display cell content
					else
						 table.setToolTipText(null);//Close prompt
				}
			}
		}); 
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"GL02 A", null, "GE21 B", null, "Validé"},
				{"IF02A", null, null, null, null},
				{"LO02 C", null, null, null, null},
			},
			new String[] {
				"CS", "TM", "ME", "CT", "NPML"
			}
		));
		JScrollPane scrollPane1= new  JScrollPane(table_1);
		panel_2.add(scrollPane1);
	}

}
