/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.pkg1;

/**
 *
 * @author kshaw
 */
public class Bet 
{
    private int amount;
    private int forWhichOutcome; // 6: <7; 8: >7; 7: =7
    
    public Bet()
    {
        amount = 0;
        forWhichOutcome = 0;
    }
    
    public Bet(int amount, int forWO)
    {
        this.amount = amount;
        forWhichOutcome = forWO;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public int getBetOutcome()
    {
        return forWhichOutcome;
    }
}
