/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;
import java.util.*;


/**
 *
 * @author kshaw
 */
public class GatherInts 
{
    private ArrayList<Integer> integerList = new ArrayList<Integer>();
    
    public GatherInts()
    {
        
    }
    
    public ArrayList<Integer> getIntList()
    {

        return integerList;       
    }
    
    public int parseTheInt(String str) throws IllegalArgumentException
    {
        if (str.isEmpty())
        {
            throw new IllegalArgumentException("Empty text is not legal");
        }
        
        int value = Integer.parseInt(str);
        return value;
        
    }
    
    public void addInt(int newInt) throws IllegalArgumentException
    {
        if (newInt == -1)
        {
            throw new IllegalArgumentException("-1 is not legal");
        }
        integerList.add(newInt);
        
    }
    
    public int getOneInt(int i) 
    { 
        return integerList.get(i); 
    }
    
    public double calcAverage() // Using main, static
    {
        double average = 0;
        for (int i = 0; i < integerList.size(); i++)
        {
            average += integerList.get(i);
        }
        average = average/integerList.size();
        
        return average;
        
    }
    
    public int getMax() // Using main, static
    {
        int max = integerList.indexOf(0);
        for (int i = 0; i < integerList.size(); i++)
        {
            if (integerList.get(i) > max)
                max = integerList.get(i);
        }
        
        return max;
    }
    
    public int getMin() // Using main, static
    {
        int min = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++)
        {
            if (integerList.get(i) < min)
                min = integerList.get(i);
        }
        
        return min;
    }
    

}
