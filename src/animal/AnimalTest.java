package animal;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		//for문을 사용한 출력
		for(Animal animal : animalList) {
			animal.move();
		}
		
		test.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.hovering();
			}
			else {
				System.out.println("unsupported type");
			}
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
