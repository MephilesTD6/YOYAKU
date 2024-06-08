/* -Handle input of individual client 
 * -Will be called in main using argument (name, phone number)
 * -
 */

import java.util.Scanner;

public class Client {
    private String name;
    private String phoneNumber;

    Scanner input = new Scanner(System.in);

    // CONSTRUCTORS
    public Client() {
        this.name = "";
        this.phoneNumber = "";
    }

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // SETTERS
    public void setName() {
        System.out.println("Name: ");
        name = input.nextLine();
    }

    public void setPhoneNumber() {
        System.out.println("Phone number: ");
        phoneNumber = input.nextLine();
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
