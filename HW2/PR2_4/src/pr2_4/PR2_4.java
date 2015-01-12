/*
Calculating PI:

Calculate the value of π from the infinite series:	
π = 4 – 4/3 + 4/5 – 4/7 + 4/9 – 4/11 + … 
Use a command-line argument to decide how far into the series to go. 
Make sure to use a separate class to perform the calculation. 
Print a table that shows the value of π approximated by computing the first 
    200,000 terms of this series.
 */
package pr2_4;
import java.util.Scanner;
import java.math.*;
import pr2_4.Calculation.*;
//import pr2_4.Calculation.*;
/**
 *
 * @author kshaw
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int howFar;
        
        System.out.println("How far into the infinite series would you like to go?");
        Scanner sc = new Scanner(System.in);
        howFar = sc.nextInt();
        double PICalced; 
        PICalced = Calculation.calculate(howFar);
        System.out.println("PI is " + PICalced + ".");
        
        PICalced = Calculation.calculate(howFar);
        System.out.println("\n\nWould you like to print a table of the first 200,000 terms? (Type 1 for yes, 2 for no)");
        Scanner sc2 = new Scanner(System.in);
        if(sc2.nextInt() == 1);
            makeTable();
    }
    /**
     * 
     */
    public static void makeTable()
    {  
        double PICalcedBig = Calculation.calculate(200000);
        
        for(int i = 0; i < 200000; i++)
        {
            System.out.println(Calculation.getAllNums().get(i));
        }
    }
    
}
