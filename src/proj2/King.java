package proj2;

/**
 * @author Robyn Bernard CIS 2151
 */
public class King extends NPC {

    public King(int weight, int height) {
        super(weight, height);
    }//end ctor

    @Override
    public void speak() {
        System.out.println("Hello, traveler! Welcome to my Kindgom! ");

    }//end speak

}//end king
