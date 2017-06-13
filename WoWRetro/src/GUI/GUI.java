package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener{

	JButton JBStart=new JButton();
	JButton JBEnd=new JButton();
	JLabel JLT=new JLabel();
	
	public GUI() {
		
		this.setLayout(null);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		
		JBStart.setBounds(540, 200, 200, 50);
		JBEnd.setBounds(540, 270, 200, 50);
		JLT.setBounds(540, 270, 200, 50);
		JBStart.setText("Starten");
		JBEnd.setText("Beenden");
		
		JBStart.addActionListener(this);
		JBEnd.addActionListener(this);
		
		this.add(JBStart);
		this.add(JBEnd);
		
        ImageIcon threw_icon = new ImageIcon("Kampf-GUI.png"); //Verwandelt URL zu ImageIcon//
        threw_icon = new ImageIcon();
        JLT.setIcon(threw_icon);           
	
	}

	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBStart){
			BattleGUI BG=new BattleGUI();
			this.dispose();
		}
		if(event.getSource()==JBEnd){
			this.dispose();
		}
	}
}
