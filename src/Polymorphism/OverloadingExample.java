package Polymorphism;

public class OverloadingExample {
	  void add(int a, int b) {
	        System.out.println("Sum of two numbers: " + (a + b));
	    }

	    void add(int a, int b, int c) {
	        System.out.println("Sum of three numbers: " + (a + b + c));
	    }

	    void add(double a, double b) {
	        System.out.println("Sum of double numbers: " + (a + b));
	    }
	public static void main(String[] args) {
		  OverloadingExample obj = new OverloadingExample();

	        obj.add(10, 20);
	        obj.add(10, 20, 30);
	        obj.add(5.5, 4.5);
	    }
	}



