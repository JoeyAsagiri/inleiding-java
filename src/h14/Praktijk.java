package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;




@SuppressWarnings("serial")
public class Praktijk extends Applet {
	

Image potlood;
Label label;
TextField tekstvak;
Button knop;
URL pad;
int invoer;
int aantal;


public void init () {
setSize(400,300);
aantal = 24;


pad = getDocumentBase();
label = new Label("Hoeveel potloden neem je(1, 2 of 3)?");
tekstvak = new TextField("           ");
knop = new Button("speel");
knop.addActionListener(new Knopluistenaar());
potlood = getImage(pad, "potlood.png");



add(label);
add(tekstvak);
add(knop);


}

public void paint(Graphics g) {
	
	int y = 75;
	int x = 50;
		if (aantal > 1)
	for (int a = 1; a < aantal; a++) {
	g.drawImage(potlood,x,y,10,10,this);
	x += 20;
	if (a == 5)
		x = 50;
	if (a == 10)
	    x = 50;
	if (a == 10)
		x = 50;
	if (a == 15)
		x = 50;
	if (a == 20)
		x = 50;
	if (a == 5)
		y += 25;		
	if (a == 10)
		y += 25;
	if (a == 15)
		y += 25;
	if (a == 20)
		y += 25;

	}
	
	
}
class Knopluistenaar implements ActionListener {
	public void actionPerformed(ActionEvent e) {
aantal = 20;		
}
}

}