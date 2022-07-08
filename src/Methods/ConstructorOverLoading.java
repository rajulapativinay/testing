package Methods;

public class ConstructorOverLoading {
	
	ConstructorOverLoading(int a,int b)
	{
		System.out.println(a+b);
		
	}
	ConstructorOverLoading(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	ConstructorOverLoading(int a,float b)
	{
		System.out.println(a+b);
		
	}
	ConstructorOverLoading(float a,float b)
	{
		System.out.println(a+b);
		
	}
	ConstructorOverLoading(double a,int b)
	{
		System.out.println(a+b);
		
	}
	ConstructorOverLoading(double a,double b)
	{
		System.out.println(a+b);
		
	}
	

	public static void main(String[] args) {
		ConstructorOverLoading co=new ConstructorOverLoading(10.5,20.5);
	}

}
