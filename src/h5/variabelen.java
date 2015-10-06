package h5;

import java.awt.*;
import java.applet.*;

public class variabelen extends Applet {
	int Valerie = 40;
	int Jeroen = 100;
	int Hans = 80;
	public void init() {

	}
	
	public void paint(Graphics g) {
		g.drawRect(80, 60, 750, 500);
		g.drawString("100", 60, 550);
		g.drawString("80", 60, 460);
		g.drawString("60", 60, 340);
		g.drawString("40", 60, 220);
		g.drawString("20", 60, 120);
		g.drawString("Valerie", 180, 600);
		g.drawString("Jeroen", 360, 600);
		g.drawString("Hans", 540, 600);
		
		g.drawRect(160, 61, 80, Valerie * 4);
		g.fillRect(160, 61, 80, Valerie * 4);
		g.setColor(Color.red);
		g.drawRect(340, 61, 80, Jeroen * 5);
		g.fillRect(340, 61, 80, Jeroen * 5);
		g.setColor(Color.blue);
		g.drawRect(540, 61, 80, Hans * 5);
		g.fillRect(540, 61, 80, Hans * 5);
	}

}
