package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

	public void init() {}
	
	public void paint(Graphics g) {
        int teller = 0;
        int y = 0;
		
        do {
            y += 20;
            g.drawLine(y , 300, y, 60 );            
            teller++;
        } while (teller < 10);
    }
}
