
package proj2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Robyn Bernard
 * CIS 2151
 */
public abstract class NPC {
    Random rng = new Random();
       int weight;
       int height; 
             
    public NPC (int weight, int height){ 
           this.weight = weight;
           this.height = height;
       }//end ctor
      
    public abstract void speak();
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}//end NPC
