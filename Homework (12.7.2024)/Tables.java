// See Tho Soon Yinn
// 24000187

import java.util.*;


public class Tables {

    //Create an array from Table class
    private ArrayList<Table> tables;

    //constructor for code fluidity
    public Tables() {
    this.tables = new ArrayList<>();
    }
    
        
    //Adding a table object with tableNumber and chairNumber as well as its reservation status in an ArrayList;
    public void addTable(Table syukri) {

        tables.add(syukri);
        System.out.println("New table added!");
    }

    public void removeTable(int tableIndex) {
               if (tableIndex >= 0 && tableIndex < tables.size()) {
            tables.remove(tableIndex);
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

    public void findTable(int tableIndex) {
        if (tableIndex >= 0 && tableIndex < tables.size()) {
             System.out.println("Index " + tableIndex + ": " + tables.get(tableIndex));
        }else{
            System.out.println("There is no table with the entered index number within the system.");
        }
    }
}

}



