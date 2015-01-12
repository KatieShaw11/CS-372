/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;

import java.util.ArrayList;
import pr2_7.Cookie.*;

/**
 *
 * @author kshaw
 */
public class Transaction 
{
    private static ArrayList<Cookie> cookiesSold = new ArrayList<Cookie>();
    /**
     * 
     */
    public static void buyThinMint()
    {
        Cookie newCook = new Cookie("Thin Mint");
        cookiesSold.add(newCook);
    }
    /**
     * 
     */
    public static void buySamoa()
    {
        Cookie newCook = new Cookie("Samoa");
        cookiesSold.add(newCook);
    }
    /**
     * 
     */
    public static void buyChocChip()
    {
        Cookie newCook = new Cookie("Chocolate Chip");
        cookiesSold.add(newCook);
    }
    /**
     * 
     * @return 
     */
    public static int getThinCash()
    {
        int thinCash = 0;
        for (int i = 0; i < cookiesSold.size(); i++)
        {
            if (cookiesSold.get(i).getType() == "Thin Mint")
                thinCash += 3;
        }
        
        return thinCash;
    }
    /**
    * 
    * @return 
    */
    public static int getSamoaCash()
    {
        int samCash = 0;
        for (int i = 0; i < cookiesSold.size(); i++)
        {
            if (cookiesSold.get(i).getType() == "Samoa")
                samCash += 4;
        }
        
        return samCash;
    }
    /**
     * 
     * @return 
     */
    public static int getChocCash()
    {
        int chocCash = 0;
        for (int i = 0; i < cookiesSold.size(); i++)
        {
            if (cookiesSold.get(i).getType() == "Chocolate Chip")
                chocCash += 5;
        }
        
        return chocCash;
    }

}
