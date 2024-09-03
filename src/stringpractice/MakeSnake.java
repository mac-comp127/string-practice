package stringpractice;

import java.util.Scanner;

/***
 * A class for manipulating strings so that they are properly snakey.
 *
 * @author Abigail Marsh, Fall 2019
 */
public class MakeSnake {

    /***
     * Modifiesss ssstringsss ssso they are sssibilant.
     *
     * @param input Any string
     * @return The sssame ssstring, but with more hissssssing
     */
    public static String makeSnake(String input) {
        // TODO: Implement this method
        return input;
    }

    /***
     * Run this program to tessst your method on different input ssstringsss.
     */
    public static void main(String[] args) {
        System.out.println("--- mixed Ss test ---");
        System.out.println("Expected: SSSnake sssoundsss");
        System.out.println("  Actual: " + makeSnake("Snake sounds"));
        System.out.println();

        System.out.println("--- all whitespace test ---");
        System.out.println("Expected:   ");
        System.out.println("  Actual: " + makeSnake("  "));
        System.out.println();

        System.out.println("--- empty string test ---");
        System.out.println("Expected: ");
        System.out.println("  Actual: " + makeSnake(""));
        System.out.println();

        System.out.println("--- interactive test ---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sssomething you would like to sssnakeify: ");
        String input = scan.nextLine();
        System.out.println(makeSnake(input));
        scan.close();
    }
}
