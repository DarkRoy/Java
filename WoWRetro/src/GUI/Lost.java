package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lost extends JFrame implements ActionListener{
	
	
	JLabel lostinfo = new JLabel("Sie haben verloren");
	JLabel lblBackGround = new JLabel("");
	JButton BtnReset = new  JButton();
	JButton BtnClose = new JButton();
	ImageIcon BackGround = new ImageIcon("src/Kampf-GUI.PNG");
	

	/**
	 * Beschreibt das Aussehen des GUIs
	 */
	public Lost(){
		
		this.setForeground(new Color(0, 0, 0));
		this.setBackground(new Color(255, 255, 255));
		
		this.setLayout(null);	
		
		this.setSize(1280,720);
		this.setVisible(true);
		this.setForeground(Color.BLUE);
		this.setTitle("Island Paradice");
		
		BtnReset.setBounds(540, 200, 200, 50);
		BtnClose.setBounds(540, 270, 200, 50);
		lostinfo.setBounds(540, 270, 200, 50);
		BtnReset.setText("Spiel erneut starten");
		BtnClose.setText("Programm schliessen");
		this.add(BtnReset);
		this.add(BtnClose);
		this.add(lostinfo);
		lostinfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		lostinfo.setBounds(350, 72, 600, 50);
		
		
		
		lblBackGround.setBounds(0, 0, 1262, 673);
		this.add(lblBackGround);
		lblBackGround.setIcon(BackGround);
		
		
		BtnReset.addActionListener(this);
		BtnClose.addActionListener(this);
		
		
		
		
		
		
		
		
	}
	/**
	 * Die Aktionen bei betätigen von Buttons werden hier bestimmt
	 */
	public void actionPerformed(ActionEvent event) {
		/**
		 * Falls BtnReset gedrückt wird, wird das BattleGUI gestartet und das LostGUI wird beendet
		 */
		if(event.getSource()==BtnReset){
			BattleGUI GUI=new BattleGUI();
			this.dispose();
			
		}
		/**
		 * falls BtnClose gedrückt wird, wird die komplette Anwendung beendet
		 */
		if(event.getSource()==BtnClose){
			System.exit(0);
		}
		
		
		
		
	}
	
}
