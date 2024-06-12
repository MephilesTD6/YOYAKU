// Ashwin A/L Ravichandran
// 22012188

import java.util.Scanner;

public class Reservation {

  private int tableNumber; // stores the table number for the reservation
  private int pax;// stores the number of persons for the reservation
  private boolean status;// stores the reservation status (true for reserved, false for not reserved)
  private String name;// stores the client's name
  private String phoneNumber;// stores the client's phone number
    
  
   private Scanner scanner = new Scanner(System.in);
  
   // Constructor to initialize reservation with table number, pax, and status
   public Reservation(int tableNumber, int pax, boolean status)
   {
       this.tableNumber = tableNumber;
       this.pax = pax;
       this.status = false;
       System.out.println("\nCreated a reservation object with table number" + tableNumber + "for" + pax +"persons.");
       
   }

  // Default constructor
   public Reservation()
   {
       this.tableNumber = 0;
       this.pax = 0;
       this.status = false;
   }
   
   //input table number
      public void setTable()
    {
        System.out.print("Enter table number to be reserved: ");
        this.tableNumber = scanner.nextInt();
        
    }

    //input number of persons
    public void setPax()
    {
        System.out.print("Enter number of pax: ");
        this.pax = scanner.nextInt();
    }

  // Method to get the table number
   public int getTable()
   {
       System.out.print("\nThe table to be reserved is table no.: " + tableNumber);
       return tableNumber;
   }

  // Method to get the number of persons
   public int getPax ()
   {
       System.out.print("\nThe number of pax are : " + pax);
       return pax;
   }

  // Method to read client details (name and phone number)
    public void readClientDetails() {
        Client aiman = new Client(); // assuming Client class exists with setName and setPhoneNumber methods
        aiman.setName(); // sets client's name
        aiman.setPhoneNumber(); // sets client's phone number
        this.name = aiman.getName(); // stores client's name in reservation
        this.phoneNumber = aiman.getPhoneNumber(); // stores client's phone number in reservation
    }

   // Method to set the table status (reserved or not reserved)
    public void setTableStatus(boolean status) {
        Table syukri = new Table(); // assuming Table class exists with setStatus method
        this.status = status; // updates reservation status
        syukri.setStatus(status); // updates table status
    }

  // Overriding toString method to display reservation details
        @Override
    public String toString() {
        return "Table Number: " + tableNumber + ", Number of pax: " + pax + ", Client name: " + name + ", Client phone number: " + phoneNumber + ", Reservation status: " + status;
    } 
}
