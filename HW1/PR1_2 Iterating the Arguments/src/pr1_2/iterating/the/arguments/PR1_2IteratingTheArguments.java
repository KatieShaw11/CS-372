
// HW 1: PR1_2, PR1_3: 2.7
// KATIE SHAW
// Due 1/6/2014

/* Write a program that prints three arguments taken from the command line. 
   To do this, you’ll need to index into the command-line array of Strings. */
package pr1_2.iterating.the.arguments;
import java.util.Scanner;

/**
 * 
 * @author kshaw
 */

public class PR1_2IteratingTheArguments 
{
    /**
     * 
     * @param args 
     */

    public static void main(String[] args) 
    {
        for (int i = 0; i < 3; i++)
        {
            if (args.length > 0)
            {
              System.out.println(args[i]);
            }
        }
    }
    
}
