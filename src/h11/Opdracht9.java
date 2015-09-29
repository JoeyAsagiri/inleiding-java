package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht9 extends Applet {

	public void init() {}
	
	public void paint (Graphics g) {
		int y = 0;
		int teller = 0;
		int x = 250;
		
		 while(teller < 100) {
			y += 10;
			x -= 5;
			g.drawArc(100,100,y,y,0,360);	
			teller +=1;
		}
	}
}
