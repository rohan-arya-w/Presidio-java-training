package Day4A;
//problem-main function
public class Ex15 {
	
	//main
	public static void main(String[] args) {
		int n=100;//or can be taken from Scanner Method
		
		Ex15 a=new Ex15();
		a.getPrime(n);
	//CheckNumber(50);
		
		System.out.println(CheckArmstrong(40));
		
	}
	
	//15a prime number 
	
	public static void getPrime(int n) {
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<n;i++){
			prime[i]=true;
		}
		for(int j = 2 ;j*j<=n;j++) {
			if (prime[j]==true)
			{
				for(int i = j*j;i<=n;i +=j) {
					prime[i]=false;
				}
			}
			for (int i =2; i<=n;i++) {
				if(prime[i]==true) {
					System.out.println(i+" ");
				}
			}
		}
		
	}
	
	
	//15b To check given number is an Armstrong number or perfect number or palindrome or none of these
	public static boolean CheckArmstrong(int num) {
		int n=num;
		int rem;
		int res=0;
		while (num>0) {
			rem = num%10;
			res = res +(rem*rem*rem);
			num=num/10;
		}
		if(res==n) {
			return true;
		}
		else
			return false;
		
	}
	
	public static boolean perfect(int num) {
		int n=0;
		for (int i=1;i<num;i++) {
			if(num%i==0) {
				n += 1;
				System.out.println(i);
			}
		}
		if(n==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean pallindrome(int num) {
		int reverse = 0;
		int rem;
		int n = num;
		while(num>0) {
			rem = num%10;
			reverse = reverse*10 + rem;
			num = num/10;
		}
		if(reverse == n ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void CheckNumber(int n) {
		if(CheckArmstrong(n)==true) {
			System.out.println("Armstrong");
		}
		else if(perfect(n)==true) {
			System.out.println("perfect");
		}
		else{
			System.out.println("Pallin");
		}
	}
	
}
