package Logic;

import GUI.BattleGUI;
import GUI.Lost;

public class Battle {

	private CHAR Enemy=new CHAR(0, 0, null,0);
	private Player Player=new Player(100,15,"Spieler",100);
	private AddEnemy AE=new AddEnemy();
	private int ATK;
	private int AA;
	public int Schlag1;
	public int Schlag2;
	public String Ending;
	public int HPP;
	public int HPE;
	
	public Battle() {
		AE.AddEnemyEntry();
		this.Enemy=(CHAR) AE.getEnemy();
		Ending = Enemy.getName();
	}	
	
	
	
	
	public void Attack(int AA){
		this.AA=AA;
		this.ATK = Player.getATK();
		Enemy.DamageDealer(ATK, this.AA);
		HPE = Enemy.getHP();
		this.checkVitals();
		Schlag1 = Enemy.getDamageRec();
		
		
		this.ATK = Enemy.getATK();
		this.AA = 1;
		Player.DamageDealer(ATK, this.AA);
		Schlag2 = Player.getDamageRec();
		HPP = Player.getHP();
		this.checkVitals();
		
		
	}
	public void checkVitals(){
		if (Enemy.HP<= 0) {
			AE.resetEnemy(Enemy);
			System.out.println("Gegner besiegt");
			this.Enemy=(CHAR) AE.getEnemy();
			Ending = Enemy.getName();
			

		}
		else if (Player.HP<=0){
			Lost L = new Lost();			
			Ending = "Lost";
		}}}
