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
public class Rectangle extends Shape 
{
    private int width;
    private int height;
    
    /**
     * 
     * @param width
     * @param height 
     */
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
}
