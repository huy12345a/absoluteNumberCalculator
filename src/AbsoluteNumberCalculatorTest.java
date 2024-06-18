import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    public void findAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
}