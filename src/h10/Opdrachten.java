package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdrachten extends Applet {

TextField invoer;
Button knop;
double getal;
double hoogstegetal;


public void init() {

invoer = new TextField ("",20);
knop = new Button ("Ok");

add (invoer);
add (knop);

knop.addActionListener(new Listener());

}

class Listener implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		String E = invoer.getText();
		getal = Double.parseDouble( E);		
		if (hoogstegetal < getal)
		hoogstegetal = getal;
		repaint();		
	}
}


public void paint(Graphics g) {
if (getal > 0)
	g.drawString("Het hoogste getal is: " + hoogstegetal ,30,50);
}


}