
public class Client {
	private String name, id;
	private int fee;
	
	public Client(String name, String id, int fee) {
		this.name = name;
		this.id = id;
		this.fee = fee;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getFee() {
		return fee;
	}
	
	@Override
	public String toString() {
		String s = name + "\t" + "ID: " + id + "\tFee: $" + fee;
		return s;
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Client) {
			Client otherClient = (Client) obj;
			return id.equalsIgnoreCase(otherClient.id);
		} else {
			return false;
		}
	}

	

}
