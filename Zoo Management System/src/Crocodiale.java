public class Crocodiale extends Reptiles {
	public Crocodiale(int age,String name, String category, float weight, String canSwim,String sound){
		super(age, name, category, weight,canSwim,sound);
	}

	/**
	 * return sound
	 */
	public String getSound(){
		return super.soundOfAnimal;
	}
	/**
	 * return can swim or not
	 */
	public String swimSpeed(){
		return super.swim;
	}
}