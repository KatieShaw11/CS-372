
package pr2_1;
import java.util.*;

/**
 *
 * @author kshaw
 */
public class Gerbil 
{
    private int gerbilNumber;
    
    /**
     * 
     * @param num 
     */
    
    public Gerbil(int num)
    {
        gerbilNumber = num;
    }
    
    /**
     * 
     * @return 
     */
    
    public int getGerbNum()
    {
        return gerbilNumber;
    }
    
    /**
     * 
     * @param num 
     */
    
    public void setGerbNum(int num)
    {
        gerbilNumber = num;
    }

    /**
     * 
     */
    public void hop()
    {
        System.out.printf("Gerbil number %d is hopping.\n", gerbilNumber);
    }
}
