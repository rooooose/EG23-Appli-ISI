package elements;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

public class ItemEtudiant {
	
private static List<ItemEtudiant> arrItemEtudiant = new ArrayList<ItemEtudiant>();
	
	private String arrival;
	private String name;
	private String status;
	private List<String> arrUE;
	private ImageIcon photo = new ImageIcon(ItemEtudiant.class.getResource("/icons/menu/white/photo_default_x76.png"));
	//Choix aléatoire parmis un set de graphique lors du changement de profil
	
	public ItemEtudiant(String name, String status) {
		this.name = name;
		this.status = status;
	}
	
	public ItemEtudiant(String name, String status, String arrival) {
		this.name = name;
		this.status = status;
		this.arrival = arrival;
	}
	
	public ItemEtudiant(String name, String status, String arrival, List<String> arrUE, ImageIcon photo) {
		this.name = name;
		this.status = status;
		this.arrival = arrival;
		this.arrUE = arrUE;
		this.photo = photo;
	}
	
	private static void initItems() {
		String[] arrLevel = {"ISI3", "ISI4", "ISI1", "ISI2"};
		String[] arrName = {"Vincent Florent", "Jean Lassale", "C\u00E9dric Villani", "Rose Tixier", "Martin Luther King", "Rosa Parks", "Youri Gagarine"};
		
		for (int i=0;i<arrName.length;i++) {
			int rand = (int) Math.round(Math.random()*3);
			ItemEtudiant.addList(new ItemEtudiant(arrName[i], arrLevel[rand]));
		}
	}
	
	public static void initPanelItems(JPanel panelResult, JSplitPane splitPane, JScrollPane scrollPane) {
		if (arrItemEtudiant.isEmpty()) {
			initItems();
		}
		
		final int itemWidth = 400;
		final int itemHeight = 90;
		
		for (int i=0;i<arrItemEtudiant.size();i++) {

			JPanel panelEtudiant = new JPanel();
			panelEtudiant.setPreferredSize(new Dimension(itemWidth, itemHeight));
			panelEtudiant.setBackground(new Color(255, 255, 255));
			panelEtudiant.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 2));
			panelEtudiant.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panelResult.add(panelEtudiant);
			
			JLabel lblPhoto = new JLabel("");
//			lblPhoto.setBounds(10, 6, 76, 76);
//			lblPhoto.setPreferredSize(new Dimension(77, 20));
			lblPhoto.setIcon((arrItemEtudiant.get(i).getPhoto()));
			panelEtudiant.add(lblPhoto);
			
			JLabel lblName = new JLabel(arrItemEtudiant.get(i).getName());
			lblName.setForeground(new Color(60, 60, 60));
			lblName.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
//			lblName.setBounds(97, 18, 233, 30);
			panelEtudiant.add(lblName);
			
//			JLabel lblStatut = new JLabel(arrItemEtudiant.get(i).getLevel());
//			lblStatut.setForeground(new Color(14, 100, 161));
//			lblStatut.setFont(new Font("Raleway Medium", Font.PLAIN, 12));
//			lblStatut.setBounds(97, 47, 233, 22);
//			panelEtudiant.add(lblStatut);
			
//			JPanel tagBorder = new JPanel();
//			tagBorder.setLayout(null);
//			tagBorder.setBackground(new Color(60, 60, 60));
////			tagBorder.setBounds(270, 12, 50, 30);
//			panelEtudiant.add(tagBorder);
//			
//			JPanel tagBkd = new JPanel();
//			tagBkd.setLayout(null);
//			tagBkd.setBackground(SystemColor.scrollbar);
////			tagBkd.setBounds(3, 3, 44, 24);
//			tagBorder.add(tagBkd);
			Border border = BorderFactory.createCompoundBorder(
			        BorderFactory.createLineBorder(Color.CYAN), 
			        BorderFactory.createEmptyBorder(5, 8, 5, 8));
			
			JLabel lblLevel = new JLabel(arrItemEtudiant.get(i).getLevel());
			lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
			lblLevel.setForeground(new Color(60, 60, 60));
			lblLevel.setFont(new Font("Raleway Medium", Font.PLAIN, 17));
			lblLevel.setBorder(border);
//			lblLevel.setBounds(5, -4, 37, 31);
			panelEtudiant.add(lblLevel);
			
			
			if (i == 0) {
				panelEtudiant.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (Math.round(splitPane.getDividerLocation()*0.1) == Math.round(splitPane.getMaximumDividerLocation()*0.1)) {
							splitPane.setDividerLocation(0.32);
						} else {
							splitPane.setDividerLocation(1.0);
						}
					}
				});
			}
		}
	}
	
	public static void addList(ItemEtudiant item) {
		arrItemEtudiant.add(item);
	}
	public static void removeList(ItemEtudiant item) {
		arrItemEtudiant.remove(item);
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
		this.photo = new ImageIcon(ItemEtudiant.class.getResource(path));
	}
	
	public String getArrival() {
		return this.arrival;
	}
	public String getName() {
		return this.name;
	}
	public String getLevel() {
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
