// Syukri Fadhli bin Ahmad
// 24000074

import java.util.Scanner;

public class Table {

    private int tableNumber;
    private int chairNumber;
    private boolean status = false;
    
     Scanner sc = new Scanner(System.in);
     //CONSTRUCTORS
     public Table(int tableNumber, int chairNumber){//object will be created when called with parameters
         this.tableNumber = tableNumber;//assigned to value of parameters passed through
         this.chairNumber = chairNumber;
         System.out.println("\nCreated a Table object ");
     }

     public Table(){//default object will be created
         this.tableNumber = tableNumber;
         this.chairNumber = chairNumber;
         System.out.print("\nCreated a Table object ");
     }
    
    //SETTERS
    public void setTableNum() {//prompt to set table number
        System.out.print("Enter table number: ");
        tableNumber = sc.nextInt();
    }
    
    public void setChairNum() {//prompt to set chair number
        System.out.print("Enter number of chair: ");
        chairNumber = sc.nextInt();
    }

    public void setStatus(boolean status) {//prompt to give status of reservation
        this.status = status;
    }

    //GETTERS
    public int getTableNum() {//return table number when called
        System.out.print("\nThe table number is: " + tableNumber);
        return tableNumber;
    }

    public int getChairNum() {//return chair number when called
        System.out.print("\nThe number of chairs is: " + chairNumber);
        return chairNumber;
    }
    
    public boolean getStatus() {//return status of reservation
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

