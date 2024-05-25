package Java.Homework;

public class YoyakuDummyClass1
{
    public static void client(String name[]) // Avinash Kumar A/L Jayaseelan (24000113)
    {
        System.out.println("client method exists and can be called");
        return;
    }
    public static void reservations(String phone[]) // Avinash Kumar A/L Jayaseelan (24000113)
    {
        System.out.println("reservations method exists and can be called");
        return;
    }
    public static void main(String []args)
    {
        String name[] = new String[3];
        String phone[] = new String[3];
        client(name);
        reservations(phone);
    }
}
