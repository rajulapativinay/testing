package Methods;

public class MethodOverLoading {
	
	
	public static   void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,float b)
	{
		System.out.println(a+b);
		
	}
	public static void add(double a,double b)
	{
		System.out.println(a+b);
		
	}
	public static void add(int a, int b, int c)
	{
		
		System.out.println(a+b+c);
	}
	public void add(float a, float b)
	{
		System.out.println(a+b);
	}
	public void add(double a,float b)
	{
		System.out.println(a+b);
	}
public static void main(String[] args) {
	MethodOverLoading mo=new MethodOverLoading();
	add(10,20);
	add(10,20.5);
	add(10.5,20.2);
	add(10,20,30);
	add(10.2,10.3);
	add(10.0,20.5);
	
	
	
}
}
