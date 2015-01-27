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
     * @param name
     * @param school
     * @param level 
     */
    Competitor(String firstName, String lastName, String school, int level)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.level = level;
    }
    
    //accessors

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
