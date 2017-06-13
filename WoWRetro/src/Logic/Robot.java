package Logic;

public class Robot extends CHAR implements IEnemy {

	private int HP;
	private int ATK;
	private String Name;
	
	public Robot(int iHP, int iATK, String iName) {
		super(iHP,iATK,iName);
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
