// See Tho Soon Yinn
// 24000187

import java.util.*;


public class Tables {
    
    int tableNumber, chairNumber;


    //Create an array from Table class
    private ArrayList<Table> tables;

    //constructor for code fluidity
    public Tables() {
    this.tables = new ArrayList<>();
    }
    
        
    //Adding a table object with tableNumber and chairNumber as well as its reservation status in an ArrayList;
    public void addTable(Table syukri) {

        tables.add(syukri);
        System.out.println("\nA table has been added into the system.");
    }

    public void removeTable(int indexNumber) {
               if (indexNumber >= 0 && indexNumber < tables.size()) {
            tables.remove(indexNumber);
            System.out.println("Table removed successfully.");
        } else {
            System.out.println("Invalid table index.");
        }
    }

    public void printTable() {
        if (tables.isEmpty()) {
            System.out.println("No tables in the system.");
        } else {
            for (int i = 0; i < tables.size(); i++) {
                System.out.println("Index " + i + ": " + tables.get(i));
            }
        }
    }

    public void findTable(int indexNumber) {
        if (indexNumber >= 0 && indexNumber < tables.size()) {
             System.out.println("Index " + indexNumber + ": " + tables.get(indexNumber));
        }else{
            System.out.println("There is no table with the entered index number within the system.");
        }
    }
}



