// See Tho Soon Yinn
// 24000187
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Client avinash = new Client();
		Clients hamzah = new Clients();
		Reservation ashwin = new Reservation();
		Reservaction avi = new Reservaction();
		Table syukri = new Table();
		Tables seetho = new Tables();

		Scanner scan = new Scanner(System.in);

        	avinash.setName();
        	avinash.setPhoneNumber();
		System.out.println("The client's name is : " + avinash.getName());
		System.out.println("The client's contact number is: " + avinash.getPhoneNumber());
			
            	System.out.println("Do you wish to add a client? (Y/N)");
		addClient = scan.nextChar();	
			if(addClient == 'Y')
			hamzah.addClient();

		System.out.println("Do you wish to remove a client? (Y/N)");
		removeClient = scan.nextChar();	
			if(removeClient == 'Y')
            		hamzah.removeClient();

		System.out.println("Do you wish to print client details? (Y/N)");
		printClient = scan.nextChar();	
			if(printClient == 'Y')
            		hamzah.printClient();

		System.out.println("Do you wish to find a client? (Y/N)");
		findClient = scan.nextChar();
			if(findClient == 'Y')
            		hamzah.findClient();

		System.out.println("Enter table number: "+ ashwin.get_table());
		System.out.println("Enter number of clients: "+ ashwin.get_pax());
		ashwin.client_input();
            
            	avi.addRes();
            	avi.removeRes();
            	avi.printRes();
            	avi.findRes();

		System.out.println("Enter table number: " + syukri.get_table_num());
		System.out.println("Enter the number of chairs: "+ syukri.get_chair_num());
		System.out.println("Reservation status: "+ syukri.reservation_status());
		
            	seetho.addTable();
            	seetho.removeTable();
            	seetho.printTable();
            	seetho.findTable();
	}
}
