package proj2;

import java.util.ArrayList;

/**
 * @author Robyn Bernard CIS 2151
 */
public class RPGDemo {

    static ArrayList<NPC> arrayOfNPC = new ArrayList<>();

    public static void main(String[] args) {
        
        createNPC();
        printArrayOfNPC();

 
    }//end main

    public static int rng(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }//end getRandomHeight

    public static int getRandomWeight(int minWeight, int maxWeight) {
        return (int) ((Math.random() * (maxWeight - minWeight)) + minWeight);
    }//end getRandomWeight

    public static int getRandomHeight(int minHeight, int maxHeight) {
        return (int) ((Math.random() * (maxHeight - minHeight)) + minHeight);
    }//end getRandomHeight

    public static void createNPC() {
        while (arrayOfNPC.size() <= 100) {
            switch (rng(1, 5)) {
                case 1:
                    arrayOfNPC.add(new King(getRandomWeight(160,250), getRandomHeight(100,180)));
                    break;
                case 2:
                    arrayOfNPC.add(new Queen(getRandomWeight(100,180), getRandomHeight(90,150)));
                    break;
                case 3:
                    arrayOfNPC.add(new Guard(getRandomWeight(108,270), getRandomHeight(150,300)));
                    break;
                case 4:
                    arrayOfNPC.add(new Bartender(getRandomWeight(100,300), getRandomHeight(150,200)));
                    break;
                default:

            }//end switch
        }//end while loop
    }//end createNPC 

    public static void printArrayOfNPC() {
        for (int counter = 0; counter < arrayOfNPC.size(); counter++) {
            arrayOfNPC.get(counter).speak();
        }//end for loop
    }//end printArrayOfNPC

}//end RPGDemo
