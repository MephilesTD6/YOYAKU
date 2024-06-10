// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.Scanner;

public class Client {
    private String name;
    private String phoneNumber;

    Scanner sc = new Scanner(System.in);

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("Created a client object with name of " + name + " and phone number: " + phoneNumber);
    }

    public Client() {
        this.name = "";
        this.phoneNumber = "";
        System.out.println("Created client object");
    }

    public void setName() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber() {
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Client name: " + name + " Number of person: " + phoneNumber;
    }

}