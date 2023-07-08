package project3;

import javax.swing.*;
import java.util.Date;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Input the name");
        String surname = JOptionPane.showInputDialog("Input the surname");;
        int age = Integer.parseInt(JOptionPane.showInputDialog("Input the age"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Input the height"));
        String work = JOptionPane.showInputDialog("Input the work");
        String hobby = JOptionPane.showInputDialog("Input the hobby");;
        boolean marriage = Boolean.parseBoolean(JOptionPane.showInputDialog("Input the marriage"));
        boolean richStatus = Boolean.parseBoolean(JOptionPane.showInputDialog("Input the richStatus"));

        String result = String.format("Fullname: %s %s Age: %d\n" +
                "Height: %f Work: %s\n" +
                "Hobby: %s Marriage: %b\n" +
                "Rich: %b",
                name, surname, age, height, work, hobby, marriage, richStatus);
        JOptionPane.showMessageDialog(null, result);

        System.out.printf("Fullname: %s %s Age: %d\n" +
                        "Height: %f Work: %s\n" +
                        "Hobby: %s Marriage: %b\n" +
                        "Rich: %b",
                name, surname, age, height, work, hobby, marriage, richStatus);
    }
}
