package project2;

import javax.swing.*;
import java.util.Scanner;

public class Hard implements Victorina{

    private int result;

    private String [][] quetions = {
            {"Кто придумал динамит?", "Нобель"},
            {"Кто итальянец?", "Рустамио"},
            {"Кто учится в Девелопии?", "Ученики Ага меллим"},
            {"Кто самый умный?", "вос Савант"},
            {"Кто проживает на дне океана?", "Алиф Боб"}
    };

    public Hard() {
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
