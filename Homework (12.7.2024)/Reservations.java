// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.ArrayList;
import java.util.List;

public class Reservations {

 private List<Reservation> action;

    public Reservations() {
    this.action = new ArrayList<>();
    }

    public void addRes(String newName, String newPhoneNo)
    {
        name.add(newName);
        phone_number.add(newPhoneNo);
        return;
    }

    public void delRes(String delInfo)
    {
        int i = find(delInfo);
        name.remove(i);
        phone_number.remove(i);
        return;
    }

    public void printRes()
    {
        System.out.println(name);
        return;
    }

    public void findRes()
    {
        int index = -1;
        for(int i = 0; i < name.size(); i++)
        {
            if(name.get(i) == findInfo || phone_number.get(i) == findInfo)
            {
                index = i;
                break;
            }
        }
        return index;
        return;
    }
}
