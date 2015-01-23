/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author katidid
 */
public class TourneyController 
{
    ArrayList<Competitor> competitorList= new ArrayList <>();
    ArrayList<Judge> judgeList= new ArrayList <>();
    ArrayList<Tournament> tournamentList = new ArrayList<>();
    
    public int getNumComps()
    {
        return competitorList.size();
    }
    
    public int getNumJudges()
    {
        return judgeList.size();
    }
    
    public Competitor getCompetitor(int i)
    {
        return competitorList.get(i);
    }
    
    public Judge getJudge(int i)
    {
        return judgeList.get(i);
    }
    
    public ArrayList<Competitor> getCompetitorList()
    {
        return competitorList;
    }
    public ArrayList<Judge> getJudgeList()
    {
        return judgeList;
    }
    
    public void addStu(Competitor comp)
    {
        competitorList.add(comp);
    }
    public void addJudge(Judge j)
    {
        judgeList.add(j);
    }
    
//    public static void outputToFile(Object<?> newEvent, FileWriter writer)
//    {
//        try
//        {
//            writer.write(newEvent.toString() + "\n");
//        }
//        catch(IOException ex)
//        {
//            System.out.println("Didn't output.");
//        }
//    }
}
