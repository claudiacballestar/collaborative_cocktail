package at.campus02.bsd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p> Console application to modify a queue of cocktails. There are some predefined
 * Drinks -> Liquid -> List of Liquid -> Cocktail
 * - show current cocktails
 * - add a cocktail
 * - remove a cocktail
 * - show next cocktail in the queue
 * </p>
 */
public class Main {

    /**
     * Constant scanner to be used by the user throw console
     */
    public static final Scanner SCANNER = new Scanner(System.in);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Liquid coffee = new Liquid("Coffee", 0.05, 0);
        Liquid vodka = new Liquid("Vodka", 0.25, 0.37);
        Liquid orangeJuice = new Liquid("Orange Juice", 0.1, 0);
        Liquid whiteWine = new Liquid("White Whine", 0.4, 0.10);
        Liquid gin = new Liquid("Gin", 0.25, 0.40);
        Liquid tonic = new Liquid("Spritz", 0.7, 0);
        Liquid coffeeLiquour = new Liquid("Coffee Licour", 0.3, 0.20);

        List<Liquid> aguaValencia = List.of(vodka, orangeJuice, whiteWine, gin, tonic);
        List<Liquid> rebuj = List.of(tonic, whiteWine);
        List<Liquid> espressoMartini = List.of(coffee, coffeeLiquour, vodka);
        List<Liquid> ginTon = List.of(gin, tonic);
        List<Liquid> coffeeSolo = List.of(coffee);
        List<Liquid> orange = List.of(orangeJuice);
        List<Liquid> wineAlone = List.of(whiteWine);

        Cocktail aguaDeValencia = new Cocktail("Agua de Valencia", aguaValencia);
        Cocktail rebujito = new Cocktail("Rebujito", rebuj);
        Cocktail esprMartini = new Cocktail("Espresso Martini", espressoMartini);
        Cocktail ginTonic = new Cocktail("Gin tonic", ginTon);

        DrinkQueue queueValencia = new DrinkQueue();
        List<Cocktail> vlc = new ArrayList<>(List.of(aguaDeValencia, rebujito));
        List<Cocktail> offer =  new ArrayList<>(List.of(aguaDeValencia, rebujito, esprMartini, ginTonic));
        queueValencia.setCocktailQueue(vlc);
        System.out.println("Current cocktail queue: ");
        for(Cocktail cocktail: vlc){
            System.out.println(cocktail.getName());
        }

        int opt = 1;
        do {
            opt = chooseOption();
            switch (opt) {
                case 1:
                    queueValencia.printOffer();
                    break;
                case 2:
                    int drink = chooseDrink();
                    if (drink == 1) {
                        if(queueValencia.offer(aguaDeValencia)){
                           vlc = queueValencia.getCocktailQueue();
                        }
                    }
                    if (drink == 2) {
                        if(queueValencia.offer(rebujito)){
                           vlc = queueValencia.getCocktailQueue();
                        }
                    }
                    if (drink == 3) {
                        if(queueValencia.offer(esprMartini)){
                           vlc = queueValencia.getCocktailQueue();
                        }
                    }
                    if (drink == 4) {
                        if(queueValencia.offer(ginTonic)){
                           vlc = queueValencia.getCocktailQueue();
                        }
                    }
                    break;
                case 3:
                    queueValencia.remove();
                    break;
                case 4:
                    Cocktail currentCocktail = queueValencia.peek();
                    if (currentCocktail != null) {
                        System.out.println("Next cocktail: " + currentCocktail.getName());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("No other option available");
                    break;
            }
        }while(opt != 5);

        return;
    }

    public static int readNr() {
        int i = 0;
        do {
            try {
                i = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("No integer");
            }
        }while(i <= 0 || i > 4);
        return i;
    }

    public static int chooseOption(){
        System.out.println("Please choose an option:");
        System.out.println("1.- Print offer");
        System.out.println("2.- Add Drink to the queue"); // offer
        System.out.println("3.- Remove drink");
        System.out.println("4.- Peek drink (what's next)");
        int i = 0;
       do{
           System.out.println("Select number from 1 to 4 (incl):");
           i = readNr();
       }while(i <= 0 || i > 4);
       return i;
    }

    public static int chooseDrink(){
        System.out.println("Please choose an option:");
        System.out.println("1.- Agua de Valencia");
        System.out.println("2.- Rebujito"); // offer
        System.out.println("3.- Espreso Martini");
        System.out.println("4.- Gin Tonic");
        int i = 0;
        do{
            System.out.println("Select number from 1 to 4 (incl):");
            i = readNr();
        }while(i <= 0 || i > 4);
        return i;
    }

}
