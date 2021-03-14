package Day4A;

public class Ex19 {
	public static void main(String[] args) {
//		input  
		int arr[][] = { { 1, 2, 3 }, 
                  { 4, 5, 6 }, 
                  { 7, 8, 9 } }; 
		Reverse(arr);
	}
	
	static int M =3;
	static int N =3;
	//method 
	public static void Reverse(int arr[][]) {
		
		
		for(int i=0; i<M;i++) {
			int begin = 0;
			int end = 2;
			
			while(begin<end){
				int temp = arr[i][begin];
				arr[i][begin]=arr[i][end];
				arr[i][end]=temp;
				begin++;
				end--;
		
				
			}
		}
		for(int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
