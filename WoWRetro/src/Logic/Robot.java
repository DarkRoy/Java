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
	 * In dieser Methode wird die Stärke der Attacke mit einer Zufallszahl berechnet
	 * @RETURN Gibt die Stärke der Attacke aus als Variabel ATK
	 */	
	@Override
	public int getATK() {
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}

	/**
	 * Berechnet den Schaden am Gegner
	 * @param Int Variabeln Für AttackArt und Schaden
	 */
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG = ATK - (this.AP / AA);
		this.HP=this.HP -  DMG;
		
		
	}}
