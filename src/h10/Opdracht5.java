package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Opdracht5 extends Applet {

	TextField tekstvak;
	Label label;
	int getal;
	String s, tekst;
	int getallen;
	int getallen2;
	int knop;
	Button button;
	
	public void init() {
    tekstvak = new TextField("", 5);
    label = new Label("Voer het cijfer in");
    tekstvak.addActionListener( new TekstvakListener());
    button = new Button("OK");
    button.addActionListener(new KnopvakListener());
    
    add(tekstvak);
    add(label);
	add(button);

	knop = 0;
	}
	public void paint(Graphics g) {
		g.drawString("" + tekst, 20, 60);
		
		if (getallen2 > 0) {
		g.drawString("" + getallen2, 20, 120);
		if (getallen2 <= 5) {
			g.drawString("gezakt", 20, 140);
			}
		if (getallen2 >= 6) {
			g.drawString("geslaagt", 20, 140);
			}
		}	
	}
	 class TekstvakListener implements ActionListener  {
		 public void actionPerformed( ActionEvent e) {					
			s = tekstvak.getText();	
			getal = Integer.parseInt( s);
			if (getal <= 5){
				tekst = "onvoldoende";
			}
			if (getal >= 6){
				tekst = "voldoende";
			}
			
			if (getal > 10) {
				tekst = "ongeldig";
			}
			
			if (getal <= 10) {
			knop += 1;
			getallen = getallen + getal;
			}
			repaint();
		 }
}
	 class KnopvakListener implements ActionListener  {
		 public void actionPerformed( ActionEvent f) {
			 getallen2 = getallen / knop;
			 repaint();
		 }
	 }
	 
}