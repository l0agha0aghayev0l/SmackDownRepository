package project7.comparators.worker;

import project7.models.Worker;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
