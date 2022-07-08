package Methods;

public class MainMethodOverLoading {

	public static  void main(int a) {
		System.out.println(a);
		
	}
	public  static  void main(int a,int b) {
		System.out.println(a+b);
		
	}
	public  static void main(int a,float b) {
		System.out.println(a+b);
		
	}
	public static void main(float a,float b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
	
	MainMethodOverLoading mo=new MainMethodOverLoading();
	mo.main(100);
	mo.main(100,200);
	mo.main(100,2.5f);
	mo.main(10.5f,20.5f);
}
}
