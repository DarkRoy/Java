package Logic;

import Data.EnemyList;

public class AddEnemy {
	
	private EnemyList EL=new EnemyList();
	private CHAR Char=new CHAR(0, 0, null,0);
	private Lama Lama=new Lama(80,12,"Bob",80);
	private Robot Robot=new Robot(90,10,"Bender",90);
	private int a;
	
	public void AddEnemyEntry() {
		
		
		System.out.println(Robot.HP);
		EL.AddEnemy(Lama);
		EL.AddEnemy(Robot);	
		
	}
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
	public void resetEnemy(CHAR Enemy){
		Enemy.setHP(Enemy.getMAXHP());
	}
	
}
