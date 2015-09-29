package h8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

@SuppressWarnings("serial")
public class Praktijkopdracht extends Applet {
	
double invoer1;
double invoer2;
double uitkomst;

TextField invul1;
TextField invul2;

Button keer;
Button delen;
Button plus;
Button min;

public void init() {
	
invul1 = new TextField ("",20);
invul2 = new TextField ("",20);

keer = new Button ("*");
delen = new Button ("/");
plus = new Button ("+");
min = new Button ("-");

add (invul1);
add (invul2);
add (keer);
add (delen);
add (plus);
add (min);

keer.addActionListener( new Listener () );
delen.addActionListener( new Listener1() );
plus.addActionListener( new Listener2() );
min.addActionListener( new Listener3() );

}

class Listener implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		 String E = invul1.getText();
		 invoer1 = Double.parseDouble( E);
		 String D = invul2.getText();
		 invoer2 = Double.parseDouble( D);
		 uitkomst = invoer1 * invoer2;
		 invul1.setText(String.valueOf(new Double(uitkomst)));		 
		 invul2.setText("");
		 
         repaint();	
         }
    }

class Listener1 implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		 String E = invul1.getText();
		 invoer1 = Double.parseDouble( E);
		 String D = invul2.getText();
		 invoer2 = Double.parseDouble( D);
		 uitkomst = invoer1 / invoer2;
		 invul1.setText(String.valueOf(new Double(uitkomst)));		 
		 invul2.setText("");
		 
         repaint();	
         }
    }

class Listener2 implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		 String E = invul1.getText();
		 invoer1 = Double.parseDouble( E);
		 String D = invul2.getText();
		 invoer2 = Double.parseDouble( D);
		 uitkomst = invoer1 + invoer2;
		 invul1.setText(String.valueOf(new Double(uitkomst)));		 
		 invul2.setText("");
         repaint();	
         }
    }

class Listener3 implements ActionListener  {
	public void actionPerformed( ActionEvent e) {			
		 String E = invul1.getText();
		 invoer1 = Double.parseDouble( E);
		 String D = invul2.getText();
		 invoer2 = Double.parseDouble( D);
		 uitkomst = invoer1 - invoer2;
		 invul1.setText(String.valueOf(new Double(uitkomst)));		 
		 invul2.setText("");
         repaint();	
         }
    }



}