package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;
		try {
			int d=10/0;
       System.out.println(d);


		}

		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		try {
			int e=11/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(a+b);
	}
	

}
