package Abstraction;

public class Innova extends Car {

	@Override
	void speed() {
		System.out.println("120 speed per/h");
		
	}
	void run() {
		System.out.println("running");
	}
	public static void main(String args[]) {
		Innova I=new Innova();
		I.speed();
		I.run();
	}

	

	}

