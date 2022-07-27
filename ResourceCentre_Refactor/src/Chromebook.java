public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os; 
	}
	
	public String toString(){
		
		// Write your codes here
		String output = "";
		output = super.toString();

		output += String.format("%-20s\n",os);

	
		return output;
		

	}
}


