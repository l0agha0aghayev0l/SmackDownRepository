package project13.Practice.Exercise1.Models;

public class Calculator {

    public void calculate(int a, char c, int b) throws NoSuchFieldException {
        int result = 0;

        switch (c){
            case '+':
                result = sum(a, b);
                System.out.println(a + " " + c + " " + b + " = " + result);
                break;
            case '-':
                result = min(a, b);
                System.out.println(a + " " + c + " " + b + " = " + result);
                break;
            case '*':
                result = multiplicate(a, b);
                System.out.println(a + " " + c + " " + b + " = " + result);
                break;
            case '/':
                result = divide(a, b);
                System.out.println(a + " " + c + " " + b + " = " + result);
                break;
            default:
                throw new NoSuchFieldException("This operator is not exist, please input another one");
        }
    }
    private int sum(int a, int b){
        return a + b;
    }

    private int min(int a, int b){
        return a - b;
    }

    private int multiplicate(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
