package project7;

import project7.comparators.user.AgeComporator;
import project7.comparators.worker.NameComparator;
import project7.comparators.worker.SalaryComparator;
import project7.comparators.worker.SurnameComparator;
import project7.models.User;
import project7.models.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<User> users = new ArrayList<>();
//        users.add(new User("altay.legend", "Altay", "Aliyev", 12, "Ukraine"));
//        users.add(new User("yusif.sheamus", "Yusif", "Seyidov", 15, "Azerbaijan"));
//        users.add(new User("alif.master-pro", "Alif", "Haciyev", 12, "Azerbaijan"));
//        users.add(new User("rustam.gigarustam", "Rustam", "Rustamli", 14, "Azerbaijan"));
//
//
//        Collections.sort(users, new AgeComporator());
//
//        for (User u:users) {
//            System.out.println(u);
//        }

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Alif", "Haciyev", "Astronaut", 50000));
        workers.add(new Worker("Yusif", "Seyidov", "Director", 150000));
        workers.add(new Worker("Murad", "Sadixli", "Elon Musk", 2000000));
        workers.add(new Worker("Altay", "Aliyev", "Youtuber", 10000));

        Collections.sort(workers, new SalaryComparator());

        for (Worker w: workers) {
            System.out.println(w);
        }

    }
}
