package Logic;

public class Player extends CHAR implements IEnemy {

	int AP = 5;
	
	public Player(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name,MAXHP);
		this.HP=HP;
		this.ATK=ATK;
		this.Name=Name;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return HP;
	}

	

	@Override
	public int getATK() {
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	

	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG = ATK - (this.AP / AA);
		this.HP=this.HP -  DMG;

		
	}

	
	

}
