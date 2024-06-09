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
    
    Table syukri = new Table();

    //Adding a table object with tableNumber and chairNumber as well as its reservation status in an ArrayList;
    public void addTable() {
       tables.add(new Table(tableNumber, chairNumber));
       syukri.setTableNum();
       syukri.setChairNum();
       syukri.getTableNum();
       syukri.getChairNum();
       System.out.println("\nReservation status of table is:" + syukri.reservationStatus());
       
    }

    public void removeTable() {
       
    }

    public void printTable() {
       
    }

    public void findTable() {
        
    }
}
