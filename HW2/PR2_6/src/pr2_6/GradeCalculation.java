/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;
import java.util.*;

/**
 *
 * @author katidid
 */
public class GradeCalculation 
{
    private ArrayList<Double> theGrades = new ArrayList();
    
    public GradeCalculation()
    {
        
    }
    
    public ArrayList<String> getGradeList()
    {
        ArrayList<String> stringGrades = new ArrayList();
        
        for (int i = 0; i < theGrades.size(); i++)
        {
          String newStringGrade = String.valueOf(theGrades.get(i));
          stringGrades.add(newStringGrade);
        }
        
        return stringGrades;       
    }
    
    public void addGrade(Double grade)
    {
        theGrades.add(grade);
    }
    
    public Double getGrade(int i) { return theGrades.get(i); }
    
    public  double calcAverage() // Using main, static
    {
        double average = 0;
        for (int i = 0; i < theGrades.size(); i++)
        {
            average += theGrades.get(i);
        }
        average = average/theGrades.size();
        
        return average;
        
    }
    
    public  double getMax() // Using main, static
    {
        double max = theGrades.indexOf(0);
        for (int i = 0; i < theGrades.size(); i++)
        {
            if (theGrades.get(i) > max)
                max = theGrades.get(i);
        }
        
        return max;
    }
    
    public double getMin() // Using main, static
    {
        double min = theGrades.get(0);
        for (int i = 0; i < theGrades.size(); i++)
        {
            if (theGrades.get(i) < min)
                min = theGrades.get(i);
        }
        
        return min;
    }
    

}
