package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class BattleGUI  extends JFrame implements ActionListener{
	JButton JBATK1=new JButton();
	JButton JBATK2=new JButton();
	JLabel lblKampflog = new JLabel("");
	JButton GegnerAttack1 = new JButton();
	JButton GegnerAttack2 = new JButton();
	JLabel lblDamage2 = new JLabel("");
	JLabel lbldamage1 = new JLabel("");
	private final JLabel lblImage = new JLabel("");
	
	
	public BattleGUI() {
		
		getContentPane().setLayout(null);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		
		JBATK1.setBounds(100, 50, 200, 50);
		JBATK2.setBounds(100, 120, 200, 50);
		
		JBATK1.setText("Schwerthieb");
		JBATK2.setText("Schildschlag");
		
		JBATK1.addActionListener(this);
		JBATK2.addActionListener(this);
		
		
		getContentPane().add(JBATK1);
		getContentPane().add(JBATK2);
		
		GegnerAttack2.setText("Schildschlag");
		GegnerAttack2.setBounds(919, 120, 200, 50);
		getContentPane().add(GegnerAttack2);
		

		GegnerAttack1.setText("Schwerthieb");
		GegnerAttack1.setBounds(919, 50, 200, 50);
		getContentPane().add(GegnerAttack1);
		
		
		lblKampflog.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblKampflog.setBounds(418, 50, 402, 120);
		getContentPane().add(lblKampflog);
		
		lblDamage2.setBounds(919, 270, 62, 42);
		getContentPane().add(lblDamage2);
		
		lbldamage1.setBounds(100, 270, 62, 42);
		getContentPane().add(lbldamage1);
		
		JLabel lblLEBEN2 = new JLabel("");
		lblLEBEN2.setBounds(919, 422, 56, 16);
		getContentPane().add(lblLEBEN2);
		
		JLabel lblLEBEN1 = new JLabel("");
		lblLEBEN1.setBounds(100, 422, 56, 16);
		getContentPane().add(lblLEBEN1);
		lblImage.setBounds(110, 446, 175, 199);
		
		getContentPane().add(lblImage);

}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBATK1){
			lblKampflog.setText("Du hast Schwertschlag eingesetzt");
			lblDamage2.setText("20");
			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;
			

			JBATK1.disable();
		while (elapsedTime < 2*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
		JBATK1.enable();
		}
		
	}	
}
