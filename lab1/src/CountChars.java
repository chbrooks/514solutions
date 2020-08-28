import java.util.Scanner;

/* Modify to:
   1. Count vowels.
   2. Change to a static function.
   2. determine whether the string contains any punctuation characters. Assume that anything that's not a letter or digit is punctuation.
   3. Replace with '*'
 */

public class CountChars {

    /**
     * nVowels: takes as input a String and returns the number of vowels in the string.
     * Assume that a,e,i,o,u,A,E,I,O,U are all of the vowels.
     *
     * @param instring
     * @return number of vowels
     */
    public static int nVowels(String instring) {
        int total = 0;

        for (int i = 0; i < instring.length(); i++) {
            char ch = instring.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                total++;
            }
        }

        return total;
    }

    /**
     * hasPunc: takes as input a string and returns true if the string contains punctuation.
     * For this method, we'll assume that anything other than a letter or number is punctuation.
     *
     * @param instring
     * @return True if the string has punctuation and false otherwise
     */
    public static boolean hasPunc(String instring) {
        for (int i = 0; i < instring.length(); i++) {
            if (!Character.isLetterOrDigit(instring.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    /**
     * hide: takes as input a String and returns a string of equal length with all characters replaced by '*'
     *
     * @param instring
     * @return String of equal length with * replacing the characters
     */
    public static String hide(String instring) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < instring.length(); i++) {
            sb.append('*');
        }
        return sb.toString();
    }

    /**
     *  a version of hide that doesn't use StringBuilder.
     *  */
    public static String hide2(String instring) {
        String returnString = "*".repeat(instring.length());
        return returnString;
    }



    public static void main(String[] args) {
        String str;
        int i = 0, nVowels = 0;
        boolean hasPunc = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string:");
        str = scanner.nextLine();
        System.out.println(str.length());

        nVowels = nVowels(str);
        hasPunc = hasPunc(str);

        System.out.println("Number of Vowels:" + nVowels);
        System.out.println("Has Punctuation? " + hasPunc);
        System.out.println("Hidden: " + hide(str));
    }
}