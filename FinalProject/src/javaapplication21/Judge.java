package javaapplication21;


/**
 *
 * @author katidid
 */
public class Judge extends Person
{
    /**
     * 
     */
    Judge()
    {
    }
    /**
     * 
     * @param Name
     * @param lastName
     * @param School
     * @param id 
     */
    Judge(String Name, String lastName, String School, int id)
    {
        firstName = Name;
        this.lastName = lastName;
        school = School;
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String toString()
    {
        return String.format("%s; %s; %s; %d", firstName, lastName, school, id);
    }
}
