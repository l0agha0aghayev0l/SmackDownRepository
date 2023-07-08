package project8.model;

public class Numb implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(2);
        }
    }
}
