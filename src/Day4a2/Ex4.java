package Day4a2;
import java.util.*;
public class Ex4 {
	public static void main(String[] args) {
		Stack<String> Cars = new Stack<>();
		Cars.push("Ford");
		Cars.push("BMW");
		Cars.push("Honda");
		System.out.println("Stack " + Cars);
		
		Cars.pop();
		System.out.println("after Pop "+Cars);
	}
}
