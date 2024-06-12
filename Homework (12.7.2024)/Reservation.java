// Ashwin A/L Ravichandran
// 22012188

import java.util.Scanner;

public class Reservation {

  private int tableNumber;
  private int pax;
  private boolean status;
  private String name;
  private String phoneNumber;
  
   private Scanner scanner = new Scanner(System.in);
   
   public Reservation(int tableNumber, int pax, boolean status)
   {
       this.tableNumber = tableNumber;
       this.pax = pax;
       this.status = false;
       System.out.println("\nCreated a reservation object with table number" + tableNumber + "for" + pax +"persons.");
       
   }
   public Reservation()
   {
       this.tableNumber = 0;
       this.pax = 0;
       this.status = false;
   }
   
   //input table number
      public void setTable()
    {
        System.out.print("Enter table number: ");
        this.tableNumber = scanner.nextInt();
        
    }

    //input number of persons
    public void setPax()
    {
        System.out.print("Enter number of pax: ");
        this.pax = scanner.nextInt();
    }
    
   public int getTable()
   {
       System.out.print("\nThe table number is: " + tableNumber);
       return tableNumber;
   }
   
   public int getPax ()
   {
       System.out.print("\nThe number of pax are : " + pax);
       return pax;
   }
    
    public void readClientDetails() {
        Client aiman = new Client();
        aiman.setName();
        aiman.setPhoneNumber();
        this.name = aiman.getName();
        this.phoneNumber = aiman.getPhoneNumber();
    }

    public void setTableStatus(boolean status) {
        Table syukri = new Table();
        this.status = status;
        syukri.setStatus(status);
    }
    
        @Override
    public String toString() {
        return "Table Number: " + tableNumber + ", Number of pax: " + pax + ", Client name: " + name + ", Client phone number: " + phoneNumber + ", Reservation status: " + status;
    } 
}
