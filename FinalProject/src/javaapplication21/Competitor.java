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
public class Competitor 
{
    private String name;
    private String firstName;
    private String lastName;
    private String school;
    private int level;
    private int id;
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
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @return 
     */
    public String getSchool()
    {
        return school;
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
     * @return 
     */
    public int getId()
    {
        return id;
    }
    
    //modifiers
    
    /**
     * 
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    public void setFirstName(String name)
    {
        firstName = name;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    /**
     * 
     * @param school 
     */
    public void setSchool(String school)
    {
        this.school = school;
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
        judgesIDHad.add(newJudge.getID());
    }
    /**
     * 
     * @param ID 
     */
    public void setId(int ID)
    {
        id = ID;
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
