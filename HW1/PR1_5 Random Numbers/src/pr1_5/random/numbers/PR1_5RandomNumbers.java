
// HW 1: 3.7
// KATIE SHAW
// Due 1/6/2014

//Write a program that generates 25 random int values. For each value, use an if-else statement to classify it as greater than, less than, or equal to a second randomly-generated value. Feedback

package pr1_5.random.numbers;
import java.util.*;
import java.util.Random;


public class PR1_5RandomNumbers 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int num;
        for (int i = 0; i < 25; i++)
        {
            num = rand.nextInt(100);   // ????
            System.out.println(num);
        }
    }
    
}
