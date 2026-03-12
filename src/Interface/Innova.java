package Interface;

public class Innova implements Car {

	@Override
	public void Sleep() {
		System.out.println("Innova is best");
		
	}
	void speed()
	{
		System.out.println("Innova is 130 speed per/h");
	}
	public static void main(String args[])
	{
		Innova I=new Innova();
		I.Sleep();
		I.speed();
	}
	

}
