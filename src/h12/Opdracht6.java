package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet {
	int tal;
	int tel;
    int gezocht;
	boolean gevonden;
	TextField tekstvak;
	Button knop;	
	int[] tabel = {1,1,2,2,2,2,3,4,4,4,5,5,6,6,6,6,6,7,7,8,9,9,9,9,10,10,10};
	
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
		g.drawString("De waarde ["+ gezocht +"] is "+ tal +" keer gevonden.", 20, 40);
		}
		else {
	    g.drawString("De waarde ["+ gezocht +"] is niet gevonden.", 20, 40);		
	    
		}
		}
    }
	
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		 tal = 0;
		 tel ++;
		 gevonden = false;
		 String s = tekstvak.getText();
	     gezocht = Integer.parseInt(s);
	     int teller = 0;
	        while(teller < tabel.length) {
	            if(tabel[teller] == gezocht) {
	                tal ++;
	                gevonden = true;
	            }	     
	            teller ++;
	        }
	     repaint();
		}
	}
}
