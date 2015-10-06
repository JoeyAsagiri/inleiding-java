package totenmet_h4;

import java.awt.*;
import java.applet.*;

public class h4opdracht7 extends Applet {

	public void init() {
		setBackground(Color.gray);
		
	}
	
	public void paint(Graphics g) {
	g.setColor(Color.red);
	g.fillRoundRect(20, 80, 200, 200, 10, 10);
	
	g.setColor(Color.white);
	g.fillRoundRect(40, 100, 20, 20, 10, 10);
	g.fillRoundRect(40, 240, 20, 20, 10, 10);
	g.fillRoundRect(180, 100, 20, 20, 10, 10);
	g.fillRoundRect(180, 240, 20, 20, 10, 10);
	}
}
