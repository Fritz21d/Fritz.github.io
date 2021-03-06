package Magic;

public class RPG {
	public static void main(String[] args) {
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Fritz");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);

		Magician magician = new Magician();
		magician.setName ("Justin");
		magician.setLevel (1);
		magician.setBlood (100);
		
		drawFight(swordsMan);
		drawFight(magician);
	}
	static void drawFight(Role role) {
		System.out.print(role.getName());
		role.fight();
	}
}
