import java.time.LocalDate;
import java.util.*;
class day_date
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day, month and year");
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek());
    }
}