package projecttt;

public class Student {

    public static void main(String[] args) {

        JavaWorkout j = new JavaWorkout();

        j.setname("MARIX");
        j.setid(11);
        j.setage(20);
        j.setmark(90);

        System.out.println("ID: " + j.getid());
        System.out.println("Name: " + j.getname());
        System.out.println("Age: " + j.getage());
        System.out.println("Mark: " + j.getmark());
    }
}