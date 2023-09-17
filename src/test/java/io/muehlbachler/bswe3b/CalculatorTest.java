package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testDividePositiveNumberNoRemainder() {
        Calculator calc = new Calculator();

        assertEquals(1, calc.divide(1, 1), "1/1 should be 1");
    }

    // FIXME: implement more tests
}
