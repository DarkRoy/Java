package Logic;

public class CHAR implements IEnemy {

	protected int HP;
	protected int ATK;
	protected String Name;
	
	public CHAR (int HP, int ATK, String Name) {
		this.HP = HP;
		this.ATK = ATK;
		this.Name = Name;
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
		this.HP = this.HP - ATK;
		System.out.println(this.HP);
	}

	@Override
	public void DamageDealer() {
		// TODO Auto-generated method stub
		
	}

	
}
