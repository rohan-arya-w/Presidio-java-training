package Day4A;

public class Ex20 {
	public static void main(String[] args) {
		 int[][] arr = new int[][] { {3, 4, 1, 8}, 
             {1, 4, 9, 11}, 
             {76, 34, 21, 1}, 
            {2, 1, 4, 5} }; 
          Max(4,arr);
	}
	
	public static void Max(int rows,int[][] arr) {
		int i=0;
		int max=0;
		int[] res = new int[rows];
		while(i<rows) {
				for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			res[i]=max;
			max=0;
			i++;
		}
		GreaterinRow(res);
	}
	
	public static void GreaterinRow(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
