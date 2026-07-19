package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals; // if I import as static, I don't have to
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.List;

/**
 * <p>Tests the main methods of the class Cocktail:
 * - calculation of total amount (volume)
 * - calculation of total alcohol %
 * - check if a drink is alcoholic or not</p>
 */
public class CocktailTest {

    private Cocktail cocktail;
    /**
     * <p>BeforeEach: instance of the method Cocktail as Agua de Valencia
     * (and its corresponding Liquids and List of Liquids)
     * to be used in the rest of the test methods</p>
     *
     */
    @BeforeEach
    public void setup() {
        Liquid vodka = new Liquid("Vodka", 0.25, 0.37);
        Liquid orangeJuice = new Liquid("Orange Juice", 0.1, 0);
        Liquid whiteWine = new Liquid("White Whine", 0.4, 0.10);
        Liquid gin = new Liquid("Gin", 0.25, 0.40);
        Liquid tonic = new Liquid("Spritz", 0.7, 0);

        List<Liquid> aguaValencia = List.of(vodka, orangeJuice, whiteWine, gin, tonic);
        cocktail = new Cocktail("Agua de Valencia",aguaValencia);

    }

    /**
     * <p>Test: Calculation of the entire quantity of drink in the cocktail</p>
     */
    @Test
    public void testVolume() {assertEquals(1.70, cocktail.getVolume());}

    /**
     * <p>Test: Calculation of the alcoholic % of a given cocktail</p>
     */
    @Test
    public void testAlcoholPercent() { assertEquals(23.25, cocktail.getAlcoholPercent());}

    /**
     * <p>Test: return true if alcoholic, false if not</p>
     */
    @Test
    public void testIsAlcoholic() { assertEquals(true, cocktail.isAlcoholic());}

}
