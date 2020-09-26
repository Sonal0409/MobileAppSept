package javaintro;

public class ClassA {
	
	static int j=200;  // global variable or class vairbale

	public void sum()
	{
		int a=10;
		int b=20;
		int result= a+b;
		System.out.println(result);
	}
	
	public void mul()
	{
		int x=10;
		int y=20;
		int result1= x*y;
		System.out.println(result1);
	}
	
	public void login(String username, String password )
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	public static void sum(int p, int q)
	{
		int result= p+q;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		
		
	}

}
