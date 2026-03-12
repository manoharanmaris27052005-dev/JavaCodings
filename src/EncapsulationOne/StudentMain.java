package EncapsulationOne;

public class StudentMain {


    public static void main(String[] args) {

        Student s = new Student();

        s.setName("MARIX");
        s.setId(11);
        s.setAge(20);
        s.setMark(90);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Mark: " + s.getMark());
    }
}