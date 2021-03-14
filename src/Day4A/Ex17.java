package Day4A;

public class Ex17 {
	public static void main(String[] args) {
		//calling non static method 
		Ex17 c = new Ex17();
		c.MethodA(20);
	}
	
	public void MethodA(int x) {
		int a = x*x;
		System.out.println(a);
	}
	
	//17c 
	
}

class NewClass{
		NewClass(int b){
			System.out.println(b);
		}
}