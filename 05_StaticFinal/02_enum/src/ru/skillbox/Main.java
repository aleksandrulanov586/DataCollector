package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator (3,2);


        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
        System.out.println(arithmeticCalculator.calculate(Operation.SUBTRACT));
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
    }
}
