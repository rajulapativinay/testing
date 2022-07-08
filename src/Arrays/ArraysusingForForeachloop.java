package Arrays;

public class ArraysusingForForeachloop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("enter the array size");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Arrays values using for each");
		for(int x:a)

	{
			System.out.println(x);
			}
	}

}
