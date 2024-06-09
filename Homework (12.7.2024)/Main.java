// See Tho Soon Yinn
// 24000187
import java.util.*;

 
public class Main { 
    public static void main (String[]args) {
 
        Scanner sc = new Scanner (System.in);
        char addT,removeT,printT,findT;
        int indexNumber;

        /*Client avinash = new Client();
        
        avinash.setName();
        avinash.getPhoneNumber();
        System.out.println("The client's name is : " + avinash.getName());
        System.out.println("The client's contact number is: " + avinash.getPhoneNumber()); */ 
        

        Tables seetho = new Tables();

        System.out.println("Do you want to add a table into the system? (Y/N)");
        addT = sc.next().charAt(0);
        if (addT == 'Y' || addT == 'y') {
            seetho.addTable();
        }

        System.out.println("Do you want to remove a table from the system? (Y/N)");
        removeT = sc.next().charAt(0);
        if (removeT == 'Y' || removeT == 'y') {
            System.out.println("Enter table index number to remove: ");
            indexNumber = sc.nextInt();
            seetho.removeTable(indexNumber);
        }

        System.out.println("Do you want to print the table list from the system? (Y/N)");
        printT = sc.next().charAt(0);
        if (printT == 'Y' || printT == 'y') {
            seetho.printTable();
        }

        System.out.println("Do you want to find a table in the system? (Y/N)");
        findT = sc.next().charAt(0);
        if (findT == 'Y' || findT == 'y') {
            System.out.println("Enter table index number: ");
            indexNumber = sc.nextInt();
            seetho.findTable(indexNumber);
        }

        sc.close();
    }
}
