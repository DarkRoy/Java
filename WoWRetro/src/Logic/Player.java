package Logic;

public class Player extends CHAR implements IEnemy {

	int AP = 5;
	
	/**
	 * @param HP Wie viel leben der Spieler hat
	 * @param ATK Wieviel Schaden der Spieler macht
 	 * @param Name Wie der Spieler heisst
	 * @param MAXHP Was f�r ein maximales Leben der spieler hat
	 */
	public Player(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name,MAXHP);
		this.HP=HP;
		this.ATK=ATK;
		this.Name=Name;
	}

	/** ^
	 * In dieser Methode wird die St�rke der Attacke mit einer Zufallszahl berechnet
	 * @RETURN Gibt die St�rke der Attacke aus als Variabel ATK
	 */

	public int getATK() {
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}
	
	/**
	 * Berechnet den Schaden am Spieler
	 * @param Int Variabeln F�r AttackArt und Schaden
	 */
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG = ATK - (this.AP / AA);
		this.HP=this.HP -  DMG;

		
	}}
