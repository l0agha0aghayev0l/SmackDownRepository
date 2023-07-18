package project13.Practice.Exercise1;

import project13.Practice.Exercise1.Models.Calc;
import project13.Practice.Exercise1.Models.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Calc calc = new Calc();
//
//        try {
//            calc.calculate(12, '/', 2);
//        } catch (ArithmeticException e){
//            System.out.println("На ноль делить нельзя");
//        }

        Calculator calculator = new Calculator();

        try {
            calculator.calculate(12, '/', 10);
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        List<String> list = new ArrayList<>();

        int a  = 12;
//        try {
//            calculator.calculate(12, '.', 45);
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
    }
}
