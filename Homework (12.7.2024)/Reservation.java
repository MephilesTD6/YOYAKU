// Ashwin A/L Ravichandran
// 22012188

import java.util.Scanner;

public class Reservation {

  private int tableNumber;
  private int number_of_persons;
  
   private Scanner scanner = new Scanner(System.in);
   
   public Reservation(int tableNumber, int number_of_persons)
   {
       this.tableNumber = tableNumber;
       this.number_of_persons = number_of_persons
       System.out.println("\nCreated a reservation object with table number" + tableNumber + "for" + number_of_persons +"persons.")
       
   }
   public Reservation()
   {
       this.tableNumber = 0;
       this.number_of_persons = 0;
   }
   public void get_table()
    {
        System.out.print("Enter table number: ");
        this.tableNumber = scanner.nextInt()
        
    }

    //input number of persons
    public void get_pax();
    {
        System.out.print("Enter number of persons: ");
        this.numberOfPersons = scanner.nextInt();
    }
    
    //read input from Client class
    public void client_input() 
    {
        get_pax();
        get_table();
        
    }
 
}
