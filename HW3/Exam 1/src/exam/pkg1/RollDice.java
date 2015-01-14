/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.pkg1;

import java.util.Random;

/**
 *
 * @author katidid
 */
public class RollDice 
{
    private int di1;
    private int di2;
    
    public RollDice()
    {
        Random rand = new Random();
        di1 = rand.nextInt(6)+1;
        di2 = rand.nextInt(6)+1;
    }
    
    public int getDi1()
    {
        return di1;
    }
    public int getDi2()
    {
        return di2;
    }
    
}
