/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author katidid
 */
public class Competitor 
{
    private String name;
    private String school;
    private int level;
    
    Competitor(String name, String school, int level)
    {
        this.name = name;
        this.school = school;
        this.level = level;
    }
    
    //accessors
    
    public String getName()
    {
        return name;
    }
    public String getSchool()
    {
        return school;
    }
    public int getLevel()
    {
        return level;
    }
    
    //modifiers
    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }
    
    
    
    public String toString()
    {
        return String.format("%s; %s; %d", name, school, level);
    }
}
