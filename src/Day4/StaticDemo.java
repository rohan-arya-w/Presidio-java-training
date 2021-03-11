package Day4;

public class StaticDemo {
	 int i;
	public static  void main(String[] args) {
		System.out.println("main method executed...");
		main(new int[] {1,2,3});
		StaticDemo obj=new StaticDemo();
		obj.main(new char[] {'c','d'});
		A.met();
		A.met2();
		
	}
	
	public static void main(int a[]) {
		//super.clone();//static cannot use super & this keyword 
		//this.i=10;
	}
	
	public void main(char c[]) {
		super.toString();
		this.i=0;
		main(new int[] {1,2,3});
		
	}
}

class A {
	static {
		System.out.println("static block called...");
	}
	public A() {
		System.out.println("cons called a");
	}
	static int i;
	public static void met() {
		System.out.println("met method called....");
	}
	
	public static void met2() {
		System.out.println("met2 method called....");
	}
}
