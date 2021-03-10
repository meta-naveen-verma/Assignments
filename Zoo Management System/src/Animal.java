/*********************************************************************
 * Name 	:- Animal
 * Date 	:- 28-02-2021
 * Author 	:- Naveen Verma
 * Purpose 	:- To provide an structure to Animals
 *********************************************************************/
abstract public class Animal {
	int ageOfAnimal;
	static int counter =0;
	final int animalId;
	String animalName;
	String categoryOfAnimal;
	float weightOfAnimal;
	String soundOfAnimal;
	/*****************************************************************************
	 * Name	:- Animal
	 * Date :- 28-02-2021
	 * Author :-Naveen Verma
	 * Purpose :- initialize values at the time of object creation
	 * Input :- Take  values
	 * @param age
	 * @param name
	 * @param category 
	 * @param weight
	 * @param sound
	 *****************************************************************************/
	public Animal(int age,String name, String category, float weight,String sound) {
		this.ageOfAnimal = age;
		this.animalName = name;
		this.categoryOfAnimal = category;
		this.weightOfAnimal = weight;
		animalId = counter++;
		soundOfAnimal = sound;
	}
	/*****************************************************************************
	 * Name	:- getSound
	 * Date :- 28-02-2021
	 * Author :-Naveen Verma
	 * Purpose :-Abstract method to get sound of animal 
	 *****************************************************************************/
	abstract public String getSound();
}