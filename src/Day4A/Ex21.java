package Day4A;

public class Ex21 {
	public static void main(String[] args) {
		int year = 1600;
		//Calling method 
		//CheckLeapYear(year);
		Day(3,year);
	}
	
	public static void Day(int n, int year) {
		switch(n) {
		case 1:System.out.println("31");break;
		case 2:
			if(CheckLeapYear(year)) {
				System.out.println("29");
			}
			else {
				System.out.println("28");
			}
			break;
		case 3:System.out.println("31");break;
		case 4: System.out.println(30);break;
		case 5: System.out.println(31);break;
		case 6: System.out.println(30);break;
		case 7: System.out.println(31);break;
		case 8: System.out.println(31);break;
		case 9: System.out.println(30);break;
		case 10: System.out.println(31);break;
		case 11: System.out.println(30);break;
		case 12: System.out.println(31);break;
		}
	}
	
	public static boolean CheckLeapYear(int year) {
		if(year%4==0 && year%100==0 && year%400==0) {
			//System.out.println("leap");
			return true;
			
		}
		else {
			//System.out.println("not leap");
			return false;
			
		}
	}
}
