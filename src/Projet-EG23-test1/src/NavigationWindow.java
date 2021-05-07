import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import sousFenetres.RepartitionEtudiants;

import java.awt.SystemColor;
import java.beans.PropertyVetoException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class NavigationWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NavigationWindow window = new NavigationWindow();
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
		frame.setBounds(100, 100, 1225, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Titre de la sous-fenêtre");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JPanel logoPanel = new JPanel();
		logoPanel.setBackground(Color.ORANGE);
		logoPanel.setForeground(SystemColor.textHighlight);
		GroupLayout gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
			gl_topPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_topPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(logoPanel, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 1014, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_topPanel.setVerticalGroup(
			gl_topPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_topPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_topPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addComponent(logoPanel, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addContainerGap())
		);
		topPanel.setLayout(gl_topPanel);
		
		JPanel leftPanel = new JPanel();
		frame.getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setPreferredSize(new Dimension(38, 480));
		
		JButton btnNav1 = new JButton("");
		btnNav1.setBackground(new Color(238, 130, 238));
		
		JButton btnNav2 = new JButton("");
		btnNav2.setBackground(new Color(238, 130, 238));
		
		JButton btnNav3 = new JButton("");
		btnNav3.setBackground(new Color(238, 130, 238));
		
		JButton btnNav4 = new JButton("");
		btnNav4.setBackground(new Color(238, 130, 238));
		
		JButton btnNav5 = new JButton("");
		btnNav5.setBackground(new Color(238, 130, 238));
		GroupLayout gl_leftPanel = new GroupLayout(leftPanel);
		gl_leftPanel.setHorizontalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_leftPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNav5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNav4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNav3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNav2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNav1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(237))
		);
		gl_leftPanel.setVerticalGroup(
			gl_leftPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_leftPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnNav1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNav2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNav3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNav4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNav5, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(66))
		);
		leftPanel.setLayout(gl_leftPanel);
		
		//JPanel
		RepartitionEtudiants frameRepartEtu = new RepartitionEtudiants();
		frame.getContentPane().add(frameRepartEtu, BorderLayout.CENTER);
		frameRepartEtu.setVisible(true);
		
	}
}
