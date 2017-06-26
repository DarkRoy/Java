package Logic;

public class Robot extends CHAR implements IEnemy {

	int AP = 5;
	
	public Robot(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name, MAXHP);
		this.HP=HP;
		this.ATK=ATK;
		this.Name=Name;
		this.MAXHP = MAXHP;
	}
	/** ^
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
