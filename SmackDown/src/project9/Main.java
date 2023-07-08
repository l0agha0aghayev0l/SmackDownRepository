package project9;

import project9.models.Director;
import project9.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Director director1 = new Director("Aylin", "IT", 3, 3500);
        Director director2 = new Director("Medina", "Programmer", 2, 4000);

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(0, "Alif", "Programmer", 4, 2500));
        workers.add(new Worker(1, "Murad", "Engineer", 6, 6000));
        workers.add(new Worker(2, "Altay", "IT", 4, 2500));
        workers.add(new Worker(3, "Omar", "IT", 7, 7000));
        workers.add(new Worker(4, "Rustam", "IT", 3, 3200));

        List<Worker> company1 = new ArrayList<>();
        List<Worker> company2 = new ArrayList<>();

        for (Worker w: workers) {
            if (director1.acceptingWorker(w)){
                company1.add(w);
            }
            if (director2.acceptingWorker(w)){
                company2.add(w);
            }
        }

        System.out.println("Company 1: " + company1);
        System.out.println("Company 2: " + company2);
    }
}
