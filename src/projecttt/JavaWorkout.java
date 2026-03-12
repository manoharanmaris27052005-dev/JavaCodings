package projecttt;

public class JavaWorkout {

    String name;
    int id;
    int age;
    int mark;

    void setname(String name){
        this.name = name;
    }

    void setid(int id){
        this.id = id;
    }

    void setage(int age){
        this.age = age;
    }

    void setmark(int mark){
        if(mark > 0 && mark <= 100){
            this.mark = mark;
        }
    }

    String getname(){
        return name;
    }

    int getid(){
        return id;
    }

    int getage(){
        return age;
    }

    int getmark(){
        return mark;
    }
}