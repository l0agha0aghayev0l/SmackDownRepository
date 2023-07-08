package project2;

import javax.swing.*;
import java.util.Scanner;

public class Easy implements Victorina{
    private int result;

    String [][] quetions = {
            {"Сколько будет 2+2?", "5"},
            {"Как называется наша галактика?", "милки вэй"},
            {"Первый космонафт", "Юрий Гагарин"},
            {"Самая близкая планета к Солнцу", "Меркурий"},
            {"Где находится самая высокая гора в солнечной системе", "В Марсе"}
    };

    public Easy() {
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
