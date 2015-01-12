/*
 Design a user interface that allows someone to enter homework scores one at a 
time, and displays a running min(), max(), and average(). The scores should be 
stored in a collection (e.g. List or Map), and calculations should be performed
in a separate class.
 */
package pr2_6;
import java.util.*;
import pr2_6.GradeCalculation;

/**
 *
 * @author kshaw
 */
public class PR2_6 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) 
    {
        ArrayList<Double> grades = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        int numGrades;
        System.out.println("How many grades have you?");
        numGrades = sc.nextInt();
        
        for (int i = 0; i < numGrades; i++)
        {
            System.out.println("Enter new grade: ");
            double newGrade = sc.nextDouble();
            grades.add(newGrade);   
        }
        
        System.out.println("\nHere are your grades:");
        for (int i = 0; i < grades.size(); i++)
        {
            System.out.println(grades.get(i));
        }
        
        System.out.println("\nCalculations:");
        //System.out.println("Average: " + GradeCalculation.calcAverage(grades));
        //System.out.println("Max score: " + GradeCalculation.getMax(grades));
        //System.out.println("Min score: " + GradeCalculation.getMin(grades));
    }
    
}
