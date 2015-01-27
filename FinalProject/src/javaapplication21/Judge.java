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
public class Judge extends Person
{
    
    Judge()
    {
    }
    /**
     * 
     * @param Name
     * @param School 
     */
    Judge(String Name, String lastName, String School, int id)
    {
        firstName = Name;
        this.lastName = lastName;
        school = School;
        this.id = id;
    }

    public String toString()
    {
        return String.format("%s; %s; %s; %d", firstName, lastName, school, id);
    }
}
