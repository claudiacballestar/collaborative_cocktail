package at.campus02.bsd;

/**
 * imports the SCANNER as final from Main - to have a static calling scanner
 */
import static at.campus02.bsd.Main.SCANNER;

/**
 * Class to simulate the reading input copied from:
 * {@link <a>https://mvnrepository.com/artifact/org.junit/junit-bom/6.0.3</a>}
 *
 */
public class InputReader {

    /**
     * Reads from System.in and returns the input as a String
     * @return string input from console
     */
    public String readInput() {
        System.out.print("Enter input: ");
        return SCANNER.nextLine();
    }

    /**
     * method copied from Main to being able to test it in the MainTest class
     * @return the int that given in the console, if it is 1,2,3,4
     * @throws NumberFormatException if number readed is <= 0 or > 4
     */
    public static int readNr() throws NumberFormatException {
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
}