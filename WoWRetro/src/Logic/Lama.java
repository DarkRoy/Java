package Logic;

public class Lama extends CHAR implements IEnemy {


	
	public Lama(int HP, int ATK, String Name) {
		super(HP,ATK,Name);
		
	}

	@Override
	public int getHP() {
		return HP;
	}

	@Override
	public void setHP() {
		// TODO Auto-generated method stub
		
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
