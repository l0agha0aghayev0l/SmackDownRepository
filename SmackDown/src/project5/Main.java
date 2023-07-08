package project5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("B", "C", 98));
        students.add(new Student("A", "A", 14));
        students.add(new Student("C", "B", 1000000));

        Collections.sort(students, new StudentsNameComparator());
        System.out.println(students);

        Collections.sort(students, new StudentsSurnameComparator());
        System.out.println(students);

        Collections.sort(students, new StudentsAgeComparator());
        System.out.println(students);
    }

}

//        ArrayList<Integer> arrayList = new ArrayList();
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//
////        arrayList.add(5, 55);
////        arrayList.remove(3);
//        for (int i: arrayList) {
//            System.out.println(i);
//        }
//
//        System.out.println(arrayList.get(7));

//        HashMap<Integer, String> students = new HashMap<>();
//        students.put(12, "Altay");
//        students.put(0, "Aylin");
//        students.put(3, "Alif");
//        students.put(1, "John");

//        System.out.println(students);

//        HashSet<String> username = new HashSet<>();
//        username.add("Lukashenko");
//        username.add("Stalin");
//        username.add("Zelenskiy");
//        username.add("Omar");
//
//        System.out.println(username);

