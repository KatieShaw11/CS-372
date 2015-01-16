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
public class Ellipse extends Shape
{
    private int r1;
    private int r2;
    
    /**
     * 
     * @param r1
     * @param r2 
     */
    public Ellipse(int r1, int r2)
    {
        this.r1 = r1;
        this.r2 = r2;
    }
}
