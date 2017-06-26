package Logic;

public interface IEnemy {

	// Interface
	public int getHP();
	public void setHP(int HP);
	public int getATK();
	public void setATK(int ATK);
	public String getName();
	public void setName(String Name);
	public int getMAXHP();
	public void setMAXHP(int MAXHP);
	void DamageDealer(int ATK, int AA);
	public int getDamageRec();

}
