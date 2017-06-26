package Logic;

import GUI.Lost;

/**
 * @author Nicola / Nemanja / Garcia
 */


public class Battle {

	// CHAR zur verarbeitung eines Enemies
	private CHAR Enemy=new CHAR(0, 0, null,0);
	
	// Der Spieler
	private Player Player=new Player(100,15,"Spieler",100);
	
	// ADD Enemy 
	private AddEnemy AE=new AddEnemy();
	
	// Variablen fuer weiterverarbeitungen
	private int ATK;
	private int AA;
	
	// Variablen fuer das GUI
	private int Schlag1;
	private int Schlag2;
	private String Ending;
	private int HPP;
	private int HPE;
	
	// Holt den ersten Enemy und setzt parameter fuer das GUI
	public Battle() {
		AE.AddEnemyEntry();
		this.Enemy=(CHAR) AE.getEnemy();
		Ending = Enemy.getName();
		HPE = Enemy.getHP();
		HPP = Player.getHP();
	}	
	
	
	
	
	/**
	 * Fuehrt den Lebensabzug durch
	 * @param AA = AttackArt (Schwerthieb oder Schildschlag)
	 */
	public void Attack(int AA){
		
		/**
		 *  AA = Attack ARt (Schwerthieb oder Schildschlag)
		 */
		this.AA=AA;
		// Player Damage
		this.ATK = Player.getATK();
		// Schadensberechner
		Enemy.DamageDealer(ATK, this.AA);
		// Schlag damage von Player zum Enemy
		Schlag1 = Enemy.getDamageRec();
		// Uebruepft Lebensstatus
		this.checkVitals();
		// HPE = Health Point Enemy fuer GUI
		HPE = Enemy.getHP();
		
		
		// Enemy Damage
		this.ATK = Enemy.getATK();
		// Attack Art (nur eine fuer Gegner)
		this.AA = 1;
		//Schadensberechner
		Player.DamageDealer(ATK, this.AA);
		// Schlag damage von Enemy zum Player
		Schlag2 = Player.getDamageRec();
		// Uebruepft nochmal Lebensstatus
		this.checkVitals();
		// HPP = Health Point Player fuer GUI
		HPP = Player.getHP();
	
	}
	
	
	public int getSchlag1(){
		return Schlag1;
	}
	public int getSchlag2(){
		return Schlag2;
	}
	public int getHPP(){
		return HPP;
	}
	public int getHPE(){
		return HPE;
	}
	public String getEnding(){
		return Ending;
	}
	
	/**
	 * 
	 * @param HPE = Health Point Enemy
	 */
	public void setHPE(int HPE){
		 this.HPE=HPE;
	}
	/**
	 * 
	 * @param HPP = Health Point Player
	 */
	public void setHPP(int HPP){
		 this.HPP=HPP;
	}
	/**
	 * 
	 * @param Schlag1 = Schlag Damage vom Player dieser Runde
	 */
	public void setSchlag1(int Schlag1){
		 this.Schlag1=Schlag1;
	}
	/**
	 * 
	 * @param Schlag2 = Schlag Damage vom Enemy dieser Runde
	 */
	public void setSchlag2(int Schlag2){
		 this.Schlag2=Schlag2;
	}
	/**
	 * 
	 * @param Schlag2 = Auskommen der Runde
	 */
	public void getEnding(String Ending){
		this.Ending = Ending;
	}

	/** Uebruepft ob Enemy oder Player unter 0 Leben sind
	 * Wenn der Gegner 0 trifft wird er geresetet in Add Enemy
	 * und ein neuer wird geholt aus dem Zufallsgenerator
	 * Falls der Spieler 0 HP hta und der Gegner mehr als 0
	 * dann der Wert Lost mitgegeben der das GUI Schliesst und
	 * das Lost GUI aufruft */
	 
	public void checkVitals(){
		if (Enemy.HP<= 0) {
			AE.resetEnemy(Enemy);
			this.Enemy=(CHAR) AE.getEnemy();
			Ending = Enemy.getName();
			Player.setHP(Player.getHP()+Player.getMAXHP()/3);

		}
		else if (Player.HP<=0){
			Lost L = new Lost();			
			Ending = "Lost";
		}}}
