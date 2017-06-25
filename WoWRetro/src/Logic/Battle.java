package Logic;

import GUI.Lost;

public class Battle {

	private CHAR Enemy=new CHAR(0, 0, null,0);
	private Player Player=new Player(100,15,"Spieler",100);
	private AddEnemy AE=new AddEnemy();
	private int ATK;
	private int AA;
	private int Schlag1;
	private int Schlag2;
	private String Ending;
	private int HPP;
	private int HPE;
	
	public Battle() {
		AE.AddEnemyEntry();
		this.Enemy=(CHAR) AE.getEnemy();
		Ending = Enemy.getName();
		HPE = Enemy.getHP();
		HPP = Player.getHP();
	}	
	
	
	
	
	public void Attack(int AA){
		this.AA=AA;
		this.ATK = Player.getATK();
		Enemy.DamageDealer(ATK, this.AA);
		this.checkVitals();
		HPE = Enemy.getHP();
		Schlag1 = Enemy.getDamageRec();
		
		
		this.ATK = Enemy.getATK();
		this.AA = 1;
		Player.DamageDealer(ATK, this.AA);
		Schlag2 = Player.getDamageRec();
		HPP = Player.getHP();
		this.checkVitals();
		
		
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
	
	public void setHPE(int HPE){
		 this.HPE=HPE;
	}
	public void setHPP(int HPP){
		 this.HPP=HPP;
	}
	public void setSchlag1(int Schlag1){
		 this.Schlag1=Schlag1;
	}
	public void setSchlag2(int Schlag2){
		 this.Schlag2=Schlag2;
	}
	public void getEnding(String Ending){
		this.Ending = Ending;
	}

	
	public void checkVitals(){
		if (Enemy.HP<= 0) {
			AE.resetEnemy(Enemy);
			System.out.println("Gegner besiegt");
			this.Enemy=(CHAR) AE.getEnemy();
			Ending = Enemy.getName();
			Player.setHP(Player.getHP()+Player.getMAXHP()/3);

		}
		else if (Player.HP<=0){
			Lost L = new Lost();			
			Ending = "Lost";
		}}}
