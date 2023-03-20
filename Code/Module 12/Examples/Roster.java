import java.util.*;

public class Roster {
	
	private List<Client> clientList;
	
	public Roster() {
		clientList = new ArrayList<Client>();
	}
	
	public boolean addClient(Client client) {
		if(clientList.contains(client)) {
			return false;
		} else {
			return clientList.add(client);
		}
	}
	
	public boolean removeClient(Client client) {
		return clientList.remove(client);
	}
	
	public boolean isOnRoster(Client client) {
		return clientList.contains(client);
	}
	
	public int numberClients() {
		return clientList.size();
	}
	
	public int numberVIPClients() {
		int count = 0;
		//for(Client client : clientList) // behind the scenes: this also uses an iterator! good to use!
		Iterator<Client> iterator = clientList.iterator();
		while(iterator.hasNext()) {
			Client currentClient = iterator.next();
			if(currentClient instanceof VIPClient) {
				count++;
			}
		}
		return count;
	}
	
	public List<VIPClient> getVIPClientList() {
		List<VIPClient> list = new ArrayList<VIPClient>();
		Iterator<Client> iterator = clientList.iterator();
		while(iterator.hasNext()) {
			Client currentClient = iterator.next();
			if(currentClient instanceof VIPClient) {
				list.add((VIPClient)currentClient);
			}
		}
		return list;
	}
	
	public int totalFees() {
		int total = 0;
		for(Client client : clientList) {
			total += client.getFee();
		}
		return total;
	}
	
	public int totalVIPFees() {
		int total = 0;
		for(Client client : clientList) {
			if(client instanceof VIPClient) {
				total += client.getFee();
			}
		}
		return total;
	}
	
	public Client getRandomClient() {
		if(clientList.isEmpty()) {
			return null;
		} else {
			Collections.shuffle(clientList);
			return clientList.get(0);
		}
		
		// other approach would be to create a Random object and select a client at a random index
		// this would be a better approach if you didn't want to change the order of your list
	}
	
	

}
