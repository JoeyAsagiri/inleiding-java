package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

	public void init() {}
	
	public void paint (Graphics g) {
		int y = 0;
		int teller = 0;
		
		 while(teller < 5) {
			y += 20;
			g.drawRect(y,y,20,20);	
			teller +=1;
		}
	}
}
