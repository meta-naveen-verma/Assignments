abstract public class Birds extends Animal{
	boolean fly;
	/*
	 * constructor
	 */
	public Birds(int age,String name, String category, float weight,boolean canFly,String sound) {
		super(age,name,category,weight,sound);
		fly = canFly;
	}

	/*
	 * canfly or not
	 */
	abstract public boolean canFly();
}