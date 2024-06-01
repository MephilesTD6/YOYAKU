
public class Main
{
	public static void main(String[] args) {
	    
		Client avinash = new Client();
		Clients hamzah = new Clients();
		Reservation ashwin = new Reservation();
		Reservaction avi = new Reservaction();
		Table syukri = new Table();
		Tables seetho = new Tables();
		
		
            	hamzah.addClient();
            	hamzah.removeClient();
            	hamzah.printClient();
            	hamzah.findClient();
            
            	avi.addRes();
            	avi.removeRes();
            	avi.printRes();
            	avi.findRes();
            
            	seetho.addTable();
            	seetho.removeTable();
            	seetho.printTable();
            	seetho.findTable();
	}
}
