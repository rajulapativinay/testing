package Arrays;

public class StringExamples {

	public static void main(String[] args) {
		String s1="vinay";
		String s2="hello";
		System.out.println(s1.concat(s2));
		//StringBuilder s=new StringBuilder("hellovinay");
		StringBuffer s=new StringBuffer("vinayhello");
		s.reverse();
		System.out.println(s);
		
	}

}
