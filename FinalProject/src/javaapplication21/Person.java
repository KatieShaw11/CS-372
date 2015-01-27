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
public class Person 
{
    protected String name;
    protected String firstName;
    protected String lastName;
    protected String school;
    protected int id;

    /**
     * 
     */
    Person()
    {
        
    }
    /**
     * 
     * @param name
     * @param school
     * @param level 
     */
    Person(String firstName, String lastName, String school, int level)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }
    
    //accessors
    /**
     * 
     * @return 
     */
    public String getName()
    {
        name = firstName + " " + lastName;
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
     * @param name 
     */
    public void setFirstName(String name)
    {
        firstName = name;
    }
    /**
     * 
     * @param name 
     */
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
     * @param ID 
     */
    public void setId(int ID)
    {
        id = ID;
    }
    
}
