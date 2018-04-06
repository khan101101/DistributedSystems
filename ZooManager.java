import java.util.ArrayList; 
public class ZooManager{
ArrayList <String> Animal = new ArrayList<String> (); 
public ZooManager(){}
public static void main(String[]args){
Animal animal_1 = new Animal(); //instanz der Klasse Animal
animal_1.setName("Dog"); 
System.out.println(animal_1.getName()); 

}
public void addAnimals(){}
public void showAnimals(){}
public void saveData(){}
public void readData(){}
}