package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht3 extends Applet {

	public void init() {
		
	}
	
	public void paint(Graphics g) {
		
	g.drawRoundRect(20, 20, 50, 500, 10, 10);
	g.drawRoundRect(70, 70, 250, 250, 10, 10);
	g.setColor(Color.red);
	g.fillRoundRect(70, 70, 250, 80, 10, 10);
	g.setColor(Color.blue);
	g.fillRoundRect(70, 240, 250, 80, 10, 10);
	}
}
