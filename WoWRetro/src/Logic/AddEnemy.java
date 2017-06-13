package Logic;

import Data.EnemyList;

public class AddEnemy {
	
	EnemyList EL=new EnemyList();
	
	public void AddEnemyEntry() {
		
		Lama Lama=new Lama(80,12,"Bob");
		Robot Robot=new Robot(90,10,"Bender");
		
		EL.AddEnemy(Lama);
		EL.AddEnemy(Robot);	
		
	}
	

}
