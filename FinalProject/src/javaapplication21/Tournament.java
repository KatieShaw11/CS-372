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

    
    public Tournament()
    {
        
    }
    
    public Tournament(String N, String L)
    {
        name = N;
        location = L;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public int getID()
    {
        return id;
    }
    
    public ArrayList<Competitor> getTournamentCompetitors()
    {
        return TournamentCompetitors;
    }
    public ArrayList<Judge> getTournamentJudges()
    {
        return TournamentJudges;
    }
    
    public void setName(String N)
    {
        name = N;
    }
    
    public void setLocation(String L)
    {
        location = L;
    }
    
    public void setID(int id)
    {
        this.id = id;
    }
    public void addJudge(Judge newJ)
    {
        TournamentJudges.add(newJ);
    }
    public void addCompetitor(Competitor newC)
    {
        TournamentCompetitors.add(newC);
    }
}
