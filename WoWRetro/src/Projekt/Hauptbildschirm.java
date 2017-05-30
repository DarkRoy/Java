package Projekt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Hauptbildschirm extends JFrame implements ActionListener{

		
		private JButton BTN1 = new JButton("Charakter auswahl");
		private JButton	BTN2 = new JButton("Spiel starten");
		private JButton QUIT = new JButton("Beenden");
		
		
		public Hauptbildschirm() {
			
			BTN1.addActionListener(this);
			BTN2.addActionListener(this);
			QUIT.addActionListener(this);
			
			setLayout(null);
			
			BTN1.setBounds(30,30,180,30);
			add(BTN1);
			BTN2.setBounds(90,30,180,30);
			add(BTN2);
			QUIT.setBounds(60,30,180,30);
			add(QUIT);
			
			setSize(550,500);
			setVisible(true);
			
			
			
		}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
