package EncapsulationOne;

public class Student {



    private String name;
    private int id;
    private int age;
    private int mark;

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMark(int mark){
        this.mark = mark;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public int getMark(){
        return mark;
    }
}