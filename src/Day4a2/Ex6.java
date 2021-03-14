package Day4a2;

public class Ex6 {
	public static void main(String[] args) {
		A val=new A();
	}
}

class A{
	public A() {
		System.out.println("2");
	}
	static{
		System.out.println("1");
	}
}
// static blocks