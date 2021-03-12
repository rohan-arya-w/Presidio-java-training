package Day4A;

public class Ex4 {
	
	static boolean CheckPrime(int i) {
		if (i<=1) 
			return false;
		else if (i==2)
			return true;
		else if (i%2==0)
			return false;
		for (int k = 3; k <= Math.sqrt(i); k += 2) 
        {
            if (i % k == 0)
                return false;
        }
		return true;
	}
	
	
	public static void main(String[] args) {
			if(CheckPrime(21))
				System.out.println("true");
			else
				System.out.println("false");
	}
}
