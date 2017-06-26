package Data;

import java.util.ArrayList;

import Logic.IEnemy;



public class EnemyList {
	
 
	/** 
	 * Speichert IEnemy Objekte in die ArrayList
	 */
	private ArrayList<IEnemy> EnemyList=new ArrayList<IEnemy>();
	
	public EnemyList() {
		
		
	}
	/**
	 * Diese Methode speichert IEnemy Objekte in die ArrayList EnemyList
	 * @param Enemy Variable mit dem Datentyp IEnemy
	 */
	public void AddEnemy(IEnemy Enemy) {
		EnemyList.add(Enemy);
	} 
		
	

}
