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
public class Competitor extends Person
{
    private int level; // aka division
    //PT -- might be better to save this separately from a Competitor. It's not the competitor's job to keep track
    //   of this information; it's the tournament manager's job
    ArrayList<Integer> judgesIDHad = new ArrayList <>();
    ArrayList<Integer> comeptitorsIDHad = new ArrayList <>();

    /**
     * 
     */
    Competitor()
    {
        
    }
/**
 * 
 * @param firstName
 * @param lastName
 * @param school
 * @param level 
 */
    Competitor(String firstName, String lastName, String school, int level, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.level = level;
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    public int getLevel()
    {
        return level;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Integer> getPrevJudges()
    {
        return judgesIDHad;
    }
    /**
     * 
     * @param level 
     */
    public void setLevel(int level)
    {
        this.level = level;
    }
    /**
     * 
     * @param newJudge 
     */
    public void addJudge(Judge newJudge)
    {
        judgesIDHad.add(newJudge.getId());
    }
    
    /**
     * 
     * @return 
     */
    public String toString()
    {
        return String.format("%s; %s; %s; %d; %d", lastName, firstName, school, level, id);
    }
}
