//Test by Mephiles
import java.util.Scanner;

class Tables {

    int[] tables = {1, 0, 1, 1, 0, 1};

    public int addTable() {
        return 1;
    }

    public int removeTable() {
        return -1;
    }

    public void print() {
        int sum = 0;
        System.out.print("\nTotal tables: ");
        
        for (int i = 0; i < tables.length; i++)
            sum += tables[i];
        
        System.out.println(sum);
    }

    public int find() {
        Scanner scanner = new Scanner(System.in);
        int i;
        
        System.out.print("Enter table number: ");
        i = scanner.nextInt();
        
        return tables[i];
    }
}

    public static void main(String[] args) {
        Tables ashwin = new Tables();

        System.out.println(ashwin.addTable());
        System.out.println(ashwin.removeTable());
        ashwin.print();
        System.out.println(ashwin.find());
    }
