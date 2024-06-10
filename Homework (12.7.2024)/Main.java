
// See Tho Soon Yinn
// 24000187
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char addT, removeT, printT, findT;
        int indexNumber;

        /*
         * Client avinash = new Client();
         * 
         * avinash.setName();
         * avinash.getPhoneNumber();
         * System.out.println("The client's name is : " + avinash.getName());
         * System.out.println("The client's contact number is: " +
         * avinash.getPhoneNumber());
         */

        // TESTING TABLE CLASS
        Table syukri1 = new Table();// test constructor with no parameter
        syukri1.setTableNum();
        syukri1.setChairNum();
        syukri1.getTableNum();
        syukri1.getChairNum();
        System.out.println(syukri1);

        Table syukri2 = new Table(6, 9);// test constructor with parameter
        syukri2.setTableNum();
        syukri2.setChairNum();
        syukri2.getTableNum();
        syukri2.getChairNum();
        System.out.println(syukri2);

        // TESTING TABLES CLASS
        Tables seetho = new Tables();
        System.out.println("Do you want to add a table into the system? (Y/N)");
        addT = sc.next().charAt(0);
        if (addT == 'Y' || addT == 'y') {
            seetho.addTable(syukri1);
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
