/*
PR3_2: Shape Class Hierarchy

Create classes for Shape, Triangle, Rectangle, and Ellipse. Shape is defined as 
follows:

public class Shape {
	public double getArea() {return 0;}
	public double getPerimeter() {return 0;}
}

Triangle, Rectangle, and Ellipse should inherit from Shape. The constructors 
should be defined as follows:

public Rectangle(int width, int height)
public Ellipse(int r1, int r2)
public Triangle(int s1, int s2, int s3)

Use exception handling to make sure the arguments for any functions you 
implement are legal (e.g. lengths should be greater than or equal to 0). 
Beware, the Triangle sides have specific rules that should be obeyed! 
Mark the constructors as “throwing” functions. Override the Shape functions 
for each class. Override methods from Object as appropriate.
 */
package pr3_2.shape.pkgclass;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kshaw
 */
public class PR3_2ShapeClass {

    
    public static void TriangleConstuctor()
    {
        while (true)
        {
            Triangle triangle1;
            System.out.println("Please enter the three sides of your new triangle, separated by returns. Integers only.");
            int a, b, c;
            try
            {
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.printf("a: %d; b: %d, c: %d\n", a, b, c);
                
                try
                {
                    triangle1 = new Triangle(a, b, c);
                }
                catch(InvalidGeometryException ex)
                {
                    System.out.println(ex.getMessage()); // "The longest side is too long."
                    
                }
                
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid entry. Please start again, integers this time.");
            }
            break;
        }
    }
    
    /**
     * 
     */
    public static void EllipseConstructor()
    {
        while (true)
        {
            Ellipse ellipse1;
            System.out.println("Please enter the two radii of the ellipse, integers only.");
            int a, b;
            try
            {
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.printf("a: %d; b: %d\n", a, b);
                ellipse1 = new Ellipse(a, b);   
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid entry. Please start again, integers this time.");
            }
            break;
        }
    }
    /**
     *
     */
    public static void RectangleConstructor()
    {
        while (true)
        {
            Rectangle rec1;
            System.out.println("Please enter the two side of the rectangle, integers only.");
            int a, b;
            try
            {
                Scanner sc = new Scanner(System.in);
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.printf("a: %d; b: %d\n", a, b);
                rec1 = new Rectangle(a, b);   
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid entry. Please start again, integers this time.");
            }
            break;
        }
    }
    
    public static void continueQuestion()
    {
        System.out.println("Would you like to continue and create the next shape? y/n");
        Scanner sc1 = new Scanner(System.in);
        String answer = sc1.next();
        if (answer == "n" || answer == "N")
            System.exit(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        while(true)
        {
            TriangleConstuctor();
            System.out.println("Triangle constructed. Well done.\n");
            continueQuestion();
            
            RectangleConstructor();
            System.out.println("Rectangle constructed. Well done.\n");
            continueQuestion();
            
            EllipseConstructor();
            System.out.println("Ellipse constructed. Well done.\n");
            continueQuestion();
        }
    }
    
    
    
}
