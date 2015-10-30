package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet {
	int tel;
    int gezocht;
	boolean gevonden;
	TextField tekstvak;
	Button knop;	
	int[] tabel = {1,2,3,4,5,6,7,8,9,10};
	
	public void init() {
		gevonden = false;
		tekstvak = new TextField("",15);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener(new KnopListener());
		add(knop);
	}
	
	public void paint(Graphics g){
		if (tel >=1){
		if(gevonden == true) {	
		g.drawString("De waarde ["+ gezocht +"] is gevonden.", 20, 40);
		}
		else {
	    g.drawString("De waarde ["+ gezocht +"] is niet gevonden.", 20, 40);		
	    
		}
		}
    }
	
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		 tel ++;
		 gevonden = false;
		 String s = tekstvak.getText();
	     gezocht = Integer.parseInt(s);
	     int teller = 0;
	        while(teller < tabel.length) {
	            if(tabel[teller] == gezocht) {
	                gevonden = true;
	            }	     
	            teller ++;
	        }
	     repaint();
		}
	}
}
