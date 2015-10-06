package h6;

import java.awt.*;
import java.applet.*;

public class opdracht3 extends Applet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

int a,b ;
int uitkomst;

public void init() {
a = 2147483647;
b = 1;


}

public void paint(Graphics g) {
g.drawString("uitkomst: " + (a + b) , 20, 20);


}
}