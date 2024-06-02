
public class Main
{
	public static void main(String[] args) {
	    
		Client avinash = new Client();
		Clients hamzah = new Clients();
		Reservation ashwin = new Reservation();
		Reservaction avi = new Reservaction();
		Table syukri = new Table();
		Tables seetho = new Tables();
		
		avinash.get_name();
		avinash.get_phone_number();
			
            	hamzah.addClient();
            	hamzah.removeClient();
            	hamzah.printClient();
            	hamzah.findClient();

		ashwin.get_table_num();
		ashwin.get_pax();
		ashwin.client_input();
            
            	avi.addRes();
            	avi.removeRes();
            	avi.printRes();
            	avi.findRes();

		syukri.();
		syukri.();
		syukri.();
		
            	seetho.addTable();
            	seetho.removeTable();
            	seetho.printTable();
            	seetho.findTable();
	}
}
