package project2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quetions quetions = new Quetions();
        System.out.println("Какую сложность вы хотите? 1-Easy, 2-Medium, 3-Hard");
        String value = JOptionPane.showInputDialog(null, "Введите сложность");
        quetions.intro(value);
    }
}
