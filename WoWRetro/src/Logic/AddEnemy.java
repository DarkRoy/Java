package Logic;

import Data.EnemyList;

public class AddEnemy {
	
	EnemyList EL=new EnemyList();
	CHAR Char=new CHAR(0, 0, null);
	Lama Lama=new Lama(80,12,"Bob");
	Robot Robot=new Robot(90,10,"Bender");
	
	public void AddEnemyEntry() {
		
		
		System.out.println(Robot.HP);
		EL.AddEnemy(Lama);
		EL.AddEnemy(Robot);	
		
	}
	public CHAR getEnemy(){
		return Robot;
	}
	
}
