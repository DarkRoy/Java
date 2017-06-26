package Logic;

/**
 * @author Nicola / Nemanja / Garcia
 */

public interface IEnemy {

	/**
	 * @return gibt die Lebenswerte zur�ck
	 */
	public int getHP();
	/**
	 * Diese Methode bestimmt den Lebenswert
	 * @param HP ist eine Variable des Datentyps int
	 */
	public void setHP(int HP);
	
	/**
	 * 
	 * @return gibt den Schadenswert zur�ck
	 */
	public int getATK();
	/**
	 * Diese Methode bestimmt den Schadenswert
	 * @param ATK ist eine Variable des Datentyps int
	 */
	public void setATK(int ATK);
	/**
	 * 
	 * @return gibt den Namen zur�ck
	 */
	public String getName();
	/**
	 * Diese Methode setzt den Namen
	 * @param Name ist eine Variable des Datentyps String
	 */
	public void setName(String Name);
	/**
	 * 
	 * @return gibt den maximalen Anfangswerte der Lebenswerte zur�ck
	 */
	public int getMAXHP();
	/**
	 * Diese Methode setzt die Angangswerte f�r die Lebenswerte
	 * @param MAXHP ist eine Variable des Datentyps int
	 */
	public void setMAXHP(int MAXHP);
	/**
	 * 
	 * @param ATK ist eine Variable des Datentyps int
	 * @param AA ist eine Variable des Datentyps int
	 */
	void DamageDealer(int ATK, int AA);
	/**
	 * 
	 * @return gibt den zugef�gten Schaden zur�ck
	 */
	public int getDamageRec();

}
