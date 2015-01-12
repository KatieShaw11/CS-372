/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_7;
import java.util.*;
import pr2_7.*;

/**
 *
 * @author kshaw
 */
public class Cookie 
{
    private String type;
    
    
    public Cookie(String Type)  
    { 
        type = Type;
    }
    
    public int getPrice()
    {
        if (type == "Samoa")
        {
            return 4;
        }
        else if (type == "Thin Mint")
        {
            return 3;
        }
        else if (type == "Chocolate Chip")
        {
            return 5;
        }
        else
        {
            return 0;
        }
    }
}
