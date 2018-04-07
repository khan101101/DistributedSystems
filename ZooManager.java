/*private : only in the same class
 public: any class
protected : all classes in the same pakage
static:
final: google it!
*/


	import java.util.ArrayList; 
	public class ZooManager{
	ArrayList <String> Animal = new ArrayList<String> (); 
	public ZooManager(){}
	
	public static void main(String[]args)
	{
	Animal animal = new Animal(); //instanz der Klasse Animal
	animal.setName("Dog"); 
	animal.setGender("Female");
	animal.setNoise("Bau");
	System.out.println(animal.getName()); 
	System.out.println(animal.setGender("Female"));
	System.out.println(animal.getNoise());

	}
	public void addAnimals()
	{
		
	}
	public void showAnimals()
	{
		
	}
	public void saveData()
	{
		
	}
	public void readData()
	{
		
	}
	
	}