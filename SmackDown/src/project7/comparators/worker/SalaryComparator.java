package project7.comparators.worker;

import project7.models.Worker;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
