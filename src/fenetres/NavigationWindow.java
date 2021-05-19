package fenetres;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import sousFenetres.Enseignants;
import sousFenetres.EntreeSorties;
import sousFenetres.PageAccueil;
import sousFenetres.RepartitionEtudiants;
import sousFenetres.SemestreEnCours;
import sousFenetres.UE;

public class NavigationWindow {

	private static JFrame frame;

	private static NavigationWindow window;
	
	private static JLabel lblTitle = new JLabel("Titre de la sous-fenêtre");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new NavigationWindow();
					NavigationWindow.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NavigationWindow() {
		initializeFrame();
		initializeAccueil();
		//initializeNavigator();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeFrame() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(NavigationWindow.class.getResource("/icons/icon-50px.png")));
		frame.setBounds(100, 100, 1225, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		//FULL SCREEN
		GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = graphics.getDefaultScreenDevice();
		device.setFullScreenWindow(frame);
	}
	
	public void initializeNavigator() {
		if (frame.getContentPane() != null) frame.getContentPane().removeAll();
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);

		lblTitle.setFont(new Font("Raleway Medium", Font.PLAIN, 28));
		
		JPanel logoPanel = new JPanel();
		logoPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				initializeAccueil();
				frame.setVisible(true);
			}
		});
		logoPanel.setBackground(Color.WHITE);
		logoPanel.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("img/logo_UTT_petit.png"))));
		
		GroupLayout gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_topPanel.setVerticalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_topPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(logoPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(lblTitle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		topPanel.setLayout(gl_topPanel);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setPreferredSize(new Dimension(38, 480));
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(rightPanel, BorderLayout.EAST);
		
		//INIT JBUTTON - NAVBAR
		JButton[] arrBtnNav = initButtons();
		
		//INIT JPANEL - SOUS-FENETRES
		JPanel[] arrJPanel = initSousFenetres();
		
		//INIT ACTION LISTENER JBUTTON - NAVBAR
		for (int k=0;k<arrJPanel.length;k++) {
			addActList(arrJPanel, arrBtnNav, k);
		}
		
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(arrBtnNav[4], GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(arrBtnNav[3], GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(arrBtnNav[2], GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(arrBtnNav[1], GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(arrBtnNav[0], GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(237))
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(0)
					.addComponent(arrBtnNav[0], GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(arrBtnNav[1], GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(arrBtnNav[2], GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(arrBtnNav[3], GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(arrBtnNav[4], GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(66))
		);
		leftPanel.setLayout(gl_leftPanel);
	}
	
	private JButton[] initButtons() {
		JButton btnNav1 = new JButton("");
		btnNav1.setBackground(new Color(0xff094067));
		
		JButton btnNav2 = new JButton("");
		btnNav2.setBackground(new Color(0xff0e64a1));
		
		JButton btnNav3 = new JButton("");
		btnNav3.setBackground(new Color(100, 149, 237));
		
		JButton btnNav4 = new JButton("");
		btnNav4.setBackground(new Color(106, 90, 205));
		
		JButton btnNav5 = new JButton("");
		btnNav5.setBackground(new Color(153, 50, 204));
		
		JButton[] arrBtnNav = {btnNav1, btnNav2, btnNav3, btnNav4, btnNav5};
		return arrBtnNav;
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
	
	private void hideSousFenetres(JPanel[] arrJPanel) {
		for (int i=0;i<arrJPanel.length;i++) {
			frame.getContentPane().remove(arrJPanel[i]);
			arrJPanel[i].setVisible(false);
		}
	}
	
	private void addActList(JPanel[] arrJPanel, JButton[] btnNav, int num) {
		btnNav[num].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arrTitles = {"Gestion du semestre encours", "Gestion des enseignants", "Gestion des UE", 
						"Répartition des étudiants dans le parcours", "Statistiques des flux entrants et sortants"};
				NavigationWindow.setTitle(arrTitles[num]);
				
				hideSousFenetres(arrJPanel);
				frame.getContentPane().add(arrJPanel[num], BorderLayout.CENTER);
				arrJPanel[num].setVisible(true);
			}
		});
	}
	
	public void initializeAccueil() {
		if (frame.getContentPane() != null) frame.getContentPane().removeAll();
		
		PageAccueil pageAccueil = new PageAccueil();
		frame.getContentPane().add(pageAccueil, BorderLayout.CENTER);
	}
	
	public static NavigationWindow getWindow() {
		return window;
	}
	
	public static JFrame getFrame() {
		return frame;
	}
	
	public static void setTitle(String title) {
		lblTitle.setText(title);
	}
}
