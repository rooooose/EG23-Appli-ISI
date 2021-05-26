package elements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import sousFenetres.Enseignants;
import sousFenetres.PageAccueil;

public class ItemEnseignant {
	private static List<ItemEnseignant> arrItemEnseignants = new ArrayList<ItemEnseignant>();
	
	private String arrival;
	private String name;
	private String status;
	private List<String> arrUE;
	private ImageIcon photo = new ImageIcon(ItemEnseignant.class.getResource("/icons/menu/white/photo_default_x76.png"));
	//Choix aléatoire parmis un set de graphique lors du changement de profil
	
	public ItemEnseignant(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	public ItemEnseignant(String name, String status, String arrival) {
		this.name = name;
		this.status = status;
		this.arrival = arrival;
	}
	
	public ItemEnseignant(String name, String status, String arrival, List<String> arrUE, ImageIcon photo) {
		this.name = name;
		this.status = status;
		this.arrival = arrival;
		this.arrUE = arrUE;
		this.photo = photo;
	}
	
	private static void initItems() {
		String[] arrStatus = {"Contractuel", "Prag", "Professeur", "Maître des conférences"};
		String[] arrName = {"Jamy Gourmaud", "Jean Lassale", "Cédric Villani", "Rose Tixier"};
		
		for (int i=0;i<arrName.length;i++) {
			int rand = (int) Math.round(Math.random()*3);
			ItemEnseignant.addList(new ItemEnseignant(arrName[i], arrStatus[rand]));
		}
	}
	
	public static void initPanelItems(JPanel panelResult) {
		if (arrItemEnseignants.isEmpty()) {
			initItems();
		}
		
		final int itemWidth = 340;
		final int itemHeight = 90;
		
		//final int deltaX = 10;
		//final int deltaY = 10+itemHeight + 10;
		
		//List<JPanel> listPanelEnseign = new ArrayList<JPanel>();
		
		for (int i=0;i<arrItemEnseignants.size();i++) {

			JPanel panelEnseignant = new JPanel();
			panelEnseignant.setBounds(10, 10, 340, 90);
			panelEnseignant.setPreferredSize(new Dimension(itemWidth, itemHeight));
			panelEnseignant.setBackground(new Color(255, 255, 255));
			panelEnseignant.setLayout(null);
			panelEnseignant.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			//listPanelEnseign.add(panelEnseignant);
			
			JLabel lblPhoto = new JLabel("");
			lblPhoto.setBounds(10, 6, 76, 76);
			lblPhoto.setPreferredSize(new Dimension(77, 20));
			lblPhoto.setIcon((arrItemEnseignants.get(i).getPhoto()));
			panelEnseignant.add(lblPhoto);
			
			JLabel lblName = new JLabel(arrItemEnseignants.get(i).getName());
			lblName.setForeground(new Color(60, 60, 60));
			lblName.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
			lblName.setBounds(97, 18, 233, 30);
			panelEnseignant.add(lblName);
			
			JLabel lblStatut = new JLabel(arrItemEnseignants.get(i).getStatus());
			lblStatut.setForeground(new Color(14, 100, 161));
			lblStatut.setFont(new Font("Raleway Medium", Font.PLAIN, 12));
			lblStatut.setBounds(97, 47, 233, 22);
			panelEnseignant.add(lblStatut);

			panelResult.add(panelEnseignant);
			
//			if (i == 0) {
//				panelEnseignant.addMouseListener(new MouseAdapter() {
//					@Override
//					public void mouseClicked(MouseEvent e) {
//						if (Math.round(Enseignants.getSplitPane().getDividerLocation()*0.1) == Math.round(Enseignants.getSplitPane().getMaximumDividerLocation()*0.1)) {
//							Enseignants.getSplitPane().setDividerLocation(0.32);
//						} else {
//							Enseignants.getSplitPane().setDividerLocation(1.0);
//						}
//					}
//				});
//			}
		}
	}
	
	public static void addList(ItemEnseignant item) {
		arrItemEnseignants.add(item);
	}
	public static void removeList(ItemEnseignant item) {
		arrItemEnseignants.remove(item);
	}
	
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPhoto(String path) {
		this.photo = new ImageIcon(ItemEnseignant.class.getResource(path));
	}
	
	public String getArrival() {
		return this.arrival;
	}
	public String getName() {
		return this.name;
	}
	public String getStatus() {
		return this.status;
	}
	public ImageIcon getPhoto() {
		return this.photo;
	}
	
	public void addUE(String name) {
		this.arrUE.add(name);
	}
	public void removeUE(String name) {
		this.arrUE.remove(name);
	}
}