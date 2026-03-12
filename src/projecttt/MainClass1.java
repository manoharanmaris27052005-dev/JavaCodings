package projecttt;


	class dad
	{
		int money=1000;
	}
	class son extends dad
	{
	}
	class child extends son{
		void bark() {
			System.out.println("nnnn");
		}
		
	}
	
		
		public class MainClass1 
		{
	
	public static void main(String args[])
	{
		son s=new son();
		dad d=new dad();
		child c=new child();
		
		System.out.println(s.money);
		System.out.println(d.money);
		System.out.println(c.money);
		c.bark();
		
	}
		}
	