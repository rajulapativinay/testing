package Arrays;

public class SumofArrays {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("enter the array size");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of arrays:"+sum);

	}

}
