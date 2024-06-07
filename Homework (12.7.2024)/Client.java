// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.Scanner;

public class Client
{
    private String name;
    private String phone_number;
    
    Scanner sc = new Scanner(System.in);
    
    public void get_name()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    
    public void get_phone_number()
    {
        System.out.print("Enter phone number: ");
        phone_number = sc.nextLine();
    }
}
