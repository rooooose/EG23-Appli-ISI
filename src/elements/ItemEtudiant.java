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

// Représente un item de la liste d'étudiants lors de l'affichage du résultat de recherche
public class ItemEtudiant {
	
private static List<ItemEtudiant> arrItemEtudiant = new ArrayList<ItemEtudiant>();
	
	private String level;
	private String name;
	private ImageIcon status;
	private ImageIcon photo = new ImageIcon(ItemEtudiant.class.getResource("/icons/menu/white/photo_default_x76.png"));
	
	
	public ItemEtudiant(String name, String level, String status) {
		this.name = name;
		this.status = new ImageIcon(ItemEtudiant.class.getResource("/icons/"+status+".png"));
		this.level = level;
	}
	
	
	private static void initItems() {
		String[] arrLevel = {"ISI4", "ISI4", "ISI1", "ISI2", "ISI6", "ISI5", "ISI3"};
		String[] arrStatus = {"critique", "attention", "excellence", "normal", "attention", "normal", "normal"};
		String[] arrName = {"Vincent Florent", "Jean Lassale", "C\u00E9dric Villani", "Rose Tixier", "Martin Luther King", "Rosa Parks", "Youri Gagarine"};
		
		for (int i=0;i<arrName.length;i++) {
			ItemEtudiant.addList(new ItemEtudiant(arrName[i], arrLevel[i], arrStatus[i]));
		}
	}
	
	public static void initPanelItems(JPanel panelResult, JSplitPane splitPane) {
		if (arrItemEtudiant.isEmpty()) {
			initItems();
		}
		
		final int itemWidth = 410;
		final int itemHeight = 90;
		
		// Elements graphiques pour chaque item
		for (int i=0;i<arrItemEtudiant.size();i++) {

			JPanel panelEtudiant = new JPanel();
			panelEtudiant.setPreferredSize(new Dimension(itemWidth, itemHeight));
			panelEtudiant.setBackground(new Color(255, 255, 255));
			panelEtudiant.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 2));
			panelEtudiant.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			panelResult.add(panelEtudiant);
			
			JLabel lblPhoto = new JLabel("");
			lblPhoto.setIcon((arrItemEtudiant.get(i).getPhoto()));
			panelEtudiant.add(lblPhoto);
			
			JLabel lblName = new JLabel(arrItemEtudiant.get(i).getName());
			lblName.setForeground(new Color(60, 60, 60));
			lblName.setFont(new Font("Raleway Medium", Font.PLAIN, 18));
			panelEtudiant.add(lblName);
			

			Border border = BorderFactory.createCompoundBorder(
			        BorderFactory.createLineBorder(ColorPalette.BKD_NAVBAR0.getColor()), 
			        BorderFactory.createEmptyBorder(5, 8, 5, 8));
			
			JLabel lblLevel = new JLabel(arrItemEtudiant.get(i).getLevel());
			lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
			lblLevel.setForeground(ColorPalette.BKD_NAVBAR0.getColor());
			lblLevel.setFont(new Font("Raleway Medium", Font.PLAIN, 17));
			lblLevel.setBorder(border);
			lblLevel.setBackground(ColorPalette.BKD_BLUE_VERY_LIGHT.getColor());
			lblLevel.setOpaque(true);
			panelEtudiant.add(lblLevel);
			
			JLabel lblStatut = new JLabel(arrItemEtudiant.get(i).getStatusImg());
			panelEtudiant.add(lblStatut);
			
			//Seule la fonction clic du 1er item de la liste a été implémentée
			if (i == 0) {
				panelEtudiant.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (Math.round(splitPane.getDividerLocation()*0.1) == Math.round(splitPane.getMaximumDividerLocation()*0.1)) {
							splitPane.setDividerLocation(0.38);
							panelEtudiant.setBackground(new Color(240,240,240));
						} else {
							splitPane.setDividerLocation(1.0);
							panelEtudiant.setBackground(Color.WHITE);
						}
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						panelEtudiant.setBackground(new Color(240,240,240));
						
					}
					@Override
					public void mouseExited(MouseEvent e) {
						if (Math.round(splitPane.getDividerLocation()*0.1) == Math.round(splitPane.getMaximumDividerLocation()*0.1)) {
							panelEtudiant.setBackground(Color.WHITE);
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
	
	public String getName() {
		return this.name;
	}
	public String getLevel() {
		return this.level;
	}
	public ImageIcon getStatusImg() {
		return this.status;
	}
	
	public ImageIcon getPhoto() {
		return this.photo;
	}


}
