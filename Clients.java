/* -contains list of Client
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Clients {
    String name, phoneNumber;

    Scanner input = new Scanner(System.in);

    private ArrayList<Client> clientDatabase;

    // CONSTRUCTORS
    public Clients() {
        this.clientDatabase = new ArrayList<>();
    }

    public void addClient() {
        Client newClient = new Client(name, phoneNumber);
        newClient.setName();
        newClient.setPhoneNumber();
        clientDatabase.add(newClient);
        System.out.println("Client added successfully.");
    }

    // DEBUG ZONE
    public void display() {
        System.out.println(clientDatabase.get(0));

    }

    public void removeClient() {
        System.out.print("Enter client name to be removed: ");
        String name = input.nextLine();
        boolean isRemoved = false;

    }

    public void printClient() {

    }

    public void findClient() {

    }
}
