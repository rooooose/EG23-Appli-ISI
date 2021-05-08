package fenetres;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import sousFenetres.Enseignants;
import sousFenetres.EntreeSorties;
import sousFenetres.RepartitionEtudiants;
import sousFenetres.SemestreEnCours;
import sousFenetres.UE;

import java.awt.SystemColor;
import java.beans.PropertyVetoException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NavigationWindow {

	private JFrame frame;
	private static NavigationWindow window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new NavigationWindow();
					window.frame.setVisible(true);
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(NavigationWindow.class.getResource("/img/icons/icon-50px.png")));
		frame.setBounds(100, 100, 1225, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		//FULL SCREEN
		GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = graphics.getDefaultScreenDevice();
		device.setFullScreenWindow(frame);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Titre de la sous-fenêtre");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JPanel logoPanel = new JPanel();
		logoPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				window.frame.setVisible(false);
				initializeAccueil();
				window.frame.setVisible(true);
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
					.addGap(5)
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
				hideSousFenetres(arrJPanel);
				frame.getContentPane().add(arrJPanel[num], BorderLayout.CENTER);
				arrJPanel[num].setVisible(true);
			}
		});
	}
	
	private void initializeAccueil() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//FULL SCREEN
		GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = graphics.getDefaultScreenDevice();
		device.setFullScreenWindow(frame);
				
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Accueil.class.getResource("/img/Fichier 3.png")));
		
//		ImageIcon myImage = new ImageIcon(Accueil.class.getResource("/img/entrees-sorties.png"));
//		Image img = myImage.getImage();
//		Image newImg = img.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
//		ImageIcon image = new ImageIcon(newImg);
//		lblNewLabel.setIcon(image);
		lblNewLabel.setBounds(36, 106, 107, 89);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Accueil.class.getResource("/img/Fichier 6.png")));
		lblNewLabel_1.setBounds(143, 146, 65, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Accueil.class.getResource("/img/Fichier 7.png")));
		lblNewLabel_2.setBounds(218, 146, 73, 59);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Accueil.class.getResource("/img/Fichier 8.png")));
		lblNewLabel_3.setBounds(273, 54, 65, 76);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Accueil.class.getResource("/img/Fichier 9.png")));
		lblNewLabel_4.setBounds(301, 157, 107, 96);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				window.frame.setVisible(false);
				initialize();
				window.frame.setVisible(true);
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(Accueil.class.getResource("/img/logo_UTT_petit.png")));
		lblNewLabel_1_1.setBounds(0, 0, 248, 96);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
