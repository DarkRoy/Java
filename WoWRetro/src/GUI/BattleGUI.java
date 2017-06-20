package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Logic.AddEnemy;
import Logic.Battle;
import Logic.CHAR;

import java.awt.Font;

public class BattleGUI  extends JFrame implements ActionListener{
	JButton JBATK1=new JButton();
	JButton JBATK2=new JButton();
	JLabel lblKampflog = new JLabel("");
	JLabel lblDamage2 = new JLabel("");
	JLabel lbldamage1 = new JLabel("");
	JLabel lblImage = new JLabel();
	
	
	ImageIcon image = new ImageIcon("src/Neutral.PNG");
	ImageIcon image2 = new ImageIcon("src/Schwerthieb.PNG");
	ImageIcon image3 = new ImageIcon("src/Schildhieb.PNG");
	ImageIcon BackGround = new ImageIcon("src/Kampf-GUI.PNG");
	
	
	Battle B=new Battle();
	int AA;
	private final JLabel lblBackGround = new JLabel("");
	
	
	public BattleGUI() {
		
		getContentPane().setLayout(null);
		this.setSize(1262,673);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		this.setResizable(false);
		
		JBATK1.setBounds(100, 50, 200, 50);
		JBATK2.setBounds(100, 120, 200, 50);
		
		JBATK1.setText("Schwerthieb");
		JBATK2.setText("Schildschlag");
		
		JBATK1.addActionListener(this);
		JBATK2.addActionListener(this);
		
		
		getContentPane().add(JBATK1);
		getContentPane().add(JBATK2);
		
		
		lblKampflog.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblKampflog.setBounds(415, 57, 402, 55);
		getContentPane().add(lblKampflog);
		
		lblDamage2.setBounds(919, 270, 304, 42);
		getContentPane().add(lblDamage2);
		
		lbldamage1.setBounds(100, 270, 62, 42);
		getContentPane().add(lbldamage1);
			
		
		lblImage.setBounds(114, 428, 177, 200);	
		getContentPane().add(lblImage);
		lblImage.setIcon(image);
		
		
		lblBackGround.setBounds(0, 0, 1256, 638);
		getContentPane().add(lblBackGround);
		lblBackGround.setIcon(BackGround);
		
		
		
		
}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBATK1){
			lblImage.setIcon((image2));
			AA = 3;
			lblKampflog.setText("Du hast Schwerthieb eingesetzt");
			lblDamage2.setText("Gegner hat "+ B.Schlag1 +" Schaden erlitten !");


			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;
		
			B.Attack(AA);
			JBATK1.disable();
		while (elapsedTime < 0.5*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
	}
				
		if(event.getSource()==JBATK2){
			lblImage.setIcon((image3));
			AA = 1;
			lblKampflog.setText("Du hast Schildschlag eingesetzt");
			lblDamage2.setText("Gegner hat "+ B.Schlag2 +" Schaden erlitten !");
			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;
			B.Attack(AA);
			JBATK1.disable();
		while (elapsedTime < 0.5*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
		JBATK1.enable();
		}
		
	}	
}
