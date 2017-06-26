package Logic;

/**
 * @author Nicola / Nemanja / Garcia
 */

public interface IEnemy {

	/**
	 * @return gibt die Lebenswerte zurück
	 */
	public int getHP();
	/**
	 * 
	 * @param HP ist eine Variable des Datentyps int und bestimmt den Lebenswert
	 */
	public void setHP(int HP);
	
	/**
	 * 
	 * @return gibt den Schadenswert zurück
	 */
	public int getATK();
	/**
	 * 
	 * @param ATK ist eine Variable des Datentyps int und  bestimmt den Schadenswert
	 */
	public void setATK(int ATK);
	public String getName();
	public void setName(String Name);
	public int getMAXHP();
	public void setMAXHP(int MAXHP);
	void DamageDealer(int ATK, int AA);
	public int getDamageRec();

}
