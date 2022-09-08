package stringpractice;

@SuppressWarnings("unused")
public class UnicodeExperiments {
    public static void main(String[] args) {
        String s1 = "tiếng Việt";
        String s2 = "tiếng Việt";
        String s3 = "😅";
        String s4 = "😵‍💫";
    }

    /**
     * Prints each Unicode codepoint of the given string on a separate line, along with the
     * codepoint's decimal number and name.
     */
    private static void printCodepoints(String str) {
        System.out.println("------ Codepoints in \"" + str + "\" ------");
        str.codePoints().forEach(codepoint -> {
            System.out.printf
                ("%s\t%06d %s\n",
                Character.toString(codepoint),
                codepoint,
                Character.getName(codepoint));
        });
        System.out.println();
    }
}
