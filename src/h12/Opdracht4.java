package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet {

	TextField tekstvak;
	Button knop;
	int[] getal = new int[10];
	String z;	
	double[] tabel = {1,2,3,4,5,6,7,8,9,10};
	
	public void init() {
		tekstvak = new TextField("",15);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener(new KnopListener());
		add(knop);
		z = "";
	}
	
	public void paint(Graphics g){
		g.drawString("" +z, 20, 40);
	}
	
	class KnopListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
}
