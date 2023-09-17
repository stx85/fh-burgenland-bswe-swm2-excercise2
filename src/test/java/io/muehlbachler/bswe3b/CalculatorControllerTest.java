package io.muehlbachler.bswe3b;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorControllerTest {
    @Autowired
    private CalculatorController controller;

    @Test
    public void testDividePositiveNumberNoRemainder() {
        assertEquals(1, controller.divide(1, 1), "1/1 should be 1");
    }

    // FIXME: implement more tests
}
