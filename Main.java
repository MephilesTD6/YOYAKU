/*	1. CLIENT MANAGEMENT
 *	2. RESERVATION MANAGEMENT
 * 	3. TABLE MANAGEMENT
 * 	4. EXIT PROGRAM
 * 	CHOOSE OPTION : _____
 * 
 * 
 * 	CLIENT MANAGEMENT:
 *  1. ADD CLIENT
 *  2. REMOVE CLIENT
 *  3. PRINT ALL CLIENT
 *  4. FIND CLIENT
 *  5. BACK
 *  CHOOSE OPTION: _____
 * 	
 * 	RESERVATION MANAGEMENT
 *  1. ADD RESERVATION
 *  2. REMOVE RESERVATION
 *  3. PRINT ALL RESERVATION
 *  4. FIND RESERVATION
 *  5. BACK
 *	CHOOSE OPTION: _____ 
 *
 * 
 * 	TABLE MANAGEMENT
 *  1. ADD TABLE: 
 *  2. REMOVE TABLE: 
 *  3. PRINT ALL TABLE: 
 *  4. FIND TABLE: 
 *  5. BACK 
 *  CHOOSE OPTION: _____
 * 	
 */

public class Main {
	public static void main(String[] args) {
		Clients clients = new Clients();

		clients.addClient();
		clients.display();
	}
}
