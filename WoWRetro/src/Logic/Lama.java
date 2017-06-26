package Logic;

/**
 * @author Nicola / Nemanja / Garcia
 *
 */
public class Lama extends CHAR implements IEnemy {

	/**
	 * @param HP Wie viel leben der Gegner hat
	 * @param ATK Wieviel Schaden der Gegner macht
 	 * @param Name Wie der Gegner heisst
	 * @param MAXHP Was für ein maximales Leben der Gegner hat
	 */
	public Lama(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name,MAXHP);
		}}
