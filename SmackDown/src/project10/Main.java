package project10;

import project10.Models.Student;
import project10.Models.Subject;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John Doe", new Subject(10, 5));
//        Random r = new Random();
//
//        int numb = Integer.parseInt(JOptionPane.showInputDialog("Please, enter the number:"));
//        int[] arr = new int[numb];
//        int chet = 0;
//        int nechet = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(1, 1000);
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int j : arr) {
//            if (j % 2 == 0){
//                chet++;
//            } else{
//                nechet++;
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "Количество четных элементов: " + chet
//        + "\nКоличество нечетных элементов: " + nechet);
    }
}
