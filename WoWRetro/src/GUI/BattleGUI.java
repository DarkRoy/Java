package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Logic.Battle;
import java.awt.Font;

/**
 * @author Nicola / Nemanja / Garcia
 */

@SuppressWarnings("serial")
public class BattleGUI  extends JFrame implements ActionListener{

	JButton JBATK1=new JButton();
	JButton JBATK2=new JButton();
	JLabel lblKampflog = new JLabel("");
	JLabel lblDamage2 = new JLabel("");
	JLabel lblDamage1 = new JLabel("");
	JLabel lblImage = new JLabel();
	JLabel lblImage2 = new JLabel();
	
	
	ImageIcon image = new ImageIcon("src/Neutral.PNG");
	ImageIcon image2 = new ImageIcon("src/Schwerthieb.PNG");
	ImageIcon image3 = new ImageIcon("src/Schildhieb.PNG");
	ImageIcon BackGround = new ImageIcon("src/Kampf-GUI.PNG");
	ImageIcon imageE = new ImageIcon();
	
	
	Battle B=new Battle();
	int AA;
	private final JLabel lblBackGround = new JLabel("");
	private final JLabel lblLebenPlayer = new JLabel();
	private final JLabel lblLebenGegner = new JLabel();
	
	
	/**
	 * In dieser Methode, wird das ganze GUI auspositioniert
	 */
	
	public BattleGUI() {
		
		getContentPane().setLayout(null);
		this.setSize(1262,673);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		this.setResizable(false);
		this.setTitle("Island Paradice");
		
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
		
		lblDamage1.setBounds(100, 270, 200, 42);
		getContentPane().add(lblDamage1);
		
		
		lblImage2.setBounds(919, 428, 177, 200);
		getContentPane().add(lblImage2);
		lblImage2.setIcon(imageE);	
		
		lblImage.setBounds(114, 428, 177, 200);	
		getContentPane().add(lblImage);
		lblImage.setIcon(image);
		
		lblLebenPlayer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLebenPlayer.setBounds(114, 367, 126, 16);
		getContentPane().add(lblLebenPlayer);
		
		
		lblLebenGegner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblLebenGegner.setBounds(919, 366, 161, 16);
		getContentPane().add(lblLebenGegner);
		
		
		lblBackGround.setBounds(0, 0, 1256, 638);
		getContentPane().add(lblBackGround);
		lblBackGround.setIcon(BackGround);
		
		
		lblLebenGegner.setText(B.getHPE() + " Leben");
		lblLebenPlayer.setText(B.getHPP() + " Leben");
		
		if (B.getEnding().equals("Bender")){
			ImageIcon imageE = new ImageIcon("src/RobotBoy.PNG");
			lblImage2.setIcon(imageE);	
		}
		else if (B.getEnding().equals("Bob")){
			ImageIcon imageE = new ImageIcon("src/NeutralLama.PNG");
			lblImage2.setIcon(imageE);	
		}
		

		
		
		
}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBATK1){
			lblImage.setIcon((image2));
			AA = 3;

			lblKampflog.setText("Du hast Schwerthieb eingesetzt");

			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;
		
			B.Attack(AA);
			JBATK1.disable();
			JBATK2.disable();
			lblDamage2.setText("Gegner hat "+ B.getSchlag1() +" Schaden erlitten!");
			lblDamage1.setText("Du hast " + B.getSchlag2() + " Schaden erlitten!");
			lblLebenGegner.setText(B.getHPE() + " Leben");
			lblLebenPlayer.setText(B.getHPP() + " Leben");
		
			if (B.getEnding().equals("Bender")){
				ImageIcon imageE = new ImageIcon("src/RobotBoy.PNG");
				lblImage2.setIcon(imageE);	
			}
			else if (B.getEnding().equals("Bob")){
				ImageIcon imageE = new ImageIcon("src/NeutralLama.PNG");
				lblImage2.setIcon(imageE);	
			}
			else if (B.getEnding().equals("Lost")){
				this.dispose();
			}
			
		while (elapsedTime < 0.5*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
	}
	JBATK1.enable();
	JBATK2.enable();
		
}
		
		

		if(event.getSource()==JBATK2){
			lblImage.setIcon((image3));
			AA = 1;
			lblKampflog.setText("Du hast Schildschlag eingesetzt");

			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;
			B.Attack(AA);
			JBATK1.disable();
			JBATK2.disable();
			lblDamage2.setText("Gegner hat "+ B.getSchlag1() +" Schaden erlitten!");
			lblDamage1.setText("Du hast " + B.getSchlag2() + " Schaden erlitten!");
			lblLebenGegner.setText(B.getHPE() + " Leben");
			lblLebenPlayer.setText(B.getHPP() + " Leben");
			
			if (B.getEnding().equals("Bender")){
				ImageIcon imageE = new ImageIcon("src/RobotBoy.PNG");
				lblImage2.setIcon(imageE);	
			}
			else if (B.getEnding().equals("Bob")){
				ImageIcon imageE = new ImageIcon("src/NeutralLama.PNG");
				lblImage2.setIcon(imageE);	
			}
			else if (B.getEnding().equals("Lost")){
				this.dispose();
			}
			
		while (elapsedTime < 0.5*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
		JBATK1.enable();
		JBATK2.enable();
		
}
		
	
	
}
}
