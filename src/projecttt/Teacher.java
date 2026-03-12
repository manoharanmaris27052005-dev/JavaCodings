package projecttt;

public class Teacher {
	String name;
	int age;
	Teacher(){
		System.out.println("HIII");
	}
	void display() {
		System.out.println("hii");
	}
	void setname(String name)
	{
		this.name=name;
	}
	void setage(int age)
	{
		this.age=age;
	}
	
	
	
	

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.display();
		t1.setname("mark");
		System.out.println(t1.name);
		t1.setage(11);
		System.out.println(t1.age);
		
	}

}
