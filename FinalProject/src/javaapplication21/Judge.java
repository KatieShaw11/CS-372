package javaapplication21;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katidid
 */
public class Judge 
{
    private String firstname;
    private String lastname;
    private String name = firstname + " " + lastname;
    private String school;
    /**
     * 
     * @param Name
     * @param School 
     */
    Judge(String Name, String School)
    {
        name = Name;
        school = School;
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
    public String getFirstname()
    {
        return firstname;
    }
    /**
     * 
     * @return 
     */
    public String getLastname()
    {
        return lastname;
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
     * @param name 
     */
    public void setFirstname(String name)
    {
        firstname = name;
    }
    /**
     * 
     * @param name 
     */
    public void setLastname(String name)
    {
        lastname = name;
    }
    /**
     * 
     * @param school 
     */
    public void setSchool(String school)
    {
        this.school = school;
    }
}
