/*
source: http://tutorials.jenkov.com/java/access-modifiers.html
***************************Access Modifiers and Inheritance********************************
When you create a subclass of some class, the methods in the subclass cannot have less accessible access modifiers assigned to them 
than they had in the superclass. For instance, if a method in the superclass is public then it must be public in the subclass too,
in case the subclass overrides the method. If a method in the superclass is protected then it must be either protected or public in 
the subclass.

While it is not allowed to decrease accessibility of an overridden method, it is allowed to expand accessibility 
of an overridden method. For instance, if a method is assigned the default access modifier in the superclass, 
then it is allowed to assign the overridden method in the subclass the public access modifier.

------------------------------------------------------------------------------------------------------------------------------------

---------------------private and protected access-modifiers are forbidden to assign to classes----------------------------------
private : accessible only in the same class
 public: any class have access from anywhere even if the code is in a different class and different package!
 default (package): accessible inside the same class and in the all classes in the same pakage have access
protected : same as package access modifier + subclasses have access to protected methods and variables of the superclass
static:
final: google it!
*/


	import java.util.ArrayList; 



	public class ZooManager{
	ArrayList <String> Animal = new ArrayList<String> (); 
	public ZooManager()
    {
        //constructor
    }
	
        
        
	public static void main(String[]args){
        
        
	Animal animal = new Animal(); //instanz der Klasse Animal
    Bird bird = new Bird();
	animal.setName("Dog"); 
	animal.setGender("Female");
	animal.setNoise("Bau");
    
    bird.setName("Tooti");
    bird.setGender("Male");
    bird.setNoise("Mee-Mee");
    //Animal.add(bird); it does'nt work!
    System.out.println("---------an Animal-------");
	System.out.println(animal.getName()); 
	System.out.println(animal.setGender("Female"));
	System.out.println(animal.getNoise());
    System.out.println("--------A Bird--------");
    System.out.println(bird);
        
    System.out.println(bird.getName());
    System.out.println(bird.getGender());
    System.out.println(bird.getNoise());

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
