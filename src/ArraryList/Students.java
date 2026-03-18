package ArraryList;

import java.util.ArrayList;

public class Students {

    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

   

    public static void main(String[] args) {

        Students s = new Students("Dinesh", 20);
        Students s1 = new Students("Maris", 30);
        Students s2 = new Students("Venkat", 25);

        ArrayList<Students> stud = new ArrayList<>();

        stud.add(s);
        stud.add(s1);
        stud.add(s2);

        System.out.println(stud);
    }
}