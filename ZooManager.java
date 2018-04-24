import java.io.*;
import java.util.ArrayList;
public class ZooManager {

	
	ArrayList<Animal> animals = new ArrayList<>();
	Animal a = new Animal();
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		animal.setGender("male");
		animal.setName("Fish");
		animal.setNoise("Blub");
		
		Animal animal2 = new Animal();
		animal2.setGender("female");
		animal2.setName("Wolf");
		animal2.setNoise("ROAR");
		
		ZooManager zm2 = new ZooManager();
		
		zm2.animals.add(animal);// "animal is the type of object passed into the arraylist
		zm2.animals.add(animal2);
		
		Bird bird = new Bird();
		
		bird.setName("Bird");
		bird.setGender("Male");
		bird.setNoise("PiepPiep");
		bird.setFeatherColor("blue");
		
		zm2.animals.add(bird);
		
		Mammal mammal = new Mammal();
		mammal.setName("Lion");
		mammal.setGender("Male");
		mammal.setNoise("ROARRR");
		mammal.setFood("Meat");
		mammal.setFurcolor("yellow");
		
		zm2.animals.add(mammal);
		
		for(int i = 0; i < zm2.animals.size(); i++){
			System.out.println(zm2.animals.get(i).getData());
			
		}

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
