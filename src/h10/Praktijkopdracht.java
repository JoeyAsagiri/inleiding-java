package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {

	TextField tekstvak;
	Label label;
	int getal;
	String s, tekst;
	
	public void init() {
    tekstvak = new TextField("", 5);
    label = new Label("Voer het cijfer in");
    tekstvak.addActionListener( new TekstvakListener());
    
    add(tekstvak);
    add(label);
	
}
	public void paint(Graphics g) {
		g.drawString("" + tekst, 20, 60);
	}
	 class TekstvakListener implements ActionListener  {
		 public void actionPerformed( ActionEvent e) {					
			s = tekstvak.getText();	
			getal = Integer.parseInt( s);
			switch(getal) {
			case 1:
				tekst = "slecht";
				break;
			case 2:
				tekst = "slecht";
				break;
			case 3:
				tekst = "slecht";
			    break;
			case 4:
				tekst = "Onvoldoende";
				break;
			case 5:
				tekst = "Matig";
				break;
			case 6:
				tekst = "Voldoende";
				break;
			case 7:
				tekst = "Voldoende";
				break;
			case 8:
				tekst = "Goed";
				break;
			case 9:
				tekst = "Goed";
				break;
			case 10:
				tekst = "Goed";
				break;
			default:
				tekst = "Fout getal ingevoerd";			
				break;	
			}
			repaint();
		 }
}
}