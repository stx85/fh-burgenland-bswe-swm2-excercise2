package io.muehlbachler.bswe3b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {
    private final Calculator calculator = new Calculator();

    @GetMapping("/divide")
    int divide(@RequestParam(value = "a") final int a, @RequestParam(value = "b") final int b) {
        return calculator.divide(a, b);
    }
}
