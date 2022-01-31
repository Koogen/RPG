package proj2;

/**
 * @author Robyn Bernard CIS 2151
 */
public class Bartender extends NPC {

   public Bartender(int weight, int height) {
        super(weight, height);
    }//end ctor

    @Override
    public void speak() {
        System.out.println("What'll ya have, mate? ");
    }//end speak    
    
}//end bartneder
