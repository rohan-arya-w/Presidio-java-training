package Day4a2;

public class Ex2 {
	double real,imaginary;
	Ex2(double r,double i){
		this.real =r;
		this.imaginary=i;
	}
	
	public static Ex2 sum(Ex2 c1,Ex2 c2) {
	Ex2 temp = new Ex2(0,0);
	temp.real = c1.real + c2.real;
    temp.imaginary = c1.imaginary + c2.imaginary;
    return temp;
	}
	
	public static void main(String[] args) {
		Ex2 c1 = new Ex2(5.5,4);
		Ex2 c2 = new Ex2(4.3,6.5);
		Ex2 temp = sum(c1,c2);
		System.out.println(temp.real+""+" "+temp.imaginary+"i");
	}
}
