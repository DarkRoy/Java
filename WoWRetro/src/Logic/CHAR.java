package Logic;



public class CHAR implements IEnemy {
	
	
	/**
	 * @author Nicola / Nemanja / Garcia
	 */

	/** 
	 * Variablen des CHAR
	 */
	protected int HP;
	protected int ATK;
	protected int MAXHP;
	protected String Name;
	protected int DMG;
		
	/**
	 * @param HP Leben der Figur
	 * @param ATK Schaden der Figur
	 * @param Name Name der Figur
	 * @param MAXHP Maximal Leben der Figur
	 */
	public CHAR (int HP, int ATK, String Name, int MAXHP) {
		this.HP = HP;
		this.ATK = ATK;
		this.Name = Name;
		this.MAXHP = MAXHP;
	}

	/** 
	 * Getter und Setter
	 */
	@Override
	
	/**
	 * gibt die Lebenswerte zurück
	 * @return HP 
	 */
	public int getHP() {
		return HP;
		}


	
	/**
	 * Setzt die Lebenswerte
	 * @param HP Lebenswert 
	 */
	public void setHP(int HP) {
		this.HP = HP;
		}

	@Override
	
	/** ^
	 * In dieser Methode wird die Stärke der Attacke mit einer Zufallszahl berechnet
	 * @return ATK als Angriffstärke
	 */
	public int getATK() {
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}

	@Override
	
	/**
	 * Setzt den Schadenswert
	 */
	public void setATK(int ATK) {
		this.ATK = ATK;
	}

	@Override
	
	/**
	 * Gibt den Namen zurück
	 * @return Name	
	 */
	public String getName() {
		return Name;
	}

	@Override
	
	/**
	 * Setzt den Namen
	 * @param Name
	 */
	public void setName(String Name) {
		this.Name = Name;
		}

	/**
	 *  Rechnet den Schaden aus
	 *  @param ATK als Angriffschaden
	 *  @param AA als AttackArt
	 */
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG =  ATK;
		this.HP = this.HP - DMG;
		
	}

	/**
	 * Gibt den maximalen Lebenswert zurück
	 * @return MaxHP
	 */
	public int getMAXHP() {
		return MAXHP;
	}

	@Override
	/**
	 * Setzt den maximalen Lebenswert
	 * @param MAXHP 
	 */
	public void setMAXHP(int MAXHP) {
		this.MAXHP = MAXHP;
	}

	/** 
	 * Hinzugefügter Schaden wird hier ausgegeben
	 * @return DMG als zugeführter Schaden
	 */
	@Override
	public int getDamageRec() {
		return DMG;
	}}
