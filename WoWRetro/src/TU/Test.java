package TU;

import static org.junit.Assert.*;

import Logic.Lama;
import Logic.Player;
import Logic.Robot;

public class Test {

	/** 
	 *	 Variablen werden initialisiert
	 */
	private int PHP = 100;
	private String PN = "Spieler";
	private int PMHP = 100;
	
	private int LHP = 80;
	private String LN = "Bob";
	private int LMHP = 80;
	
	private int RHP = 90;
	private String RN = "Bender";
	private int RMHP = 90;
	
	
	/** 
	 *	 CHAR Unterklassen initialisiert
	 */
	private Player Player=new Player(PHP,15,PN,PMHP);
	private Lama Lama=new Lama(LHP,15,LN,LMHP);
	private Robot Robot=new Robot(RHP,15,RN,RMHP);
	
	
	/** 
	 *	 Player wird auf korrekte Werte getestet
	 */
	@org.junit.Test
	public void Testfall1() {
		assertTrue(Player.getHP()==PHP);
		assertTrue(Player.getName()==PN);
		assertTrue(Player.getMAXHP()==PMHP);
		
	}
	
	/** 
	 *	 Gegner wird auf korrekte Werte getestet
	 */
	@org.junit.Test
	public void Testfall2() {
		
		assertTrue(Lama.getHP()==LHP);
		assertTrue(Lama.getName()==LN);
		assertTrue(Lama.getMAXHP()==LMHP);
		
		assertTrue(Robot.getHP()==RHP);
		assertTrue(Robot.getName()==RN);
		assertTrue(Robot.getMAXHP()==RMHP);
	
	}
	/** 
	 *	 Empfangener Schaden wird getestet, der CHAR Unterklassen
	 */
	@org.junit.Test
	public void Testfall3() {
		Player.DamageDealer(15, 1);
		assertTrue(Player.getHP()==90);
		Lama.DamageDealer(15, 1);
		assertTrue(Lama.getHP()==65);
		Robot.DamageDealer(15, 1);
		assertTrue(Robot.getHP()==80);
	}

}
