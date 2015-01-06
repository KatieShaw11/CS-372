
// HW 1: PR1_4: Area of a Circle
// KATIE SHAW
// Due 1/6/2014

package pr1_4.area.of.a.circle;
import java.util.Scanner;
import java.util.*;

/**
 * 
 * @author kshaw
 */

public class PR1_4AreaOfACircle 
{
    /**
     * 
     * @param args 
     */
    
    public static void main(String[] args)
    {
        final double PI = 3.14;
        
        Scanner user_input = new Scanner( System.in );
        String radius;
        double radiusNum;
        double area;
        
        System.out.println("What is the radius of your circle?");
        radius = user_input.next();
        radiusNum = Integer.parseInt(radius);
        area = PI*radiusNum*radiusNum;
        System.out.print("Area is ");
        System.out.println(area);
        
    }
    
}
