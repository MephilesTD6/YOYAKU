//Hamzah Muhsin bin Hafiz Al-Asadi
//22001057

import java.util.ArrayList;

public class Clients {

    string name, phoneNumber;  //Client name and phone number in string

    private ArrayList<Client> clients; //List to store clients

    //constructor
    public Clients() {
        this.clients = new ArrayList<>();
    }

    // Method to add a client to the clients list
    public void addClient(Client aiman) {

        clients.add(aiman);
        System.out.println("New client added!");

    }

    // Method to remove a client from the clients list
    public void removeClient(int clientIndex) {
        if (clientIndex >= 0 && clientIndex < clients.size()) {
            clients.remove(clientIndex);
            System.out.println("Client removed successfully.");
        } else {
            System.out.println("Invalid client index.");
        }
    }

    // Method to print the details of clients
    public void printClient() {
        if (clients.isEmpty()) {
            System.out.println("No clients in the system.");
        } else {
            for (int i = 0; i < clients.size(); i++) {
                System.out.println("Index " + i + ": " + clients.get(i));
            }
        }
    }

    // Method to find a specific client in the clients list using index number as an input
    public void findClient(int clientIndex) {
        if (clientIndex >= 0 && clientIndex < clients.size()) {
            System.out.println("Index " + clientIndex + ": " + clients.get(clientIndex));
        } else {
            System.out.println("There is no clients with the entered index number within the system.");
        }
    }
}
