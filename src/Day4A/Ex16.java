package Day4A;

public class Ex16 {
	//main
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		Search(arr,3);
	}
	
	public static void Search(int arr[],int x) {
		int posi=0;
		int rep=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				posi = i;
				rep +=1;
			}
		}
		if(posi>=0) {
			System.out.println(" position: "+x+" repetion: "+rep);
		}
		else {
			System.out.println("not here");
		}
	}
}
