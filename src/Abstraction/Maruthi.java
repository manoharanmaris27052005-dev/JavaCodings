package Abstraction;

public class Maruthi  extends Car{

	@Override
	void speed() {
		System.out.println("Maruthi is very slow or medium");
		
	}
	public static void main(String args[]) {
		Maruthi C=new Maruthi();
		C.speed();
		C.sleep();
	}
	
}
