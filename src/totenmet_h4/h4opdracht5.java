package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht5 extends Applet {
	
	public void init() {
		setBackground(Color.blue);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.drawArc(20, 80, 100, 75, 0, 360);
		g.fillArc(20, 80, 100, 75, 0, 360);
	}

}
