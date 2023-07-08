package project11;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c;
        int numbers = Integer.parseInt(JOptionPane.showInputDialog("Input the count of numbers: "));
        int[] arr = new int[numbers];
        arr[0] = a;
        arr[1] = b;
        for (int i = 2; i < arr.length; i++) {
            c = a + b;
            b = a;
            a = c;
            arr[i] = c;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(arr));
    }
}
