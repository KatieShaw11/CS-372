/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author katidid
 */
public class TourneyController 
{
    ArrayList<Competitor> competitorList= new ArrayList <>();
    ArrayList<Judge> judgeList= new ArrayList <>();
    
    public int getNumComps()
    {
        return competitorList.size();
    }
    
    public Competitor getStu(int i)
    {
        return competitorList.get(i);
    }
    
    public void addStu(Competitor comp)
    {
        competitorList.add(comp);
    }
    
//    public static void outputToFile(Object<?> newEvent, FileWriter writer)
//    {
//        try
//        {
//            writer.write(newEvent.toString() + "\n");
//        }
//        catch(IOException ex)
//        {
//            System.out.println("Didn't output.");
//        }
//    }
}
