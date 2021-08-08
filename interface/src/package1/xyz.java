package package1;

public class xyz extends ww implements I1,I2
	
{
	int b;
	int a =4;
	public void m3(int a, int b) 
	{
		
	 System.out.println(a+b);
	}
	
	public void m3() 
	{
		System.out.println("I am overloaded overrided method");
		System.out.println(super.b);
	}
	public void m11()
	{
		System.out.println("Hello World");
	}
	
	public void m1() 
	{
		System.out.println("m1 is running");
	}
	
	public void m2() 
	{
		System.out.println("method m2 running");
		
	}
	
	public void m2(int a) 
	{
		System.out.println(this.a);
	
	}



  
}
