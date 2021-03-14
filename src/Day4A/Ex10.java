package Day4A;
import java.util.*;


public class Ex10 {
	
	
	
	public static void main(String args[]) {
		int i,j;
		System.out.println("Enter number of rows and columns:");
		Scanner s= new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][]=new int[row][column];
		System.out.println("Matrix elements");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++) {
				array[i][j]=s.nextInt();
				
			}
		}
		System.out.println("matrix");
		for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
		}
}
