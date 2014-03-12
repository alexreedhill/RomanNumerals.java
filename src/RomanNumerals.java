import org.apache.commons.lang3.StringUtils;

public class RomanNumerals {
    public static void main(String[] args) {
        System.out.println("Roman Numerals!");
    }

    public static String convert(int number) {
        String numeral = StringUtils.repeat("I", number);
        return numeral;
    }
}

