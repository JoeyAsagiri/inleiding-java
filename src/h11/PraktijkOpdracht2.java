package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdracht2 extends Applet {
int tal;
int getal;
String s;
Button knop;
	public void init() {

    knop = new Button ("Ok");
    knop.addActionListener (new Listener());
   
    add(knop);
	
	}	
	class Listener implements ActionListener  {
		 public void actionPerformed( ActionEvent e) {					
	         tal ++;
			 repaint();
		   }
		 }
	public void paint (Graphics g){
	int teller = 0;
	int y = 50;
	int x = 0;
	if (tal > 0){
	while(teller < 10) {
		teller += 1;
		y += 15;
		x += 1;
	    getal = tal * x;
		g.drawString(tal + " x " + x + "= " + getal, 20, y);
	  }
	}
  }
}
