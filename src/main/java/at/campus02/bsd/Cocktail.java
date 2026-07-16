package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> liquids;

    public Cocktail(String name) {
        super(name);
    }

    public Cocktail(List<Liquid> liquids) {
        super("Unnamed Cocktail");
        this.liquids = liquids;
    }

    public List<Liquid> getLiquids() {
        return liquids;
    }

    public void setLiquids(List<Liquid> liquids) {
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        double totalVolume = 0;

        for (Liquid liquid : liquids) {
            totalVolume += liquid.getVolume();
        }

        return totalVolume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcoholVolume = 0;

        for (Liquid liquid : liquids) {
            alcoholVolume += liquid.getVolume() * liquid.getAlcoholPercent() / 100;
        }

        return alcoholVolume / getVolume() * 100;
    }

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


