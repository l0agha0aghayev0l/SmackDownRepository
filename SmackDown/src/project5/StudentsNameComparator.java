package project5;

import java.util.Comparator;

public class StudentsNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
        return o2.getName().compareTo(o1.getName());
    }
}
