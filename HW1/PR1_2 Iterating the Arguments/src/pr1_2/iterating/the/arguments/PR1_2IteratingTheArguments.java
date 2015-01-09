
// HW 1: PR1_2, PR1_3: 2.7
// KATIE SHAW
// Due 1/6/2014

/* Write a program that prints three arguments taken from the command line. 
   To do this, you’ll need to index into the command-line array of Strings. */
package pr1_2.iterating.the.arguments;

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
       //PT: Actually you don't need this if statement. If args.length == 0, then you won't go into the for loop
        if (args.length > 0)
        {
            for (int i = 0; i < args.length; i++)
            {
              System.out.println("Arg: " + args[i]);
            }
        }
    }
    
}
