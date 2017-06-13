package Logic;

public interface IEnemy {

	public int getHP();
	public void setHP();
	public int getATK();
	public void setATK();
	public String getName();
	public void setName();
	public void DamageDealer();
	void DamageDealer(int ATK, int AA);
	
	
}
