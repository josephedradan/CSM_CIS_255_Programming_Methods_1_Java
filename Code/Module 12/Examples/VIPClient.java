
public class VIPClient extends Client {
	
	private int years; 
	
	public VIPClient(String name, String id, int fee, int years) {
		super(name, id, fee);
		this.years = years;
	}
	
	
	public int getYears() {
		return years;
	}
	
	@Override 
	public int getFee() {
	     return super.getFee() / 2; 
	}
	
	@Override
	public String toString() {
		String s = super.toString() + "\tVIP";
		return s;
	}

}
