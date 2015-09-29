package h12;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht1 extends Applet {
    double salaris[];
	double getal;
		
    public void init() {
        salaris = new double [10];
		
        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        
        for (int teller = 0; teller < 10; teller ++) {
        	getal += salaris[teller];       	
        }
    }
    
    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
        g.drawString("Het gemiddelde is: " + getal / 10, 100, 20);
    }
}


