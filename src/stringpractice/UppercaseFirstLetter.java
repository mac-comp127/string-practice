package stringpractice;

import java.util.Scanner;

/***
 * A class for manipulating strings so that they are properly capitalized.
 *
 * @author Abigail Marsh, Fall 2019
 */
public class UppercaseFirstLetter {

    /***
     * Converts the first letter of the given string to uppercase.
     *
     * @param input A string to be modified
     * @return The input string, but with the first letter now capitalized
     */
    public static String uppercaseFirstLetter(String input) {
        // TODO: Implement this method
        return input.toUpperCase();
    }

    /***
     * Run this program to test your method on different input strings.
     */
    public static void main(String[] args) {
        System.out.println("--- short string test ---");
        System.out.println("Expected: A");
        System.out.println("  Actual: " + uppercaseFirstLetter("a"));
        System.out.println();

        System.out.println("--- long string test ---");
        System.out.println("Expected: Uppercase");
        System.out.println("  Actual: " + uppercaseFirstLetter("uppercase"));
        System.out.println();

        System.out.println("--- uppercase string test ---");
        System.out.println("Expected: Uppercase");
        System.out.println("  Actual: " + uppercaseFirstLetter("Uppercase"));
        System.out.println();

        System.out.println("--- same letter test ---");
        System.out.println("Expected: Eeee");
        System.out.println("  Actual: " + uppercaseFirstLetter("eeee"));
        System.out.println();

        System.out.println("--- empty string test ---");
        System.out.println("Expected: ");
        System.out.println("  Actual: " + uppercaseFirstLetter(""));
        System.out.println();

        System.out.println("--- interactive test ---");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something you would like to modify: ");
        String input = scan.nextLine();
        System.out.println(uppercaseFirstLetter(input));
        scan.close();
    }
}
