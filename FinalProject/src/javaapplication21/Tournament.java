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
public class Tournament 
{
    private String name;
    private String location;
    private int id;
    
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
}
