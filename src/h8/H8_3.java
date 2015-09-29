package h8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class H8_3 extends Applet {
	
double prijs;
double invoer;
	
TextField tekst;
Label label;
Button knop;

public void init() {
	
tekst = new TextField ("",10);
label = new Label ("Vul een bedrag in");
knop = new Button ("Ok");

add (tekst);
add (label);
add (knop);

knop.addActionListener( new Listener () );
}

class Listener implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		 String E = tekst.getText();
		 invoer = Double.parseDouble( E);
		 prijs = invoer * 1.19;
         repaint();	
	}
}

public void paint(Graphics g) {
if (prijs > 0);
g.drawString("Prijs inclusief BTW: €" + prijs ,50,50);
}

}
