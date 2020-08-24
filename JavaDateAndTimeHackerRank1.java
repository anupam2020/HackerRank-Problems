/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

For example, if you are given the date , the method should return  as the day on that date.

image

Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.*/
//ONE LINE CODE:- return LocalDate.of(year, month, day).getDayOfWeek().name();

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class JavaDateAndTimeHackerRank1 {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    
    public static String getDay(String day, String month, String year) {
          
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
          
        Calendar c = Calendar.getInstance();
        c.set(y, m-1, d); 
            
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
    }
}