package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BattleGUI  extends JFrame implements ActionListener{
	JButton JBATK1=new JButton();
	JButton JBATK2=new JButton();
	
	
	public BattleGUI() {
		
		this.setLayout(null);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		
		JBATK1.setBounds(100, 50, 200, 50);
		JBATK2.setBounds(100, 120, 200, 50);
		
		JBATK1.setText("Schwerthieb");
		JBATK2.setText("Schildschlag");
		
		JBATK1.addActionListener(this);
		JBATK2.addActionListener(this);
		
		
		this.add(JBATK1);
		this.add(JBATK2);

}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==JBATK1){
			long startTime = System.currentTimeMillis();
			long elapsedTime = 0L;

			JBATK1.disable();
		while (elapsedTime < 2*1000) {
		    elapsedTime = (new Date()).getTime() - startTime;
		}
		JBATK1.enable();
		}
		
	}}
