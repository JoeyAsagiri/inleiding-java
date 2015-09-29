package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

	Button knop[] = new Button[25];

	public void init() {		 
		 for (int teller = 0; teller < 25; teller ++) {	            
		 knop[teller] = new Button("okay");
		 
		 add(knop[teller]);
		 }
	}	
}

