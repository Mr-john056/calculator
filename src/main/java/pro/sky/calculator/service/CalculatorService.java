package pro.sky.calculator.service;

public interface CalculatorService {
    static String welcome();

    String welcome();

    Integer plus(Integer a, Integer b);
    Integer minus(Integer a, Integer b);
    Integer multiply(Integer a, Integer b);
    Double divide(Integer a, Integer b);
}
