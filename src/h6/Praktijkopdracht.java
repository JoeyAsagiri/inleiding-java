package h6;

import java.awt.*;

import java.applet.*;

public class Praktijkopdracht extends Applet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

double a, b, c, d, e;

double uitkomst;

int uitkomst2;

double uitkomst3;



public void init() {

a =  5.9;

b =  6.3;

c =  6.9;

d = 3;

e = 10;

uitkomst = ((a + b + c) / d) ;

uitkomst2 = (int) (uitkomst * e);

uitkomst3 = (uitkomst2 / e);

}

public void paint(Graphics g) {

g.drawString("De uitkomst is:"  + uitkomst3, 20, 20);

}

}