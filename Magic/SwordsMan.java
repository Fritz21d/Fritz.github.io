package Magic;

public class SwordsMan extends Role {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("揮劍攻擊");
		
		super.fight();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "劍士"+super.toString();
	}

}
