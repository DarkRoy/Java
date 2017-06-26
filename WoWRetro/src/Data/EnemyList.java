package Data;

import java.util.ArrayList;

import Logic.IEnemy;



public class EnemyList {
	
 
	/** 
	 * Das ist die ArrayList
	 */
	private ArrayList<IEnemy> EnemyList=new ArrayList<IEnemy>();
	
	public EnemyList() {
		
		
	}
	/**
	 * Speichert die mitgegeben Enemies in die ArrayList
	 */
	public void AddEnemy(IEnemy Enemy) {
		EnemyList.add(Enemy);
	} 
		
	

}
