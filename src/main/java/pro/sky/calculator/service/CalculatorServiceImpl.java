package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Welcome to Calculator";
    }

    @Override
    public Integer plus(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer minus(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Double divide(Integer a, Integer b) {
        if (b==0) throw new IllegalArgumentException("На ноль делить нельзя");
        return a.doubleValue() / b.doubleValue();
    }
}
