package Logic;

public class Player extends CHAR implements IEnemy {

	int AP = 5;
	
	public Player(int HP, int ATK, String Name) {
		super(HP,ATK,Name);
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
	public void setHP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getATK() {
		// TODO Auto-generated method stub
		return ATK;
	}

	@Override
	public void setATK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DamageDealer(int ATK, int AA) {
		this.HP= this.HP - (ATK - (this.AP)/AA);
		System.out.println(this.HP);
		
	}

	
	

}
