package DataTypes;

import java.util.Scanner;

public class ScannerClassUsingDataTypes {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter name");
		String name=Scan.next();
		System.out.println("enter emailid");
		String emailid=Scan.next();
		System.out.println("ENTER AGE");
		int age=Scan.nextInt();
		System.out.println("enter marks");
		int marks=Scan.nextInt();
		System.out.println("enter grade");
		char grade=Scan.next().charAt(0);
		System.out.println("enter percentage");
		float per=Scan.nextFloat();
		System.out.println("higher studies");
		boolean hs=Scan.nextBoolean();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("marks:"+marks);
		System.out.println("grade:+grade");
		System.out.println("percentage:"+per);
		System.out.println("higher studies:"+hs);
		}
}
