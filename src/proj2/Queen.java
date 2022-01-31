package proj2;

/**
 * @author Robyn Bernard CIS 2151
 */
public class Queen extends NPC {

   public Queen(int weight, int height) {
        super(weight, height);
    }//end ctor

    @Override    
    public void speak() {
         System.out.println("Welcome, friend of the realm! Speak with my husband the king! ");
    }//end speak

}//end queen
