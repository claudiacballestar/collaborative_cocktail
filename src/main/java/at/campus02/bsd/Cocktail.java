package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> liquids;

    public Cocktail(String name) {
        super(name);
    }

    public Cocktail(String name, List<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    public void setName(String name){ this.name = name;}

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


