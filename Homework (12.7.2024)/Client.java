// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.Scanner;

public class Client
{
    private String name;
    private String phoneNumber;
    
    Scanner sc = new Scanner(System.in);
    
       public void setName()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    
    public String getName()
    {
        return name;
    }

    public void setPhoneNumber()
    {
        System.out.print("Enter phone number: ");
        phoneNumber = sc.nextLine();
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
