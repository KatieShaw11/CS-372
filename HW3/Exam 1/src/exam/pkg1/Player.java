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
    
    public Player()
    {
        loginName = "defaultName";
        currentMoney = 0;
    }
    public Player(String name) // the constuctor used for a brand new player
    {
        loginName = name;
        currentMoney = 500;
    }
    public Player(String name, int money)
    {
        loginName = name;
        currentMoney = money;
    }
    
    public void addBet(Bet newBet)
    {
        currentBet = newBet;
    }
    public Bet getBet()
    {
        return currentBet;
    }
    
    public void setAmount(int amount)
    {
        currentMoney = amount;
    }
    public int getAmount()
    {
        return currentMoney;
    }
            
}
