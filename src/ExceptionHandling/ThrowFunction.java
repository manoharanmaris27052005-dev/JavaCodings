package ExceptionHandling;

public class ThrowFunction {

	
		public static void main(String[] args) throws Exception {

			int age = 20;

			if(age < 18) {
				throw new Exception(" not eligible for vote");
			}

			System.out.println("Eligible for vote");
		}
	}
