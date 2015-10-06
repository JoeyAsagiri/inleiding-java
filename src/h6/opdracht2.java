package h6;

import java.awt.*;
import java.applet.*;

public class opdracht2 extends Applet {
	
	int a,b,c,d, uitkomst;
	
	public void init() {
	a = 1;
	b = 24;
	c = 8760;
	d = 3600;
	}

	public void paint(Graphics g) {
	g.drawString("seconden in een uur: " + a * d , 20, 20);	
	g.drawString("seconden in een dag: " + b * d , 20, 40);
	g.drawString("seconden in een jaar: " + c * d , 20, 60);
	}
}
