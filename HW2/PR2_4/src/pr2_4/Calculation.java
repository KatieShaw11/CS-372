
//π = 4 – 4/3 + 4/5 – 4/7 + 4/9 – 4/11 + … 

package pr2_4;
import java.math.*;
import java.util.*;

/**
 *
 * @author kshaw
 */
public class Calculation 
{
    private static ArrayList<String> numByNum = new ArrayList<String>();;
    /**
     * 
     * @param numPlaces
     * @return 
     */
    public static double calculate(int numPlaces)
    {
        double PInum = 4.0;
        int denominator = 3;
        boolean operatorSwitch=true; //true is minus; false is plus
        
        
        for (int i = 0; i < numPlaces; i++)
        {
            if(operatorSwitch == true) // then subtract
            {
                PInum = PInum - (4.0/denominator);
                //System.out.println(PInum + " with " + i+1 + " additions.");
                numByNum.add("Number " + i + ": " + PInum);
                denominator += 2;
                operatorSwitch = false;
            }
            else // then add
            {
                PInum = PInum + (4.0/denominator);
                //System.out.println(PInum + " with " + i+1 + " additions. (+)");
                numByNum.add("Number " + i + ": " + PInum);
                denominator += 2;
                operatorSwitch = true;
            }
        }
        return PInum;
    }
    /**
     * 
     * @return 
     */
    public static ArrayList<String> getAllNums()
    {
        return numByNum;
    }
        
}
