package Logic;

public class CHAR implements IEnemy {

	protected int HP;
	protected int ATK;
	protected int MAXHP;
	protected String Name;
	
	public CHAR (int HP, int ATK, String Name, int MAXHP) {
		this.HP = HP;
		this.ATK = ATK;
		this.Name = Name;
		this.MAXHP = MAXHP;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return HP;
	}

	@Override
	public void setHP(int HP) {
		// TODO Auto-generated method stub
		this.HP = HP;
		
	}

	@Override
	public int getATK() {
		// TODO Auto-generated method stub
		return ATK;
	}

	@Override
	public void setATK(int ATK) {
		// TODO Auto-generated method stub
		this.ATK = ATK;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public void setName(String Name) {
		this.Name = Name;
		
	}

	@Override
	public void DamageDealer(int ATK, int AA) {
		this.HP = this.HP - ATK;
		System.out.println(this.HP +" "+ this.Name);
	}


	@Override
	public int getMAXHP() {
		// TODO Auto-generated method stub
		return MAXHP;
	}

	@Override
	public void setMAXHP(int MAXHP) {
		// TODO Auto-generated method stub
		this.MAXHP = MAXHP;
	}

	
}
