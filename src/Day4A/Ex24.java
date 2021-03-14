package Day4A;

import static java.lang.Math.*;  

public class Ex24 {
	public static void main (String[] args) {
		int a = 1, b = 2, c = 2;      
		//calling function  
		Solve(a, b, c);  
	}
	
		static void Solve(int a,int b,int c) {
	
		if(a==0) {
			System.out.println("cannot be zero");
			return;
			
		}
		int g = b*b-4*a*c;
		double roots = sqrt(abs(g));
		
		if(g<0)
		{
			System.out.println("the roots of the equation are real and same. \n");
			System.out.println((double)(-b + roots) / (2 * a) + "\n"+ (double)(-b - roots) / (2 * a));  
		}
		else if(g==0) {
			System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
		}
		else {
			System.out.println(-(double)b / (2 * a) + " + i"+ roots + "\n"+ -(double)b / (2 * a)+ " - i" + roots);  
		}
		
	}
}
