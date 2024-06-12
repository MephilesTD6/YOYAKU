// Aiman Naim bin Shaiful Zahrin
// 22005653

import java.util.Scanner;

public class Client
{
    private String name;
    private String phoneNumber;
    
    Scanner sc = new Scanner(System.in);
    
       public void setName()
    {
        System.out.print("\nEnter client name: ");
        name = sc.nextLine();
    }
    
    public String getName()
    {
        return name;
    }

    public void setPhoneNumber()
    {
        System.out.print("Enter client phone number: ");
        phoneNumber = sc.nextLine();
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    @Override
    public String toString() {
        return "Client name: " + name + ", client phone number: " + phoneNumber;
    }
}
