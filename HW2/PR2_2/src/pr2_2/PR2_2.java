/*
Modify Exercise 2 so you use an Iterator to move through the List while calling 
hop( ).
 */
package pr2_2;
import java.util.ArrayList;
import pr2_1.Gerbil; // need project 1 for this project
import java.util.Iterator;
/**
 *
 * @author kshaw
 */
public class PR2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Gerbil> listOfGerbs = new ArrayList<Gerbil>();
        
        for (int i = 0; i < 10; i++)
        {
            Gerbil gerb = new Gerbil(i);
            listOfGerbs.add(i, gerb);
        }
        
        for (Iterator<Gerbil> iter = listOfGerbs.iterator(); iter.hasNext(); ) 
        {
            Gerbil element = iter.next();
            element.hop();
        }
    }
}
