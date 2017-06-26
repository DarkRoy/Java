package Logic;

public class Robot extends CHAR implements IEnemy {

	int AP = 5;
	
	/**
	 * @param HP Wie viel leben der Gegner hat
	 * @param ATK Wieviel Schaden der Gegber macht
 	 * @param Name Wie der Gegner heisst
	 * @param MAXHP Was f�r ein maximales Leben der Gegner hat
	 */
	public Robot(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name, MAXHP);
		this.HP=HP;
		this.ATK=ATK;
		this.Name=Name;
		this.MAXHP = MAXHP;
	}
	/**
	 * In dieser Methode wird die St�rke der Attacke mit einer Zufallszahl berechnet
	 * @RETURN Gibt die St�rke der Attacke aus als Variabel ATK
	 */	
	@Override
	public int getATK() {
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}

	/**
	 * Berechnet den Schaden am Gegner
	 * @param Int Variabeln F�r AttackArt und Schaden
	 */
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG = ATK - (this.AP / AA);
		this.HP=this.HP -  DMG;
		
		
	}}
