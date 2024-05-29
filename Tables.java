public class Tables {

    // Constructor
    public Tables(int size) {
        table = new Table[size];

        // To initialize the array elements with default values
        for (int i = 0; i < size; i++) {
            table[i] = new Table("Table" + i, i);
      }
    }
    Table tables = new Tables(100);

    public int addTable() {
        return 1;
    }

    public int removeTable() {
        return -1;
    }

    public void print() {
       
    }

    public void find() {
        
    }
}
