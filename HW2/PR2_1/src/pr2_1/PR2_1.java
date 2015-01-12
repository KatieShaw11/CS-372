

/*Eckel problem 11.2:
Create a new class called Gerbil with an int gerbilNumber that’s initialized in 
the constructor (similar to the Mouse example in this chapter). Give it a method
called hop( ) that prints out which gerbil number this is, and that it’s hopping.
Create an ArrayList and add a bunch of Gerbil objects to the List. 
Now use the get( ) method to move through the List and call hop( ) for each 
Gerbil.
*/
package pr2_1;
import pr2_1.Gerbil.*;
import java.util.ArrayList;

/**
 *
 * @author kshaw
 */
public class PR2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gerbil> listOfGerbs = new ArrayList<Gerbil>();
        
        for (int i = 0; i < 10; i++)
        {
            Gerbil gerb = new Gerbil(i);
            listOfGerbs.add(i, gerb);
        }
        
        for (int i = 0; i < listOfGerbs.size(); i++)
        {
            listOfGerbs.get(i).hop();
        }
        
    }
    
}
