package Day4a2;

public class Ex1 {
	public static void main(String[] args) {
		int x =2;
		int arr[]= {10,10};
		change(x,arr);
		System.out.println(x);//output will be 2 because pass by value creates copy and do the manipulation -example of pbv
		System.out.println(arr[0]);// output 34 does not changes example of pbr
		Ex1 g = new Ex1();
		System.out.println(g.MethodA(false));//output is true because it is pbr
	}
	
	public static void change(int x,int arr[]) {
		x=12;
		arr[0]=34;
		
	}
	
	public  boolean MethodA(boolean x) {
		return true;
	}
}
