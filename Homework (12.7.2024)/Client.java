// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.Scanner;

public class Client
{
    private String name;
    private String hp;
    
    Scanner sc = new Scanner(System.in);
    
    public void setName()
    {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    
    public void setHP()
    {
        System.out.print("Enter phone number: ");
        hp = sc.nextLine();
    }

    public String getName()
    {
        System.out.println(name);
        return name;
    }

    public String getHP()
    {
        System.out.println(hp);
        return hp;
    }

}

