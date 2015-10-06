package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht2 extends Applet {

	public void init() {
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.drawRect(80, 120, 400, 400);
		g.fillRect(80, 120, 400, 400);
		
		g.setColor(Color.red);
		g.drawRect(240, 420, 60, 100);
		g.fillRect(240, 420, 60, 100);
		
		g.drawLine(80, 120, 280, 40);
		g.drawLine(480, 120, 280, 40);
		
		g.setColor(Color.blue);
		g.drawRect(150, 250, 80, 80);
		g.fillRect(150, 250, 80, 80);
		g.drawRect(350, 250, 80, 80);
		g.fillRect(350, 250, 80, 80);
	}
}
