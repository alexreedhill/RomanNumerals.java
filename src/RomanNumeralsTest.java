import org.junit.Test;
import static junit.framework.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void converts1toI() {
        String numeral = RomanNumerals.convert(1);
        assertEquals(numeral, "I");
    }
}
