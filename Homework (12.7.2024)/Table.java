// Syukri Fadhli bin Ahmad
// 24000074

/* -This class acts as an input for individual table and chair
   -Determine the reservation status 
*/

import java.util.Scanner;

public class Table {

    private int tableNumber;
    private int chairNumber;
    
    boolean status = false;
    
     Scanner sc = new Scanner(System.in);
     
     public Table(int tableNumber, int chairNumber){
         this.tableNumber = tableNumber;
         this.chairNumber = chairNumber;
         System.out.println("\nCreated a Table object ");
     }

     public Table(){
         this.tableNumber = tableNumber;
         this.chairNumber = chairNumber;
         System.out.println("\nCreated a Table object ");
     }
    
    
    public void setTableNum() {
        System.out.println("Enter table number: ");
        this.tableNumber = sc.nextInt();
    }
    
    public void setChairNum() {
        System.out.println("Enter number of chair: ");
        this.chairNumber = sc.nextInt();
    }
    
    public int getTableNum() {
        System.out.println("\nThe table number is: " + tableNumber);
        return tableNumber;
    }

    public int getChairNum() {
        System.out.println("\nThe number of chairs is: " + chairNumber);
        return chairNumber;
    }

    public boolean reservationStatus() {
        boolean status = false;

        return status;
    }
    
    //To translate output to human friendly language, if not used, output from Tables would be printed as Table@1a2b3c4d
    /*Another way to code would to be:
    
       public String printDetails() {
        return "Table Number: " + tableNumber + ", Chair Number: " + chairNumber;
    }
    
    then, when calling ArrayList actions: use for example, seetho.get(indexNumber).printDetails();
    */
        @Override
    public String toString() {
        return "Table Number: " + tableNumber + ", Chair Number: " + chairNumber + ", Reservation status: " + status;
    }
}
