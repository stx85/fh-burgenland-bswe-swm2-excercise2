package io.muehlbachler.bswe3b;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testDividePositiveNumberNoRemainder() {
        Calculator calc = new Calculator();

        assertEquals(calc.divide(1, 1), 1, "1/1 should be 1");
    }

    // FIXME: implement more tests
}
