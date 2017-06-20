package Logic;

public class Lama extends CHAR implements IEnemy {


	
	public Lama(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name,MAXHP);
		
	}

	@Override
	public int getHP() {
		return HP;
	}

	@Override
	public void setHP() {
		
	}

	@Override
	public int getATK() {
		return ATK;
		
	}

	@Override
	public void setATK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}


	

}
