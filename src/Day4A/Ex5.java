package Day4A;
import java.util.*;
public class Ex5 {
	
	
	
	public static void main(String[] args) {
		int i;
		System.out.println("Enter length");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter numbers");
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		double avg= Average(a);
		System.out.println("Average of (");
		
		for(i=0;i<n-1;i++) 
		{
			System.out.println(a[i]+",");
		}
		System.out.println(a[i]+") ="+avg/n);
		
		
	}
	
	static double Average(int a[]){
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
