/*
Write a GUI program that manages an event calendar. It should allow the user to 
input new events, with name, location, month, date, and year. New events should 
be stored in a text file. When the program starts up, it should read from that 
text file and list all events by date. It should also allow the user to sort 
the displayed events on name and location. Use exception handling to ensure that
dates input from the user are legal.
 */
package pr3_3;

/**
 *
 * @author kshaw
 */
public class Event 
{
    private String name, location, month;
    private int date, year;
    
    public Event (String Name, String Loc, String Month, int Date, int Year)
    {
        name = Name;
        location = Loc;
        month = Month;
        date = Date;
        year = Year;
    }
}
