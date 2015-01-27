/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static javaapplication21.TournamentSimulator.parseNewCompetitor;
import javax.swing.DefaultListModel;

/**
 *
 * @author katidid
 */
public class Round 
{
    private int comp1;
    private int comp2;
    private int roundNum;
    public Round()
    {
        
    }
    public Round (int comp1, int comp2, int roundNum)
    {
        this.comp1 = comp1;
        this.comp1 = comp1;
        this.roundNum = roundNum;
    }
    
    public void setC1(int c)
    {
        comp1 = c;
    }
    public void setC2(int c)
    {
        comp2 = c;
    }
    public void setRound(int r)
    {
        roundNum = r;
    }
    public int getRound()
    {
        return roundNum;
    }
    public String toString()
    {
        return String.format("%d; %d; %d;", comp1, comp2, roundNum);
    }
    
    private String findCompetitorName(int compNum)
    {
        File outFile = new File("/Users/katidid/desktop/COMPETITORS.txt");
        ArrayList<Competitor> eventList= new ArrayList <Competitor>();

        try (BufferedReader reader = new BufferedReader(new FileReader(outFile))) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) 
            {
                Competitor newCompetitor = parseNewCompetitor(line); 
            }
        } 
        catch (IOException x) 
        {
            System.err.format("IOException: %s%n", x);
        }
        
    }
}
