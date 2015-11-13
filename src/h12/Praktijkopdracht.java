package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	TextField naam;
	TextField nummer;
	Button Ok;
	String[] Tabel1 = new String[10];
	String[] Tabel2 = new String[10];
	Label label;
	int teller = 0;
	int okay = 0;
	
	public void init() {	
		setSize(400,400);
		label = new Label("Vul 10 namen en nummers in");
		naam = new TextField("          ");
		nummer = new TextField("          ");
		Ok = new Button("Ok");
		Ok.addActionListener(new Knop());
		add(label);
		add(naam);
		add(nummer);
		add(Ok);
	}

	public void paint(Graphics g) {
		if (okay < 10){
			g.drawString("Vul nog "+ (10 - okay) +" namen en nummers in", 50, 70);
		}
		
		if (teller == 10){	
			g.drawString("Namen", 50, 70);
			g.drawString("Nummers", 200, 70);
			int x = 80;
			for (int teller2 = 0; teller2 < 10; teller2 ++) {
		    x += 20;		    
		g.drawString("" + Tabel1[teller2], 50, x);
		g.drawString("" + Tabel2[teller2], 200, x);		
			}			
		}
	}

	class Knop implements ActionListener {
		public void actionPerformed(ActionEvent e) {	
			okay++;
		        if (teller < 10) {
		        	Tabel1[teller] = naam.getText();
					Tabel2[teller] = nummer.getText();		
					teller++;
		        }			
			repaint();
		}
		
	}

}
