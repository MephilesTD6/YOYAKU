// Avinash Kumar A/L Jayaseelan
// 24000113
import java.util.*;

public class Reservations {

    // Create an array from Reservation class
    private ArrayList<Reservation> reservations;

    // constructor for code fluidity
    public Reservations() {
        this.reservations = new ArrayList<>();
    }
    // Method to add reservation to list of reservations 
    public void addRes(Reservation ashwin) {
        reservations.add(ashwin);
        System.out.println("New reservation added!");
    }
    // Method to remove reservation from list of reservations
    public void removeRes(int resIndex) {
        if (resIndex >= 0 && resIndex < reservations.size()) {
            reservations.remove(resIndex);
            System.out.println("Reservation removed successfully");
        } else {
            System.out.println("Invalid reservation");
        }
    }
    // Method to print all reservations in list 
    public void printRes() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations made");
        } else {
            for (int i = 0; i < reservations.size(); i++) {
                System.out.println("Index " + i + ": " + reservations.get(i));
            }
        }
    }
    // Method to find specific reservation and print it
    public void findRes(int i) {
        if (i >= 0 && i < reservations.size()) {
            System.out.println("Index " + i + ": " + reservations.get(i));
        } else {
            System.out.println("No reservations found");
        }
    }
}
