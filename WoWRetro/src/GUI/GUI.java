package GUI;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Logic.AddEnemy;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.Font;

public class GUI extends JFrame implements ActionListener{

	AddEnemy AE=new AddEnemy();
	
	JButton JBStart=new JButton();
	JButton JBEnd=new JButton();
	JLabel JLT=new JLabel();
	
	public GUI() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(255, 255, 255));
		
		getContentPane().setLayout(null);
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
		
		getContentPane().add(JBStart);
		getContentPane().add(JBEnd);
		
		JLabel lblIsland = new JLabel("Island Paradice");
		lblIsland.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lblIsland.setBounds(418, 72, 513, 50);
		getContentPane().add(lblIsland);
		
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
