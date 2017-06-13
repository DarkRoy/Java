package Data;

import java.util.ArrayList;

import Logic.IEnemy;

public class EnemyList {
 
	private ArrayList<IEnemy> EnemyList=new ArrayList<IEnemy>();
	
	public EnemyList() {
		
		
	}
	public void AddEnemy(IEnemy Enemy) {
		EnemyList.add(Enemy);
		System.out.println(Enemy.getATK()+"");
	} 
		
	

}
