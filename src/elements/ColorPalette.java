package elements;

import java.awt.Color;

import javax.swing.UIManager;

public enum ColorPalette {
	//BACKGROUND
	BKD_HEADER(),
	BKD_DEFAULT(UIManager.getColor("Button.background")),
	
	BKD_NAVBAR0(new Color(0xff094067)),
	BKD_NAVBAR1(new Color(0xff0e64a1)),
	BKD_NAVBAR2(new Color(100, 149, 237)),
	BKD_NAVBAR3(new Color(106, 90, 205)),
	BKD_NAVBAR4(new Color(153, 50, 204)),
	
	BKD_NAVBAR0_LIGHT(new Color(15, 97, 153)),
	BKD_NAVBAR1_LIGHT(new Color(16, 120, 188)),
	BKD_NAVBAR2_LIGHT(new Color(126, 170, 247)),
	BKD_NAVBAR3_LIGHT(new Color(138, 123, 229)),
	BKD_NAVBAR4_LIGHT(new Color(183, 91, 229)),
	
	BKD_SEMESTRE(),
	BKD_ENSEIGN(),
	BKD_UE(),
	BKD_REPART(new Color(106, 90, 205).brighter()),
	BKD_ES(),
	
	BKD_BLUE_VERY_LIGHT(new Color(240, 255, 255)),
	
	//TITLE
	TLE_BRANCHE("0x918f90"),
	TLE_SEMESTRE(),
	TLE_ENSEIGN(),
	TLE_UE(),
	TLE_REPART(),
	TLE_ES();
	
	private String hex;
	private Color color;
	
	ColorPalette() {
		this.hex = "0xffffff";
		this.color = Color.decode(hex);
	}
	
	ColorPalette(String hex) {
		this.hex = hex;
		this.color = Color.decode(hex);
	}
	
	ColorPalette(Color c) {
		this.color = c;
		this.hex = String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
	}
	
	public String getHex() {
		return hex;
	}
	
	public Color getColor() {
		return color;
	}
}
