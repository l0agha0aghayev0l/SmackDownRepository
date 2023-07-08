package project7.comparators.user;

import project7.models.User;

import java.util.Comparator;

public class AgeComporator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge()> o2.getAge()){
            return 1;
        } else if (o1.getAge()< o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
