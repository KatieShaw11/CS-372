/*
The Girl Scouts are back, and need a program to track cookie sales. They are 
selling Thin Mints ($3), Samoas ($4), and Chocolate Chip ($5). Write an 
interface that allows the user to track how many of each are sold, and displays 
a running total of sales.
 */
package pr2_7;
import java.util.Scanner;

/**
 *
 * @author kshaw
 */
public class PR2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("Purchase a cookie! Thin Mints ($3), Samoas ($4), or Choc Chip ($5). (Type 3, 4, or 5)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }
    
}
