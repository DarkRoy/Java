package Logic;

public class CHAR implements IEnemy {

	// Variablen des CHAR
	protected int HP;
	protected int ATK;
	protected int MAXHP;
	protected String Name;
	protected int DMG;
	
	public CHAR (int HP, int ATK, String Name, int MAXHP) {
		this.HP = HP;
		this.ATK = ATK;
		this.Name = Name;
		this.MAXHP = MAXHP;
	}

	// Getter und Setter
	@Override
	public int getHP() {
		return HP;
		}

	@Override
	public void setHP(int HP) {
		this.HP = HP;
		}

	@Override
	public int getATK() {
		// Generiert noch kritischen Schaden per Zufall
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}

	@Override
	public void setATK(int ATK) {
		this.ATK = ATK;
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public void setName(String Name) {
		this.Name = Name;
		}

	// Rechnet Schaden aus
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG =  ATK;
		this.HP = this.HP - DMG;
		
	}

	// Getter und Setter
	@Override
	public int getMAXHP() {
		return MAXHP;
	}

	@Override
	public void setMAXHP(int MAXHP) {
		this.MAXHP = MAXHP;
	}

	@Override
	public int getDamageRec() {
		return DMG;
	}}
