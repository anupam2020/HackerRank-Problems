/*INPUT:
 * He is a good boy, isn't he?
 * OUTPUT:
 * He
 * is
 * a
 * good
 * boy
 * isn
 * t
 * he
 */

import java.io.*;
import java.util.*;

public class JavaStringTokensHackerRank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        //He is a good boy, isn't he?
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ");
            //^ ->non-alphabetic characters
            //If dont declare ^ ->alphabetic characters
            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                
                // Print number of tokens
                System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    }
}