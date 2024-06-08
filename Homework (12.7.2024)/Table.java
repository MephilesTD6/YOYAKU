// Syukri Fadhli bin Ahmad
// 24000074

/* -This class acts as an input for individual table and chair
   -Determine the reservation status 
*/

import java.util.Scanner;

public class Table {

    private int tableNumber;
    private int chairNumber;

    Scanner input = new Scanner(System.in);

    // CONSTRUCTOR
    public Table(int tableNumber, int chairNumber) {
        this.tableNumber = tableNumber;
        this.chairNumber = chairNumber;
        System.out.println("\nCreated a Table object ");
    }

    public Table() {
        this.tableNumber = tableNumber;
        this.chairNumber = chairNumber;
    }

    // SETTERS
    public void setTableNum() {
        System.out.print("Enter table number: ");
        this.tableNumber = input.nextInt();
    }

    public void setChairNum() {
        System.out.print("Enter number of chair: ");
        this.chairNumber = input.nextInt();
    }

    // GETTERS
    public int getTableNum() {
        System.out.println("\nThe table number is: " + tableNumber);
        return tableNumber;
    }

    public int getChairNum() {
        System.out.println("\nThe chair numbe is: " + chairNumber);
        return chairNumber;
    }

    public boolean reservation_status() {
        boolean status = false;

        return status;
    }
}
