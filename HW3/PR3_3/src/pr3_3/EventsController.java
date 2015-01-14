/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author kshaw
 */
public class EventsController 
{
    
    private static ArrayList<Event> eventList= new ArrayList <Event>();
    
    public static void outputToFile(Event newEvent, FileWriter writer)
    {
        try
        {
            writer.write(newEvent.toString() + "\n");
        }
        catch(IOException ex)
        {
            System.out.println("Didn't output.");
        }
    }
    
    public static void addEvent(Event newEvent)
    {
        eventList.add(newEvent);
    }
    
    public static int getNumEvents()
    {
        return eventList.size();
    }
    
    public static Event getEvent(int i)
    {
        return eventList.get(i);
    }
    
}
