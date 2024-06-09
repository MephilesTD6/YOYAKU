// See Tho Soon Yinn
// 24000187
import java.util.*;

 
public class Main { 
    public static void main (String[]args) {
 
        Scanner sc = new Scanner (System.in);
        char addT;

        /*Client avinash = new Client();
        
        avinash.setName();
        avinash.getPhoneNumber();
        System.out.println("The client's name is : " + avinash.getName());
        System.out.println("The client's contact number is: " + avinash.getPhoneNumber()); */ 

        Tables seetho = new Tables ();

        System.out.println("Do you want to add a table into the system? (Y/N)");
        addT = sc.next ().charAt (0);
            if (addT == 'Y') 
				seetho.addTable(); 
				
    }
}
