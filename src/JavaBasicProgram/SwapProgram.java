
package JavaBasicProgram;
import java.util.Scanner;

public class SwapProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your First Number");
		 int num=sc.nextInt();
		 System.out.println("Enter Your Second Number");
		 int num1=sc.nextInt();
		 
		 int num2;
		  num=num+num1;
		  num1=num-num1;
		  num=num-num1;
		
			System.out.println("After Swapping");
		System.out.println(num);
		System.out.println(num1);
	

	}

}
