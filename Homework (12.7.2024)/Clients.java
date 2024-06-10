//Hamzah Muhsin bin Hafiz Al-Asadi
//22001057

import java.util.ArrayList;

public class Clients {

    int name, phoneNumber;

    // Create an array from Client class
    private ArrayList<Client> clients;

    // constructor for code fluidity
    public Clients() {
        this.clients = new ArrayList<>();
    }

    // Adding a client object with Name and phoneNumber as well as its reservation
    // status in an ArrayList;
    public void addClient() {
        Client test = new Client();
        test.setName();
        test.getName();
        test.setPhoneNumber();
        test.getPhoneNumber();
        clients.add(test);

    }

    public void removeClient(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < clients.size()) {
            clients.remove(indexNumber);
            System.out.println("Client removed successfully.");
        } else {
            System.out.println("Invalid client index.");
        }
    }

    public void printClient() {
        if (clients.isEmpty()) {
            System.out.println("No clients in the system.");
        } else {
            for (int i = 0; i < clients.size(); i++) {
                System.out.println("Index " + i + ": " + clients.get(i));
            }
        }
    }

    public void findClient(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < clients.size()) {
            System.out.println("Index " + indexNumber + ": " + clients.get(indexNumber));
        } else {
            System.out.println("There is no clients with the entered index number within the system.");
        }
    }
}