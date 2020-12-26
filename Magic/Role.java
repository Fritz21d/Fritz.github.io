package Magic;

public class Role {
	protected String name;
	protected	int	level;
	protected	int blood;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevl() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	public void fight() {}
	
	public String toString() {
		return String.format("(%s,%d,%d)", this.name, this.level, this.blood);
	}
}
