package at.campus02.bsd;

import java.util.List;

/**
 * Creates Cocktails: a mix of different drinks
 * can be alcoholic or not
 * methods to calculate the volume and alcohol percentage
 */
public class Cocktail extends Drink {
    private List<Liquid> liquids;

    /**
     * Constructor: with name - to extend the Drink abstract class
     * @param name
     */
    public Cocktail(String name) {
        super(name);
    }

    /**
     * Constructor: giving already the list of liquids that creates the cocktail
     * @param name
     * @param liquids
     */
    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    /**
     * Name setter
     * @param name
     */
    public void setName(String name){ this.name = name;}

    /**
     * List of liquid getter
     * @return
     */
    public List<Liquid> getLiquids() {
        return liquids;
    }

    /**
     * List of liquid setter
     * @param liquids
     */
    public void setLiquids(List<Liquid> liquids) {
        this.liquids = liquids;
    }

    /**
     * calculates the entire quantity volume of liquid
     * @return double: volume
     */
    @Override
    public double getVolume() {
        double totalVolume = 0;

        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }

        return totalVolume;
    }

    /**
     * calculates the total amount of alcohol
     * @return double: alcohol %
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholVolume = 0;

        for (Liquid liquid : liquids) {
            alcoholVolume += liquid.getVolume() * liquid.getAlcoholPercent() / 100;
        }

        return alcoholVolume / getVolume() * 100;
    }

    /**
     * method to check if it is alcoholic or not
     * @return true when alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid liquid : liquids) {
            if (liquid.getAlcoholPercent() > 0) {
                return true;
            }
        }

        return false;
    }
}


