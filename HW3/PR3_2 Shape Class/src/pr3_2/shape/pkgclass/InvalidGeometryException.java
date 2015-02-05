/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2.shape.pkgclass;

//PT -- Nicely done

/**
 *
 * @author kshaw
 */
public class InvalidGeometryException extends Exception
{
    /**
     * 
     */
    public InvalidGeometryException()
    {
        super("This is an invalid entry of some kind.");
    }
    /**
     * 
     * @param str 
     */
    public InvalidGeometryException(String str)
    {
        super(str);
    }
}