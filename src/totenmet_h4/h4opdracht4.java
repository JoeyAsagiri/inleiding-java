package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht4 extends Applet {
	
	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.drawRect(80, 60, 750, 500);
		g.drawString("20", 60, 500);
		g.drawString("40", 60, 400);
		g.drawString("60", 60, 300);
		g.drawString("80", 60, 200);
		g.drawString("100", 60, 100);
		g.drawString("Valerie", 180, 600);
		g.drawString("Jeroen", 360, 600);
		g.drawString("Hans", 540, 600);
		
		g.drawRect(160, 380, 80, 180);
		g.fillRect(160, 380, 80, 180);
		g.setColor(Color.red);
		g.drawRect(340, 100, 80, 460);
		g.fillRect(340, 100, 80, 460);
		g.setColor(Color.blue);
		g.drawRect(540, 200, 80, 360);
		g.fillRect(540, 200, 80, 360);
	}

}
