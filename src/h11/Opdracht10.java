package h11;
import java.applet.*;
import java.awt.*;
public class Opdracht10 extends Applet{
	public void init() {}	
	public void paint(Graphics g) {
	    int y = 50;
	    int x = 50;
	    int breedte = 50;
	    int hoogte = 50;	    
	    g.setColor(Color.gray);
	    g.fillRect(0, 0, 500, 600);	    
	  for (int teller = 0; teller < 8; teller++) {
      teller++;  
	  y += hoogte;
	  x = 50;	  
	    for (int kolom = 0; kolom < 8; kolom++) {			
	        if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
	            g.setColor(Color.black);
	            g.fillRect(x, y, breedte, hoogte);
	        } else {
	            g.setColor(Color.white);
	            g.fillRect(x, y, breedte, hoogte);
	        }
	        x += breedte;
	    }	    
	    x = 50;
	    y += hoogte;    
	    for (int kolom = 0; kolom < 8; kolom++) {
	        if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
	            g.setColor(Color.white);
	            g.fillRect(x, y, breedte, hoogte);
	        } else {
	            g.setColor(Color.black);
	            g.fillRect(x, y, breedte, hoogte);				
	        }
	        x += breedte;
	    }    
	  }
	}
}