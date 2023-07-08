package project7.comparators.user;

import project7.models.User;

import java.util.Comparator;

public class NameComporator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
