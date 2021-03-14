package Day4A;

public class Ex18 {
	
	public static void NumtoWords(int num) {
		char arr[]=String.valueOf(num).toCharArray();
		String Words[]= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		for (int i=0;i<arr.length;i++) {
			System.out.print(Words[Character.getNumericValue(arr[i])]+" ");
		}
	}
	
	public static void main(String[] args) {
		NumtoWords(349);
	}
}
