package Arrays;

public class basicArrayPrograms {

	public static void main(String[] args) {
		int array[]=new int[5];// int[5] means that array size, the array length should be length-1
		
		array[0]=5;
		array[1]=10;
		array[2]=15;
		array[3]=20;
		array[4]=25;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		/*System.out.println(array[5]);//we can give more than the array size the error will come i.e,array index outof bound exception
		System.out.println(array[6]);*/
	}
	}
// with giving any array values it will be taken as output is '0' why because the default value of integer is '0'
