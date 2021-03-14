package Day4A;

public class Ex27 {
	public static void main(String[] args) {
		solve(1400);
		
	}
	
	public static void solve(int p) {
		p+=(p*((double)40/(double)100));
		p-=1500;
		p+=(p*((double)40/(double)100));;
		System.out.println(p);
	}
}
