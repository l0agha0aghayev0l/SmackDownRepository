package project2;

import javax.swing.*;
import java.util.Scanner;

public class Medium implements Victorina{

    private int result;

    String [][] quetions = {
            {"Кто открыл Австралию?", "Джеймс Гук"},
            {"Кто создал закон всемирного тяготения?", "Ньютон"},
            {"По какой формуле мы находим гипотенузу треугольника?", "Пифагор"},
            {"Кто создал теорию относительности?", "Эйнштейн"},
            {"Кто изобрел самый первый телефон?", "Александ"}
    };

    public Medium() {
        ask();
    }

    @Override
    public void ask() {
        result = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quetions.length; i++) {
            JOptionPane.showMessageDialog(null, quetions[i][0]);
            String answer = JOptionPane.showInputDialog(null, quetions[i][0]);
            if (quetions[i][1].toLowerCase().equalsIgnoreCase(answer.trim())){
                result++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
            }
        }
    }
}
