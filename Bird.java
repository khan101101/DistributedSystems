
public class Bird extends Animal{

	private String featherColor;

	public String getFeatherColor() {
		return featherColor;
	}

	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
	public String getData(){
		String s = super.getData() +  " Feathercolor: "+ getFeatherColor() + "\n";
		
		return s;
		
	}

}
