package Logic;

public class Player extends CHAR implements IEnemy {

	int AP = 5;
	
	public Player(int HP, int ATK, String Name, int MAXHP) {
		super(HP,ATK,Name,MAXHP);
		this.HP=HP;
		this.ATK=ATK;
		this.Name=Name;
	}

	@Override
	public int getATK() {
		// Generiert noch kritischen Schaden per Zufall
		return (int) (ATK + Math.floor((Math.random() * 10) + 1));
	}
	
	// Berechnet Schaden
	@Override
	public void DamageDealer(int ATK, int AA) {
		DMG = ATK - (this.AP / AA);
		this.HP=this.HP -  DMG;
		System.out.println(this.HP+" Player");
		
	}}
