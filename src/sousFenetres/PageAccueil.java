package sousFenetres;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import fenetres.NavigationWindow;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageAccueil extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageAccueil frame = new PageAccueil();
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
	public PageAccueil() {		
		setLayout(new CardLayout(0, 0));
		
		JPanel contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		JPanel logoPanel = new JPanel();
		logoPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				NavigationWindow.getWindow().initializeNavigator();
			}
		});
		logoPanel.setBackground(Color.WHITE);
		logoPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/logo_UTT_petit.png"))));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Raleway Bold", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ISI", "RT", "MTE", "GI", "A2I", "GM"}));
		comboBox.setSelectedIndex(0);
		comboBox.setPreferredSize(new Dimension(100,30));
		comboBox.setSize(comboBox.getPreferredSize());
		((JLabel)comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
//		comboBox.getEditor().getEditorComponent().setBackground(Color.YELLOW);
	
		
		
		GroupLayout gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_topPanel.setVerticalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topPanel.createSequentialGroup()
					.addGroup(gl_topPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_topPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(logoPanel, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
						.addGroup(gl_topPanel.createSequentialGroup()
							.addGap(40)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		topPanel.setLayout(gl_topPanel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		//INIT JBUTTON - NAVBAR
		JButton[] arrBtn = initButtons();
		
		panel.add(arrBtn[0]);
		panel.add(arrBtn[1]);
		panel.add(arrBtn[2]);
		panel.add(arrBtn[3]);
		panel.add(arrBtn[4]);
				
		//INIT JPANEL - SOUS-FENETRES
		JPanel[] arrJPanel = initSousFenetres();
				
		//INIT ACTION LISTENER JBUTTON - NAVBAR
		for (int k=0;k<arrJPanel.length;k++) {
			addActList(arrJPanel, arrBtn, k);
		}
		
		
	}
	
	private JButton[] initButtons() {
		
		JButton btnSemestre = new JButton("");
		btnSemestre.setForeground(Color.WHITE);
		btnSemestre.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		btnSemestre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSemestre.setIcon(null);
				btnSemestre.setText("Gestion du semestre");
				btnSemestre.setBackground(new Color(15, 97, 153));
				btnSemestre.setBorder(BorderFactory.createLineBorder(new Color(15, 97, 153), 5));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSemestre.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 9.png")));
				btnSemestre.setText(null);
				btnSemestre.setBackground(new Color(0xff094067));
				btnSemestre.setBorder(null);
				btnSemestre.setBorder(BorderFactory.createLineBorder(new Color(0xff094067), 5));
			}
		});
		btnSemestre.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 9.png")));
		btnSemestre.setPreferredSize(new Dimension(300,200));
		btnSemestre.setBackground(new Color(0xff094067));
		btnSemestre.setBorder(BorderFactory.createLineBorder(new Color(0xff094067), 5));

		
		
		JButton btnEnseignants = new JButton("");
		btnEnseignants.setForeground(Color.WHITE);
		btnEnseignants.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		btnEnseignants.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnEnseignants.setIcon(null);
				btnEnseignants.setText("Gestion des enseignants");
				btnEnseignants.setBackground(new Color(16, 120, 188));
				btnEnseignants.setBorder(BorderFactory.createLineBorder(new Color(16, 120, 188), 5));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnEnseignants.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 8.png")));
				btnEnseignants.setText(null);
				btnEnseignants.setBackground(new Color(0xff0e64a1));
				btnEnseignants.setBorder(null);
				btnEnseignants.setBorder(BorderFactory.createLineBorder(new Color(0xff0e64a1), 5));
			}
		});
		btnEnseignants.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 8.png")));
		btnEnseignants.setPreferredSize(new Dimension(300,200));
		btnEnseignants.setBackground(new Color(0xff0e64a1));
		
		
		JButton btnUE = new JButton("");
		btnUE.setForeground(Color.WHITE);
		btnUE.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		btnUE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnUE.setIcon(null);
				btnUE.setText("Gestion des UE");
				btnUE.setBackground(new Color(126, 170, 247));
				btnUE.setBorder(BorderFactory.createLineBorder(new Color(126, 170, 247), 5));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnUE.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 7.png")));
				btnUE.setText(null);
				btnUE.setBackground(new Color(100, 149, 237));
				btnUE.setBorder(null);
				btnUE.setBorder(BorderFactory.createLineBorder(new Color(100, 149, 237), 5));
			}
		});
		btnUE.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 7.png")));
		btnUE.setPreferredSize(new Dimension(300,200));
		btnUE.setBackground(new Color(100, 149, 237));
		
		
		JButton btnRepartition = new JButton("");
		btnRepartition.setForeground(Color.WHITE);
		btnRepartition.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		btnRepartition.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRepartition.setIcon(null);
				btnRepartition.setText("<html><center>"+"Répartition des étudiants"+"<br>"+"dans le parcours"+"</center></html>");
				btnRepartition.setBackground(new Color(138, 123, 229));
				btnRepartition.setBorder(BorderFactory.createLineBorder(new Color(138, 123, 229), 5));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRepartition.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 6.png")));
				btnRepartition.setText(null);
				btnRepartition.setBackground(new Color(106, 90, 205));
				btnRepartition.setBorder(null);
				btnRepartition.setBorder(BorderFactory.createLineBorder(new Color(106, 90, 205), 5));
			}
		});
		btnRepartition.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 6.png")));
		btnRepartition.setPreferredSize(new Dimension(300,200));
		btnRepartition.setBackground(new Color(106, 90, 205));
		
		
		JButton btnES = new JButton("");
		btnES.setForeground(Color.WHITE);
		btnES.setFont(new Font("Raleway Medium", Font.PLAIN, 20));
		btnES.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnES.setIcon(null);
				btnES.setText("Gestion des enseignants");
				btnES.setBackground(new Color(183, 91, 229));
				btnES.setBorder(BorderFactory.createLineBorder(new Color(183, 91, 229), 5));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnES.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 3.png")));
				btnES.setText(null);
				btnES.setBackground(new Color(153, 50, 204));
				btnES.setBorder(null);
				btnES.setBorder(BorderFactory.createLineBorder(new Color(153, 50, 204), 5));
			}
		});
		btnES.setIcon(new ImageIcon(PageAccueil.class.getResource("/img/Fichier 3.png")));
		btnES.setPreferredSize(new Dimension(300,200));
		
		btnES.setBackground(new Color(153, 50, 204));
		
		
		JButton[] arrBtn = {btnSemestre, btnEnseignants, btnUE, btnRepartition, btnES};
		return arrBtn;
	}
	
	private JPanel[] initSousFenetres() {
		//Init. JPanel
		SemestreEnCours frameSemEnCours = new SemestreEnCours();
		Enseignants frameEnseign = new Enseignants();
		UE frameUE = new UE();
		RepartitionEtudiants frameRepartEtu = new RepartitionEtudiants();
		EntreeSorties frameES = new EntreeSorties();
		
		JPanel[] arrJPanel = {frameSemEnCours, frameEnseign, frameUE, frameRepartEtu, frameES};
		return arrJPanel;
	}
	
	private void addActList(JPanel[] arrJPanel, JButton[] btnNav, int num) {
		btnNav[num].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NavigationWindow.getFrame().getContentPane().removeAll();
				NavigationWindow.getWindow().initializeNavigator();
				NavigationWindow.getFrame().getContentPane().add(arrJPanel[num], BorderLayout.CENTER);
				arrJPanel[num].setVisible(true);
			}
		});
	}
}
