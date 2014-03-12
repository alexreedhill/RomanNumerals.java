import org.apache.commons.lang3.StringUtils;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println("Roman Numerals Kata");
    }

    static int[] ARABICS = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] ROMANS = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int arabic) {
        String roman = "";

        for(int i = 0; i < ARABICS.length; i++) {
           while(arabic >= ARABICS[i]) {
               roman += ROMANS[i];
               arabic -= ARABICS[i];
           }
        }
        return roman;
    }
}

