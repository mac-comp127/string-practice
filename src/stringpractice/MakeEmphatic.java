package stringpractice;

import java.util.Scanner;

/***
 * A class for manipulating strings so that they are properly emphatic.
 *
 * @author Abigail Marsh, Fall 2019
 */
public class MakeEmphatic {

    /***
     * A method that takes in a string, and returns the emphasized version of that string.
     * Emphasized strings should be in ALL CAPS and use TOO MANY EXCLAMATION POINTS!!!
     * TODO: Write this method
     *
     * @param input Any string
     * @return The input string, in ALL CAPS!!!
     */
    public static String makeEmphatic(String input) {
        return input;
    }

    /***
     * Run this program to test your method on different input strings
     */
    public static void main(String[] args) {
        System.out.println("--- long string test ---");
        System.out.println("Expected: EMPHASIS!!!");
        System.out.println("  Actual: " + makeEmphatic("emphasis"));
        System.out.println();

        System.out.println("--- short string test ---");
        System.out.println("Expected: I!!!");
        System.out.println("  Actual: " + makeEmphatic("i"));
        System.out.println();

        System.out.println("--- empty string test ---");
        System.out.println("Expected: !!!");
        System.out.println("  Actual: " + makeEmphatic(""));
        System.out.println();

        System.out.println("--- interactive test ---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something you would like to emphasize: ");
        String input = scan.nextLine();
        System.out.println(makeEmphatic(input));
        scan.close();
    }
}
