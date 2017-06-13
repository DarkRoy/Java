package GUI;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Logic.AddEnemy;

public class GUI extends JFrame implements ActionListener{

	AddEnemy AE=new AddEnemy();
	
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
		
		java.net.URL imgURL = getClass().getResource("C:/Users/vmadmin/Desktop/Kampf-GUI.jpeg");
		ImageIcon icon = new ImageIcon(imgURL);
        JLT.setIcon(icon);           
	
	}

	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBStart){
			BattleGUI BG=new BattleGUI();
			this.dispose();
			AE.AddEnemyEntry();
			
		}
		if(event.getSource()==JBEnd){
			this.dispose();
		}
	}
}
