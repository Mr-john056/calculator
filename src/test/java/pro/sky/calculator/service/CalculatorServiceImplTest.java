package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    private final int EXPECTED = 15;

    @Test
    void welcome() {
        String expected = "Welcome to Calculator";
        assertEquals(expected, calculatorService.welcome());
    }

    @Test
    void plus() {
        int expected = 15;
        assertEquals(expected, calculatorService.plus(5, 10));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "5,10,15", "-10,15,5", "0,0,0", "0,-1,0"})
    void plusPasitive(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculatorService.plus(a, b));
    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @Test
    void dividePositive() {
        double expected = 10;
        calculatorService.plus(null, null);
        assertEquals(expected, calculatorService.divide(5, 5));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(Integer.MAX_VALUE, 0));
    }

    @Test
    void divideByNull() {
        assertThrows(NullPointerException.class, () -> calculatorService.divide(Integer.MAX_VALUE, null));
    }

}