/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2.shape.pkgclass;

/**
 *
 * @author kshaw
 */
public class Triangle extends Shape 
{
    private int a, b, c;
    
    public Triangle(int s1, int s2, int s3) throws InvalidGeometryException
    {
        if(s1>s2 && s1>s3)
        {
            c = s1; a = s2; b = s3;
        }
        else if (s2>s1 && s2>s3)
        {
            c = s2; a = s1; b = s3;
        }
        else
        {
            c = s3; a = s1; b = s2;
        }
        
        if ((a+b) >= c)
        {
            throw new InvalidGeometryException("The longest side is too long.");
        }
    }    
}
