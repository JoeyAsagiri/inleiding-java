package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht6 extends Applet{

	public void init() {
		setBackground(Color.white);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		g.drawRoundRect(60, 60, 80, 300, 10,10);
		g.fillRoundRect(60, 60, 80, 300, 10,10);
		g.drawRoundRect(80, 360, 30, 400, 10,10);
		g.fillRoundRect(80, 360, 30, 400, 10,10);
		
		g.setColor(Color.red);
		g.drawArc(80, 80, 40, 40, 0, 360);
		g.fillArc(80, 80, 40, 40, 0, 360);
		
		g.setColor(Color.orange);
		g.drawArc(80, 160, 40, 40, 0, 360);
		g.fillArc(80, 160, 40, 40, 0, 360);
		
		g.setColor(Color.green);
		g.drawArc(80, 240, 40, 40, 0, 360);
		g.fillArc(80, 240, 40, 40, 0, 360);
	}
}
