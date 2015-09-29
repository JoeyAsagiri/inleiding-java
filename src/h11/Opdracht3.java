package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

	public void init() {}
	
	public void paint(Graphics g) {
        int teller = 0;       
		int x = 0;
		int fibonacci = 1;
	    int fibonacci2 = 1;
        int fibonacci3 = 0;
        
		do {
            fibonacci = fibonacci2 + fibonacci3 ;
            fibonacci2 = fibonacci3;
            fibonacci3 = fibonacci;
            x += 15;
            g.drawString("" + fibonacci, 20, x);          
            teller++;
        } while (teller < 11);
    }
}

