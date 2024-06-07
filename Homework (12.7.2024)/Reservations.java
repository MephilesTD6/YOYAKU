// Avinash Kumar A/L Jayaseelan
// 24000113

import java.util.*;

public class Reservations {

    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> phone_number = new ArrayList<String>();

    public void add(String newName, String newPhoneNo)
    {
        name.add(newName);
        phone_number.add(newPhoneNo);
        return;
    }

    public void delete(String delInfo)
    {
        
        return;
    }

    public void print(int index)
    {
        System.out.println(name);
    }

    public int find(String findInfo)
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
    }

    public ArrayList<String> getNameList()
    {
        return name;
    }
}
