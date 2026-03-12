package Interface;

public class Maruthi  implements Car{

	@Override
	public void Sleep() {
		System.out.println("Maruthi is slow ");
		
}
	void run() {
		System.out.println("Maruthi is running");
	}
	public static void main(String args[])
	{
		Maruthi M=new Maruthi();
		M.Sleep();
		M.Sleep();
	}
}

		

	


