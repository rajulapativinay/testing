package ConditionalStatement;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		
		  int day=2;//1,2,3,4,5,6,7,8
		  switch(day=2)
		  {
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wendsday");break;
        case 4:System.out.println("thursday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		case 7:System.out.println("sunday");break;
		default: System.out.println("invalid data");
	}

	}
}
