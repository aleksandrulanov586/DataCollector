package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator (2,2);


        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
    }
}
