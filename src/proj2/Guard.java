package proj2;

/**
 * @author Robyn Bernard CIS 2151
 */
public class Guard extends NPC {

   public Guard(int weight, int height) {
        super(weight, height);
    }//end ctor

    @Override
    public void speak() {
        System.out.println("Any friend of the kingdom is a friend on mine! ");
    }//end speak
    
}//end guard
