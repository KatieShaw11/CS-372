/*
Write a console program that asks the user for 10 integers, then outputs the 
max, min, and average. Use Exception Handling to handle the case where the user 
doesn’t pass in an integer value (for Scanner.nextInt()).
 */
package pr3_1;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author kshaw
 */
public class GatherInts 
{
    private ArrayList<Integer> integerList = new ArrayList<Integer>();
    /**
     * 
     */
    public GatherInts()
    {
        
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Integer> getIntList()
    {

        return integerList;       
    }
    /**
     * 
     * @param str
     * @return
     * @throws IllegalArgumentException 
     */
    public int parseTheInt(String str) throws IllegalArgumentException
    {
        int value = 0;
        if (str.isEmpty())
        {
            throw new IllegalArgumentException("Empty text is not legal");
        }
        try
        {
            value = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        return value;
        
    }
    /**
     * 
     * @param newInt
     * @throws IllegalArgumentException 
     */
    public void addInt(int newInt) throws IllegalArgumentException
    {
        if (newInt == -1)
        {
            throw new IllegalArgumentException("-1 is not legal");
        }
        integerList.add(newInt);
        
    }
    /**
     * 
     * @param i
     * @return 
     */
    public int getOneInt(int i) 
    { 
        return integerList.get(i); 
    }
    /**
     * 
     * @return 
     */
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
    /**
     * 
     * @return 
     */
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
    /**
     * 
     * @return 
     */
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
