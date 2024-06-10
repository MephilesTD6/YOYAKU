// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.*;


public class Reservations {

    //Create an array from Table class
    private ArrayList<Reservation> reservations;

    //constructor for code fluidity
    public Reservations() {
    this.reservations = new ArrayList<>();
    }
    
        
    //Adding a table object with tableNumber and chairNumber as well as its reservation status in an ArrayList;
    public void addRes(Reservation res) 
    {
        reservations.add(res);
        System.out.println("New reservation added!");
    }

    public void removeRes(int i) {
        if (indexNumber >= 0 && indexNumber < reservations.size()) 
        {
            reservations.remove(i);
            System.out.println("Reservation removed successfully");
        }
        else 
        {
            System.out.println("Invalid reservation");
        }
    }

    public void printRes() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations made");
        } else {
            for (int i = 0; i < reservations.size(); i++) {
                System.out.println("Index " + i + ": " + reservations.get(i));
            }
        }
    }

    public void findRes(int i) {
        if (i >= 0 && i < reservations.size())
        {
             System.out.println("Index " + i + ": " + reservations.get(i));
        }
        else
        {
            System.out.println("No reservations found");
        }
    }
}
