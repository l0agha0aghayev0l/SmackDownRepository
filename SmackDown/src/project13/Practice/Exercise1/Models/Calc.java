package project13.Practice.Exercise1.Models;


public class Calc {

    public void calculate(int a, char c, int b){
        double result = switch (c){
            case '+' -> sum(a, b);
            case '-' -> min(a, b);
            case '*' -> multiplicate(a, b);
            case '/' -> divide(a, b);
            default -> 0;

        };
        System.out.println(a + " " + c + " " + b + " = " + result);
    }

    private double sum(int a, int b){
        return a + b;
    }

    private double min(int a, int b){
        return a - b;
    }

    private double multiplicate(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}
