  // Aiman Naim bin Shaiful Zahrin
    // 22005653
    
    // Importing the Scanner class for user input
    import java.util.Scanner;
    
    public class Client
    {
        // Private instance variables to store client's name and phone number
        private String name;
        private String phoneNumber;
        
        
        //Constructors 
        public Client(){
            this.name = "";
            this.phoneNumber = "";
        }
        
        public Client(String name , String phone){
            this.name = name;
            this.phoneNumber = phone;
            System.out.println("\nCreated a client object with client name: " + name + " with phone number: " + phone);
        }
        
        // Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Method to set the client's name
        public void setName()
        {
            // Prompting the user to enter the client's name
            System.out.print("\nEnter client name: ");
            // Reading the client's name from the console
            name = sc.nextLine();
        }
        
        // Method to get the client's name
        public String getName()
        {
            // Returning the client's name
            return name;
        }
    
        // Method to set the client's phone number
        public void setPhoneNumber()
        {
            // Prompting the user to enter the client's phone number
            System.out.print("Enter client phone number: ");
            // Reading the client's phone number from the console
            phoneNumber = sc.nextLine();
        }
    
        // Method to get the client's phone number
        public String getPhoneNumber()
        {
            // Returning the client's phone number
            return phoneNumber;
        }
        
        // Overriding the toString() method to return a string representation of the client's details
        @Override
        public String toString() {
            // Returning the client's name and phone number in a formatted string
            return "Client name: " + name + ", client phone number: " + phoneNumber;
        }
    }
    
