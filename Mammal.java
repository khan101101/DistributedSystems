
public class Mammal extends Animal{

	private String furcolor;
	
	private String food;

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getFurcolor() {
		return furcolor;
	}

	public void setFurcolor(String furcolor) {
		this.furcolor = furcolor;
	}
	
	public String getData(){
		String s = super.getData() + " Food: " + getFood() + " Furcolor: " + getFurcolor();
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
