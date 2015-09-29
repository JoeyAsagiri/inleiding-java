package h5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht51 extends Applet {
	
	    //declaratie.
	    Color opvulkleur;
	    Color lijnkleur;
	    int breedte;
	    int hoogte;

	    public void init() {
	        //initialisatie. 
	        opvulkleur = Color.MAGENTA;
	        lijnkleur = Color.BLACK;
	        breedte = 200;
	        hoogte = 100;
	    }

	    public void paint(Graphics g) {
	        //teken rechthoek
	        g.drawRect(100, 100, breedte, hoogte);
	        //teken afgeronde rechthoek
	        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
	        //teken gevulde rechthoek
	        g.setColor(opvulkleur);
	        g.fillRect(315, 100, breedte, hoogte);
	        //teken ovaal
	        g.setColor(lijnkleur);
	        g.drawOval(315, 100, breedte, hoogte);
	        //teken gevulde ovaal
	        g.setColor(opvulkleur);
	        g.fillOval(315, 225, breedte, hoogte);
	        g.fillArc(530, 100, breedte, hoogte, 0, 45);
	        g.setColor(lijnkleur);
	        g.drawLine(100, 10, breedte, 10);
	        g.drawArc(530, 100, breedte, hoogte, 0, 360);
	        g.drawOval(580, 225, hoogte, hoogte);
	    }
	}

