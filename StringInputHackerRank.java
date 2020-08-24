/*
 * Program in Java to do the following tasks
 * 
 * INPUT:
 * 4
 * 3.14
 * Hello
 * 
 * OUTPUT:
 * String: Hello
 * Double: 3.14
 * Int: 4
 * 
 */
import java.util.Scanner;

public class StringInputHackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        
        if(scan.hasNextLine() || s.isEmpty()){
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}