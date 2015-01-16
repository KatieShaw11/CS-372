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
    private String name, location;
    private int date, year, month;
    
    /**
     * 
     * @param Name
     * @param Loc
     * @param Month
     * @param Date
     * @param Year 
     */
    
    public Event()
    {
        name = "";
        location = "";
        month = 0;
        date = 0;
        year = 0;             
    }
    /**
     * 
     * @param Name
     * @param Loc
     * @param Month
     * @param Date
     * @param Year 
     */
    public Event (String Name, String Loc, int Month, int Date, int Year)
    {
        name = Name;
        location = Loc;
        month = Month;
        date = Date;
        year = Year;
    }
    
    /**
     * 
     * @param Name 
     */
    public Event (String Name)
    {
        name = Name;
        location = "default";
        month = 0;
        date = 0;
        year = 0;
    }
    // Accessors:
    
    /**
     * 
     * @return 
     */
    public int getYear()
    {
        return year;
    }
    /**
     * 
     * @return 
     */
    public int getMonth()
    {
        return month;
    }
    /**
     * 
     * @return 
     */
    public int getDate()
    {
        return date;
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
    public String getLocation()
    {
        return location;
    }
    
    // Modifiers:
    
    /**
     * 
     * @param Year 
     */
    public void setYear(int Year)
    {
        year = Year;
    }
    /**
     * 
     * @param Mon 
     */
    public void setMonth(int Mon)
    {
        month = Mon;
    }
    /**
     * 
     * @param Date 
     */
    public void setDate(int Date)
    {
        date = Date;
    }
    /**
     * 
     * @param Name 
     */
    public void setName(String Name)
    {
        name = Name;
    }
    /**
     * 
     * @param Loc 
     */
    public void setLocation(String Loc)
    {
        location = Loc;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString()
    {
        return String.format("%s at %s on %d/%d/%d", name, location, month, date, year);
    }
    
    public int compareYears(Event comparestu) 
    {
        int compareYear=((Event)comparestu).getYear();
        /* For Ascending order*/
        return this.year-compareYear;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
 
}
