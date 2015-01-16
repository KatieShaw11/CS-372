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
public class EventDateComparator implements Comparator<Event>
{
    @Override
    public int compare(Event e1, Event e2) 
    {
        int c = e1.getYear() - e2.getYear();
        if (c==0)
        {
            c = e1.getMonth() - e2.getMonth();
            if (c == 0)
            {
                c = e1.getDate() - e2.getDate();
            }
        }
        return c;
    }
}
