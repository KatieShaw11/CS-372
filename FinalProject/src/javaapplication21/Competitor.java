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
    private String school;
    private int level;
    private int id;
    ArrayList<Judge> judgesHad = new ArrayList <Judge>();
    
    /**
     * 
     * @param name
     * @param school
     * @param level 
     */
    Competitor(String name, String school, int level)
    {
        this.name = name;
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
    public ArrayList<Judge> getPrevJudges()
    {
        return judgesHad;
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
        judgesHad.add(newJudge);
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
        return String.format("%s; %s; %d", name, school, level);
    }
}
