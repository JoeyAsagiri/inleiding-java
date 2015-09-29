package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

	public void init() {}
	
	public void paint (Graphics g){
	int teller = 0;
	int y = 0;
	int drietal = 3;
	int x = 0;
	int getal = 0;
	while(teller < 10) {
		teller += 1;
		y += 15;
		x += 1;
	    getal = drietal * x;
		g.drawString("" + getal, 20, y);
		
	}
		
	}
}
