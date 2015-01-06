
// HW 1: PR1_6: 3.9
// KATIE SHAW
// Due 1/6/2014

/* Write a program that uses two nested for loops and the modulus operator (%) 
   to detect and print prime numbers (integral numbers that are not evenly divisible 
   by any other numbers except for themselves and 1). */

package pr1_6.prime.numbers;
import java.util.*;
import java.lang.Math;

/**
 * 
 * @author kshaw
 */

public class PR1_6PrimeNumbers 
{
    /**
     * 
     * @param args 
     */
    
    public static void main(String[] args) 
    {
        for (int i = 0; i < 101; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i%j != 0) // Still not prime (based on current test)
                {
                    if (j == (i-1)) // gone through all the numbers w/o breaking; is prime
                    {
                        System.out.println("***The number " + i + " IS prime!\n");
                    }
                    continue;
                }
                
                else // it's divisible by a number
                {
                    System.out.println("The number " + i + " is not prime.\n");
                    break;
                }
            }
            
        }
    }
    
}