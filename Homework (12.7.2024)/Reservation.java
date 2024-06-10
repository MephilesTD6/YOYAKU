// Ashwin A/L Ravichandran
// 22012188

import java.util.Scanner;

public class Reservation {

    private int tableNumber;
    private int pax;

    private Scanner scanner = new Scanner(System.in);

    public Reservation(int tableNumber, int pax) {
        this.tableNumber = tableNumber;
        this.pax = pax;
        System.out.println("\nCreated a reservation object with table number" + tableNumber + "for" + pax + "persons.");

    }

    public Reservation() {
        this.tableNumber = 0;
        this.pax = 0;
        System.out.println("\nCreated a reservation object");
    }

    // input table number
    public void setTable() {
        System.out.println("Enter table number: ");
        this.tableNumber = scanner.nextInt();

    }

    // input number of persons
    public void setPax() {
        System.out.println("Enter number of pax: ");
        this.pax = scanner.nextInt();
    }

    public int getTable() {
        System.out.println("\nThe table number is: " + tableNumber);
        return tableNumber;
    }

    public int getPax() {
        System.out.println("\nThe number of pax are : " + pax);
        return pax;
    }

    // read input from Client class
    Client aiman = new Client();
    String name = aiman.getName();
    String phoneNumber = aiman.getPhoneNumber();

    // To translate output to human friendly language, if not used, output from
    // Reservations would be printed as Table@1a2b3c4d
    @Override
    public String toString() {
        return "Table Number: " + tableNumber + ", Number of pax: " + pax + ", Client name: " + name
                + ", Client phone number: " + phoneNumber;
    }
}