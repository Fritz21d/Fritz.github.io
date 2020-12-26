package Magic;

public class Magician extends Role {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("魔法攻擊");
		super.fight();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("魔法治療");
		return "魔法師" +super.toString();
	}
	
	
}
