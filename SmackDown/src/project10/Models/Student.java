package project10.Models;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String fullName;
    private Subject subjects;

    public Student(String fullName, Subject subjects) {
        this.fullName = fullName;
        this.subjects = subjects;
    }
}
