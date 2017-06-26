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

/**
 * @author Nicola / Nemanja / Garcia
 * @version 1.0
 */

public class GUI extends JFrame implements ActionListener{
	
	JButton JBStart=new JButton();
	JButton JBEnd=new JButton();
	JLabel JLT=new JLabel();
	JLabel lblBackGround = new JLabel();
	ImageIcon BackGround = new ImageIcon("src/Kampf-GUI.PNG");
	
	/**
	 * In dieser Methode, wird das ganze GUI auspositioniert
	 */
	public GUI() {
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		this.setTitle("Island Paradice");
		
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
		
		
		lblBackGround.setBounds(0, 0, 1262, 673);
		getContentPane().add(lblBackGround);
		lblBackGround.setIcon(BackGround);
		
       
	
	}

	

	/** 
	 * Hier wird festgelegt was passiert, wenn einer der beiden Knöpfe betätigt wird
	 */
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
