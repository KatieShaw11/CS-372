/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import java.util.Comparator;

/**
 *
 * @author kshaw
 */
public class EventNameComparator implements Comparator<Event>
{
    /**
     * 
     * @param e1
     * @param e2
     * @return 
     */
    @Override
    public int compare(Event e1, Event e2) 
    {
        return e1.toString().compareTo(e2.toString());
    }
}