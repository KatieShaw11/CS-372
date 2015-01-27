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
    /**
     * 
     * @return 
     */
    public int getNumComps()
    {
        return competitorList.size();
    }
    /**
     * 
     * @return 
     */
    public int getNumJudges()
    {
        return judgeList.size();
    }
    /**
     * 
     * @param i
     * @return 
     */
    public Competitor getCompetitor(int i)
    {
        return competitorList.get(i);
    }
    /**
     * 
     * @param i
     * @return 
     */
    public Judge getJudge(int i)
    {
        return judgeList.get(i);
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Competitor> getCompetitorList()
    {
        return competitorList;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Judge> getJudgeList()
    {
        return judgeList;
    }
    /**
     * 
     * @param comp 
     */
    public void addStu(Competitor comp)
    {
        competitorList.add(comp);
    }
    /**
     * 
     * @param j 
     */
    public void addJudge(Judge j)
    {
        judgeList.add(j);
    }
    // Possibly implement eventually to cut down on repetitive code?
    
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
