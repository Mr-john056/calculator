package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    private final int EXPECTED = 15;
    @Test
    void welcome() {
    String expected = "Welcome to Calculator";
    assertEquals(expected,CalculatorService.welcome());
    }

    @Test
    void plus() {
    int expected = 15;
    assertEquals(expected,calculatorService.plus(5,10));
    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}