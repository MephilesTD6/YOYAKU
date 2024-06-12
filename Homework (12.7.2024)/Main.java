// See Tho Soon Yinn
// 24000187
import java.util.*;

public class Main { 
    public static void main (String[]args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner (System.in);
     
        char addT, removeT, printT, findT;
        char addR, removeR, printR, findR;
        char addC, removeC, printC, findC;
        int tableIndex, resIndex, clientIndex;

        // Creating and initializing a Client object
        Client aiman = new Client();
        aiman.setName();
        aiman.setPhoneNumber();
        aiman.getName();
        aiman.getPhoneNumber();
        System.out.println(aiman);

        // Creating and initializing a Clients collection
        Clients hamzah = new Clients();

        // Ask user if they want to add a client to the system
        System.out.println("\nDo you want to add a client into the system? (Y/N)");
        addC = sc.next().charAt(0);
        if (addC == 'Y' || addC == 'y') {
            hamzah.addClient(aiman);// Add client to the system
        }
     
        // Ask user if they want to remove a client from the system
        System.out.println("Do you want to remove a client from the system? (Y/N)");
        removeC = sc.next().charAt(0);
        if (removeC == 'Y' || removeC == 'y') {
            System.out.println("Enter client index number to remove: ");
            clientIndex = sc.nextInt();
            hamzah.removeClient(clientIndex);  // Remove client from the system by index
        }

        // Ask user if they want to print the client list from the system
        System.out.println("Do you want to print the client list from the system? (Y/N)");
        printC = sc.next().charAt(0);
        if (printC == 'Y' || printC == 'y') {
            hamzah.printClient();  // Print all clients in the system
        }

        // Ask user if they want to find a client in the system
        System.out.println("Do you want to find a client in the system? (Y/N)");
        findC = sc.next().charAt(0);
        if (findC == 'Y' || findC == 'y') {
            System.out.println("Enter client index number: ");
            clientIndex = sc.nextInt();
            hamzah.findClient(clientIndex);  // Find and display client by index
        }

        // Creating and initializing a Table object
        Table syukri = new Table();
        syukri.setTableNum();
        syukri.setChairNum();
        syukri.getTableNum();
        syukri.getChairNum();
        System.out.println("\nReservation status of table is:" + syukri.getStatus());  // Print table reservation status

        // Creating and initializing a Tables collection
        Tables seetho = new Tables();

        //All further codes which include actions similar to that of Clients follows the same function for their class
        System.out.println("Do you want to add a table into the system? (Y/N)");
        addT = sc.next().charAt(0);
        if (addT == 'Y' || addT == 'y') {
            seetho.addTable(syukri);
        }

        System.out.println("Do you want to remove a table from the system? (Y/N)");
        removeT = sc.next().charAt(0);
        if (removeT == 'Y' || removeT == 'y') {
            System.out.println("Enter table index number to remove: ");
            tableIndex = sc.nextInt();
            seetho.removeTable(tableIndex);
        }

        System.out.println("Do you want to print the table list from the system? (Y/N)");
        printT = sc.next().charAt(0);
        if (printT == 'Y' || printT == 'y') {
            seetho.printTable();
        }

        System.out.println("Do you want to find a table in the system? (Y/N)");
        findT = sc.next().charAt(0);
        if (findT == 'Y' || findT == 'y') {
            System.out.println("Enter table index number: ");
            tableIndex = sc.nextInt();
            seetho.findTable(tableIndex);
        }

        // Creating and initializing a Reservation object
        Reservation ashwin = new Reservation();
        ashwin.setTable();
        ashwin.setPax();
        ashwin.getTable();
        ashwin.getPax();
        ashwin.readClientDetails(); // Read and print client details associated with the reservation

        // Creating and initializing a Reservations collection
        Reservations avinash = new Reservations();

        System.out.println("\nDo you want to add a reservation into the system? (Y/N)");
        addR = sc.next().charAt(0);
        if (addR == 'Y' || addR == 'y') {
            avinash.addRes(ashwin);
            ashwin.setTableStatus(true);
        }

        System.out.println("Do you want to remove a reservation from the system? (Y/N)");
        removeR = sc.next().charAt(0);
        if (removeR == 'Y' || removeR == 'y') {
            System.out.println("Enter the reservation index number to remove: ");
            resIndex = sc.nextInt();
            avinash.removeRes(resIndex);
            ashwin.setTableStatus(false);
        }

        System.out.println("Do you want to print the reservation list from the system? (Y/N)");
        printR = sc.next().charAt(0);
        if (printR == 'Y' || printR == 'y') {
            avinash.printRes();
        }

        System.out.println("Do you want to find a reservation in the system? (Y/N)");
        findR = sc.next().charAt(0);
        if (findR == 'Y' || findR == 'y') {
            System.out.println("Enter the reservation index number: ");
            resIndex = sc.nextInt();
            avinash.findRes(resIndex);
        }

        sc.close();
    }
}
