package h8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class H8 extends Applet {
    String s;
	
	Button invoer;
	Button reset;
	Label label;
	TextField tekstvak;
	
	
	public void init() {
		label = new Label("voer wat in");
		tekstvak = new TextField("", 15);
		invoer = new Button("invoer");
		reset = new Button("reset");
		
		add(label);
		add(tekstvak);
		add(invoer);
		add(reset);
		s ="";
		
		invoer.addActionListener( new KnopListener() );
		reset.addActionListener( new Knop2Listener() );
		
	}
	
	 class KnopListener implements ActionListener  {
			public void actionPerformed( ActionEvent e) {
				 s = tekstvak.getText();
				 repaint();				        				 
			}
	 }
	 
	 class Knop2Listener implements ActionListener  {
		 public void actionPerformed( ActionEvent c) {
			 tekstvak.setText("");
			 s = "";
			 repaint();
		 }
	 }
	public void paint(Graphics g) {
			g.drawString("" + s , 50, 50);
		
		
	}
	
}

