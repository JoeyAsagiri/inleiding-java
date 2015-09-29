package h8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class H8_2 extends Applet {

	int man;
	int vrouw;
	int mleerling;
	int vleerling;
	int totaal;
	
	Button Man;
	Button Vrouw;
	Button Mleerling;
	Button Vleerling;
	
	public void init() {
		Man = new Button("Man");
		Vrouw = new Button("Vrouw");
		Mleerling = new Button("Mannelijke leerling");
		Vleerling = new Button("Vrouwelijke leerling");
		
		add (Man);
		add (Vrouw);
		add (Mleerling);
		add (Vleerling);
		
		Man.addActionListener( new Listener1 () );
		Vrouw.addActionListener( new Listener2 () );
		Mleerling.addActionListener( new Listener3 () );
		Vleerling.addActionListener( new Listener4 () );		
	}	
	class Listener1 implements ActionListener  {
		public void actionPerformed( ActionEvent e) {			 
			 man = man + 1;
			 totaal = totaal + 1;
			 repaint();
		}
	}	
	class Listener2 implements ActionListener  {
		public void actionPerformed( ActionEvent e) {			 
			 vrouw = vrouw + 1;
			 totaal = totaal + 1;
			 repaint();
		}
	}	
	class Listener3 implements ActionListener  {
		public void actionPerformed( ActionEvent e) {			 
			 mleerling = mleerling + 1;
			 totaal = totaal + 1;
			 repaint();
		}
	}	
	class Listener4 implements ActionListener  {
		public void actionPerformed( ActionEvent e) {			 
			 vleerling = vleerling + 1;
			 totaal = totaal + 1;
			 repaint();
		}
	}
	
	public void paint(Graphics g) {
		g.drawString("Mannen: " + man ,50,50);
		g.drawString("Vrouwen: " + vrouw ,50,70);
		g.drawString("Mannelijke Leerlingen: " + mleerling ,50,90);
		g.drawString("Vrouwelijke Leerlingen: " + vleerling,50,110);
	
		g.drawString("Totaal: " + totaal ,50,140);
	}
}