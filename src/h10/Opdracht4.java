package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
 TextField tekstvak;
 TextField tekstvak2;
 Label label;
 Label label2;
 String s, z, tekst, tekst2;
 int getal;
 int jaartal = 1;

 public void init() {
     tekstvak = new TextField("", 5);
     label = new Label ("vul een maandnummer in");
     tekst = "";
     tekstvak.addActionListener( new TekstvakListener() );    
     tekst2 = "";
     tekstvak2 = new TextField("", 5);
     label2 = new Label ("Vul een jaar in");
     tekstvak2.addActionListener( new Tekstvak2Listener() );
     add(label);
     add(tekstvak);    
     add(tekstvak2);
     add(label2);
     setSize(400 , 200);
 }
 
 public void paint(Graphics g) {
	 g.drawString(tekst, 5, 80 );
	 g.drawString(tekst2, 5, 100);
 }
 
 class TekstvakListener implements ActionListener  {
	 public void actionPerformed( ActionEvent e) {					
		s = tekstvak.getText();	
		getal = Integer.parseInt( s);		
		switch(getal) {
		case 1:
		tekst = "Januari, 31 dagen";
		break;		 
		case 2:
		if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || 
	    jaartal % 400 == 0 ) {
		tekst = "Februari, 29 dagen";
		}
		else {
		tekst = "Februari, 28 dagen";	
	    }
		break;
		case 3:
		tekst = "Maart, 31 dagen";
		break;
		case 4:
		tekst = "April, 30 dagen";
		break;
		case 5:
		tekst = "Mei, 31 dagen";
		break;
		case 6: 
	    tekst = "Juni, 30 dagen";
		break;
		case 7:
		tekst = "Juli, 31 dagen";
		break;
		case 8:
		tekst = "Augustus, 31 dagen";
		break;
		case 9:
		tekst = "September, 30 dagen";
		break;
		case 10:
		tekst = "October, 31 dagen";
		break;
		case 11:
		tekst = "November, 30 dagen";
		break;
		case 12:
		tekst = "December, 31 dagen";
		break;
		default:
		tekst = "U hebt een verkeerd nummer ingevoerd";
		break;
		}
		repaint();
		
	}
}
 class Tekstvak2Listener implements ActionListener  {
	 public void actionPerformed( ActionEvent e) {					
		z = tekstvak2.getText();	
		jaartal = Integer.parseInt( z);
		if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || 
        		jaartal % 400 == 0 ) {
            tekst2 = ""+ jaartal + " is een schrikkeljaar";        
    
            if (getal == 2) {
        	tekst = "Februari, 29 dagen";        
            }
          
		}		
        else {        	 
            tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            if (getal == 2) {
            	tekst = "Februari, 28 dagen";        
            }
        }	     
        repaint();
		
	 }
 }
}