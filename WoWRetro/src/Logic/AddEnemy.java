package Logic;

import Data.EnemyList;

/**
 * @author Nicola / Nemanja / Garcia
 *
 */
public class AddEnemy {
	
	//EnemyList 
	private EnemyList EL=new EnemyList();
	
	// CHAR parameter zur weitergabe
	private CHAR Char=new CHAR(0, 0, null,0);
	
	// Gegner init
	private Lama Lama=new Lama(80,12,"Bob",80);
	private Robot Robot=new Robot(90,10,"Bender",90);
	
	// Ist fuer den Zufallsgenerator der Gegner
	private int a;
	
	public void AddEnemyEntry() {
		// Fuegt Gegner in die EnemyList im Data Layer

		EL.AddEnemy(Lama);
		EL.AddEnemy(Robot);	
		
	}
	
	
	// Stellt Enemy fuer den Kampf bereit
	public CHAR getEnemy(){
		a = (int) Math.floor((Math.random() * 2) + 1);
		if (a==1){
			return Robot;
		}	
		else if (a==2){
			return Lama;
		}
		return Char;
		}
	
	// Setzte den Enemy zur wiederverwendung zurueck (nur HP)
	public void resetEnemy(CHAR Enemy){
		Enemy.setHP(Enemy.getMAXHP());
	}
	
}
