
package javaapplication21;

/**
 *
 * @author katidid
 */
public class School 
{
    private String name;
    private int id;
    
    /**
     * 
     */
    public School()
    {
    }
    /**
     * 
     * @param name
     * @param id 
     */
    public School(String name, int id)
    {
        this.name = name;
        this.id = id;
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
    public int getId()
    {
        return id;
    }
    /**
     * 
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * 
     * @param id 
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * 
     * @return 
     */
    public String toString()
    {
        return String.format("%s; %d", name, id);
    }
}
