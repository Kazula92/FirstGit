package com.kalkulator;

public class Calculator {

    public int addAtoB(int a, int b){
        return a+b;
    }

    public int subtractAFromB(int a, int b){
        return b-a;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.subtractAFromB(5, 7);
        int result1 = calculator.addAtoB(4,9);

        System.out.println("The results of the activities:");
        System.out.println(result);
        System.out.println(result1);
    }
}
