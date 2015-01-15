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
    /**
     * 
     */
    public Bet()
    {
        amount = 0;
        forWhichOutcome = 0;
    }
    /**
     * 
     * @param amount
     * @param forWO 
     */
    public Bet(int amount, int forWO)
    {
        this.amount = amount;
        forWhichOutcome = forWO;
    }
    /**
     * 
     * @return 
     */
    public int getAmount()
    {
        return amount;
    }
    /**
     * 
     * @return 
     */
    public int getBetOutcome()
    {
        return forWhichOutcome;
    }
    /**
     * 
     * @param num
     * @throws IllegalArgumentException 
     */
    public void setBetOutcome(int num) throws IllegalArgumentException
    {
        if (num < 1 || num > 3)
            throw new IllegalArgumentException ("Enter 1, 2, or 3, please.");
        if (num == 1)
            forWhichOutcome = 6;
        else if (num == 2)
            forWhichOutcome = 8;
        else
            forWhichOutcome = 7;
    }
}
