package project2;

import javax.swing.*;
import java.util.Scanner;

public class Quetions {
    private String [][] easyQuetions = {
            {"Сколько будет 2+2?", "5"},
            {"Как называется наша галактика?", "милки вэй"},
            {"Первый космонафт", "Юрий Гагарин"},
            {"Самая близкая планета к Солнцу", "Меркурий"},
            {"Где находится самая высокая гора в солнечной системе", "В Марсе"}
    };

    private String [][] mediumQuetions = {
            {"Кто открыл Австралию?", "Джеймс Гук"},
            {"Кто создал закон всемирного тяготения?", "Ньютон"},
            {"По какой формуле мы находим гипотенузу треугольника?", "Пифагор"},
            {"Кто создал теорию относительности?", "Эйнштейн"},
            {"Кто изобрел самый первый телефон?", "Александ"}
    };

    private String [][] hardQuetions = {
            {"Кто придумал динамит?", "Нобель"},
            {"Кто итальянец?", "Рустамио"},
            {"Кто учится в Девелопии?", "Ученики Ага меллим"},
            {"Кто самый умный?", "вос Савант"},
            {"Кто проживает на дне океана?", "Алиф Боб"}
    };

    public void intro(String result){
        switch (result){
            case "1", "Easy":
                ask(easyQuetions);
                break;
            case "2", "Medium":
                ask(mediumQuetions);
                break;
            case "3", "Hard":
                ask(hardQuetions);
                break;
        }
    }

    private void ask(String[][] quetions) {
        int result = 0;
        int life = 3;
        for (int i = 0; i < quetions.length; i++) {
            String answer = JOptionPane.showInputDialog(null, quetions[i][0]);
            if (quetions[i][1].toLowerCase().equalsIgnoreCase(answer.trim())){
                result++;
                JOptionPane.showMessageDialog(null, "Правильно");
            } else {
                life--;
                JOptionPane.showMessageDialog(null, "Неправильно");
            }
            if (life == 0){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Вы получили " + result + " баллов");
    }
}
