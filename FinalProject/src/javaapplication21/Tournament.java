/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.ArrayList;

/**
 *
 * @author katidid
 */
public class Tournament 
{
    private String name;
    private String location;
    private int id;
    private ArrayList<Competitor> TournamentCompetitors = new ArrayList <>();
    private ArrayList<Judge> TournamentJudges = new ArrayList <>();

    /**
     * 
     */
    public Tournament()
    {
        
    }
    /**
     * 
     * @param N
     * @param L 
     */
    public Tournament(String N, String L)
    {
        name = N;
        location = L;
    }
    /**
     * 
     * @return 
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @return 
     */
    public String getLocation()
    {
        return location;
    }
    /**
     * 
     * @return 
     */
    public int getID()
    {
        return id;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Competitor> getTournamentCompetitors()
    {
        return TournamentCompetitors;
    }
    public ArrayList<Judge> getTournamentJudges()
    {
        return TournamentJudges;
    }
    /**
     * 
     * @param N 
     */
    public void setName(String N)
    {
        name = N;
    }
    /**
     * 
     * @param L 
     */
    public void setLocation(String L)
    {
        location = L;
    }
    /**
     * 
     * @param id 
     */
    public void setID(int id)
    {
        this.id = id;
    }
    /**
     * 
     * @param newJ 
     */
    public void addJudge(Judge newJ)
    {
        TournamentJudges.add(newJ);
    }
    /**
     * 
     * @param newC 
     */
    public void addCompetitor(Competitor newC)
    {
        TournamentCompetitors.add(newC);
    }
}
