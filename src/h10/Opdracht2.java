package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht2 extends Applet {

TextField invoer;
Button knop;
double getal;
double hoogstegetal;
double laagstegetal;

public void init() {

invoer = new TextField ("",20);
knop = new Button ("Ok");

add (invoer);
add (knop);

knop.addActionListener(new Listener());
laagstegetal = 2147483647;
}

class Listener implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		String E = invoer.getText();
		getal = Double.parseDouble( E);		
        if (getal > hoogstegetal)
			hoogstegetal = getal;
              
        if (getal < laagstegetal)
        	laagstegetal = getal;
                		
		repaint();		
	}
}


public void paint(Graphics g) {
if (getal > 0)
	g.drawString("Het hoogste getal is: " + hoogstegetal ,30,50);
if (getal > 0 )
    g.drawString("Het laagste getal is: " + laagstegetal ,30, 70);
}
}
