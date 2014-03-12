import org.junit.Test;
import static junit.framework.Assert.*;

public class RomanNumeralsTest {
    @Test public void converts1toI() {
        String numeral = RomanNumerals.convert(1);
        assertEquals("I", numeral);
    }

    @Test public void converts2toII() {
        String numeral = RomanNumerals.convert(2);
        assertEquals("II", numeral);
    }

    @Test public void converts3toIII() {
        String numeral = RomanNumerals.convert(3);
        assertEquals("III", numeral);
    }

    @Test public void converts4toIV() {
        String numeral = RomanNumerals.convert(4);
        assertEquals("IV", numeral);
    }

    @Test public void converts5toV() {
        String numeral = RomanNumerals.convert(5);
        assertEquals("V", numeral);
    }

    @Test public void converts6toVI() {
        String numeral = RomanNumerals.convert(6);
        assertEquals("VI", numeral);
    }

    @Test public void converts7toVII() {
        String numeral = RomanNumerals.convert(7);
        assertEquals("VII", numeral);
    }

    @Test public void converts9toIX() {
        String numeral = RomanNumerals.convert(9);
        assertEquals("IX", numeral);
    }

    @Test public void converts10toX() {
        String numeral = RomanNumerals.convert(10);
        assertEquals("X", numeral);
    }

    @Test public void converts11toXI() {
        String numeral = RomanNumerals.convert(11);
        assertEquals("XI", numeral);
    }

    @Test public void converts14toXIV() {
        String numeral = RomanNumerals.convert(14);
        assertEquals("XIV", numeral);
    }

    @Test public void converts15toXV() {
        String numeral = RomanNumerals.convert(15);
        assertEquals("XV", numeral);
    }

    @Test public void converts20toXX() {
        String numeral = RomanNumerals.convert(20);
        assertEquals("XX", numeral);
    }

    @Test public void converts40toXL() {
        String numeral = RomanNumerals.convert(40);
        assertEquals("XL", numeral);
    }

    @Test public void converts50toL() {
        String numeral = RomanNumerals.convert(50);
        assertEquals("L", numeral);
    }

    @Test public void converts90toXC() {
        String numeral = RomanNumerals.convert(90);
        assertEquals("XC", numeral);
    }

    @Test public void converts100toC() {
        String numeral = RomanNumerals.convert(100);
        assertEquals("C", numeral);
    }

    @Test public void converts157toCLVII() {
        String numeral = RomanNumerals.convert(157);
        assertEquals("CLVII", numeral);
    }
}
