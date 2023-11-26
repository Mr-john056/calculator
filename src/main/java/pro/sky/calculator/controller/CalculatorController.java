package pro.sky.calculator.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer a, @RequestParam Integer b) {
        Integer result = calculatorService.plus(a, b);
        return a + " + " + b + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer a, @RequestParam Integer b) {
        Integer result = calculatorService.minus(a, b);
        return a + " - " + b + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer a, @RequestParam Integer b) {
        Integer result = calculatorService.multiply(a, b);
        return a + " * " + b + " + " + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer a, @RequestParam Integer b) {
        Double result = calculatorService.divide(a, b);
        return a + " / " + b + " = " + result;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String divideByZero(IllegalArgumentException e, HttpServletResponse response) {
        response.setStatus(400);
        return e.getMessage();
    }
}
