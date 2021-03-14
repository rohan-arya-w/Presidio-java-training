package Day4a2;

public class Ex5 {
	static int ObjectsCount = 0;
	{
		ObjectsCount+=1;
		
	}
	public Ex5() {
		
	}
	public Ex5(int n) {
		
	}
	public Ex5(String s) {
		
	}
	
	public static void main(String[] args) {
		Ex5 a = new Ex5();
		Ex5 b = new Ex5(5);
		Ex5 c = new Ex5("Hello");
		System.out.println(Ex5.ObjectsCount);
		
	}
}
