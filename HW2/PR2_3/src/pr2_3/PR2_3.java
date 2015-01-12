/*
Take the Gerbil class in Exercise 2 and put it into a Map instead, associating 
the name of the Gerbil as a String (the key) for each Gerbil (the value) you 
put in the table. Get an Iterator for the keySet( ) and use it to move through 
the Map, looking up the Gerbil for each key and printing out the key and 
telling the gerbil to hop( ).
 */
package pr2_3; // need project 1 for this
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import pr2_1.Gerbil;

/**
 *
 * @author kshaw
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Map<String, Gerbil> mapOfGerbs = new HashMap<String, Gerbil>();
        String[] names = {"Bill","Charlie","Percy", "Fred", "George", "Ron", "Ginny", "Harry", "Molly", "Arthur"};
        
        for (int i = 0; i < 10; i++) // Creating gerbils and giving them names
        {
            Gerbil gerb = new Gerbil(i);
            mapOfGerbs.put(names[i], gerb);
        }
        
        for (String key : mapOfGerbs.keySet()) // Iterating through the gerbils
        {
            //Gerbil element = iter.next();
            //element.hop();
            mapOfGerbs.get(key).hop();
            System.out.println("That one was " + key + ".");
            //System.out.println(key + "" + mapOfGerbs.get(key));
        }  
        
    }
    
}
