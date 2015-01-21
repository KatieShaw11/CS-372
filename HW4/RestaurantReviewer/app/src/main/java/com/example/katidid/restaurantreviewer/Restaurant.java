package com.example.katidid.restaurantreviewer;

/**
 * Created by katidid on 1/20/15.
 */
public class Restaurant
{
    private String name;
    private String address;
    private String notes;
    private int rating;

    /**
     *
     */
    Restaurant()
    {

    }

    /**
     *
     * @param Name
     * @param Address
     * @param Rating
     * @param Notes
     */
    Restaurant(String Name, String Address, int Rating, String Notes)
    {
        name = Name;
        address = Address;
        rating = Rating;
        notes = Notes;
    }

    // accessors

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
    public String getAddress()
    {
        return address;
    }

    /**
     *
     * @return
     */
    public String getNotes()
    {
        return notes;
    }

    /**
     *
     * @return
     */
    public int getRating()
    {
        return rating;
    }


    // modifiers

    public void setName(String Name)
    {
        name = Name;
    }

    public void setAddress(String Address)
    {
        address = Address;
    }

    public void setNotes(String Notes)
    {
        notes = Notes;
    }

    public void setRating(int Rating) throws IllegalAccessException
    {
        if (Rating > 5 || Rating < 1)
        {
            throw new IllegalArgumentException("Rate from 1 to 5");
        }
        else
            rating = Rating;
    }

    @Override
    public String toString()
    {
        return String.format("%s>%s>%s>%d", name, address, notes, rating);
    }
}
