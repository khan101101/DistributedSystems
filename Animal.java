
public class Animal{

	private String gender;
	private String name;
	private String noise;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public String getData(){
		String s = "Name: " + getName() + " Gender: " + getGender() + " Noise: " + getNoise() + "\n";
		return s;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
