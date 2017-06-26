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
	 * 
	 * Hier befindet sich der Konstruktor
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
	 */
	public int getHP() {
		return HP;
		}

	@Override
	
	/**
	 * Setzt die Lebenswerte
	 */
	public void setHP(int HP) {
		this.HP = HP;
		}

	@Override
	
	/**
	 * Erzeugt Schadenswerte und gibt diese zurück
	 */
	public int getATK() {
		// Generiert noch kritischen Schaden per Zufall
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
	 */
	public String getName() {
		return Name;
	}

	@Override
	
	/**
	 * Setzt den Namen
	 */
	public void setName(String Name) {
		this.Name = Name;
		}

	/**
	 *  Rechnet den Schaden aus
	 */
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG =  ATK;
		this.HP = this.HP - DMG;
		
	}

	/** Getter und Setter
	 * 
	 */
	@Override
	/**
	 * Gibt den maximalen Lebenswert zurück
	 */
	public int getMAXHP() {
		return MAXHP;
	}

	@Override
	/**
	 * Setzt den maximalen lebens-Anfangswert
	 */
	public void setMAXHP(int MAXHP) {
		this.MAXHP = MAXHP;
	}

	@Override
	public int getDamageRec() {
		return DMG;
	}}
