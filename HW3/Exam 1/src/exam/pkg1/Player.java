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
public class Player 
{
    private String loginName;
    private int currentMoney;
    private Bet currentBet;
    /**
     * 
     */
    public Player()
    {
        loginName = "defaultName";
        currentMoney = 0;
    }
    /**
     * 
     * @param name 
     */
    public Player(String name) // the constuctor used for a brand new player
    {
        loginName = name;
        currentMoney = 500;
    }
    /**
     * 
     * @param name
     * @param money 
     */
    public Player(String name, int money)
    {
        loginName = name;
        currentMoney = money;
    }
    /**
     * 
     * @param newBet 
     */
    public void addBet(Bet newBet)
    {
        currentBet = newBet;
    }
    /**
     * 
     * @return 
     */
    public Bet getBet()
    {
        return currentBet;
    }
    /**
     * 
     * @param amount 
     */
    public void setAmount(int amount)
    {
        currentMoney = amount;
    }
    /**
     * 
     * @return 
     */
    public int getAmount()
    {
        return currentMoney;
    }
    /**
     * 
     * @return 
     */
    public String getName()
    {
        return loginName;
    }
    /**
     * 
     * @param DiRoll
     * @return 
     */
    boolean won(int DiRoll) // acts as a boolean but with three options
    {
        if (DiRoll < 7 && currentBet.getBetOutcome() < 7
                || DiRoll > 7 && currentBet.getBetOutcome() > 7
                || DiRoll == 7 && currentBet.getBetOutcome() == 7) // if won
        {
            return true;
        }
        else
        {
           return false;
        }

    }
            
}
