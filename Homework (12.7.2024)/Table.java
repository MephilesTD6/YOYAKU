// Syukri Fadhli bin Ahmad
// 24000074

import java.util.Scanner;

public class Table {

    private int tableNumber;
    private int chairNumber;
    private boolean status = false;
    
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
        tableNumber = sc.nextInt();
    }
    
    public int getTableNum() {
        System.out.println("\nThe table number is: " + tableNumber);
        return tableNumber;
    }
    
    public void setChairNum() {
        System.out.println("Enter number of chair: ");
        chairNumber = sc.nextInt();
    }

    public int getChairNum() {
        System.out.println("\nThe number of chairs is: " + chairNumber);
        return chairNumber;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getStatus() {
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

