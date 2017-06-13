package Logic;

public class Battle {

	CHAR Enemy=new CHAR(0, 0, null);
	Player Player=new Player(100,15,"Spieler");
	
	int ATK;
	int AA;
	
	public Battle() {
		System.out.println(Player.getHP());
	}	
	
	public void getEnemy(IEnemy Enemy){
		this.Enemy=(CHAR) Enemy;
	}
	
	public void Attack(int AA){
		this.AA=AA;
		this.ATK = Player.getATK();
		Enemy.DamageDealer(ATK, this.AA);
		this.ATK = Enemy.getATK();
		Player.DamageDealer(ATK, this.AA);
	}
	
}
