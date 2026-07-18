package at.campus02.bsd;

import java.util.*;

public class DrinkQueue{

    private List<Cocktail> cocktailQueue = new ArrayList<>();
    private final int maxSize = 5; // has to be final

    public DrinkQueue() {
    }

    public void setCocktailQueue(List<Cocktail> cocktailQueue) {
        this.cocktailQueue = cocktailQueue;
    }

    public List<Cocktail> getCocktailQueue(){ return cocktailQueue;}

    public void printOffer(){
        if(cocktailQueue.size()==0){
            System.out.println("No cocktails in the queue");
            return;
        }
        int count = 1;
        System.out.println("Cocktail queue:");
        for(Cocktail cocktail: cocktailQueue){
            System.out.println(count+": "+cocktail.getName());
            count++;
        }
        System.out.println();
    }



    public boolean offer(Cocktail cocktail) {
        if (cocktailQueue.size() != maxSize)
            cocktailQueue.add(cocktail);
        else
            return false;

        return true;
    }

    public Cocktail pull() { // corrected Pulls -> typo! (not anymore poll)
        if (cocktailQueue.isEmpty()) {
            return null;
        }

        return cocktailQueue.remove(0);
    }

    public Cocktail remove() {
        Cocktail element = pull();
        //element = ""; it actualizes it again
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

    public Cocktail peek() {
        Cocktail element;
        if (cocktailQueue.size() > 0)
            element = cocktailQueue.get(0);
        else
            element = null;

        return element;
    }

    public Cocktail element() {
        Cocktail element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }

}
