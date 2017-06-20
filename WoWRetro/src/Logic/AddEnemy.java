package Logic;

import static java.lang.Math.random;

import Data.EnemyList;

public class AddEnemy {
	
	EnemyList EL=new EnemyList();
	CHAR Char=new CHAR(0, 0, null,0);
	Lama Lama=new Lama(80,12,"Bob",80);
	Robot Robot=new Robot(90,10,"Bender",90);
	
	public void AddEnemyEntry() {
		
		
		System.out.println(Robot.HP);
		EL.AddEnemy(Lama);
		EL.AddEnemy(Robot);	
		
	}
	public CHAR getEnemy(){
		int a = (int) Math.floor((Math.random() * 2) + 1);
		if (a==1){
			return Robot;
		}
		
		else if (a==2){
			return Lama;
		}
		return Char;
	}
	public void resetEnemy(CHAR Enemy){
		Enemy.setHP(Enemy.getMAXHP());
	}
	
}
