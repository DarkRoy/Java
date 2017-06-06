package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener{

	JButton JBStart=new JButton();
	JButton JBEnd=new JButton();
	
	public GUI() {
		
		this.setLayout(null);
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		
		JBStart.setBounds(540, 200, 200, 50);
		JBEnd.setBounds(540, 270, 200, 50);
		
		JBStart.setText("Starten");
		JBEnd.setText("Beenden");
		
		JBStart.addActionListener(this);
		JBEnd.addActionListener(this);
		
		this.add(JBStart);
		this.add(JBEnd);
		
		
	
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
