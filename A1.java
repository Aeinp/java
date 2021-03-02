package exam;
import java.util.*;

public class A1 {
	
	 	static void sum(int [][] x , int [][] y)
	 	{
	 	 int[][] res = new int[10][10];
	 		for(int i=0;i<3;i++)
	 			for(int j=0;j<3;j++)
	 		{
	 			res[i][j]=x[i][j]+y[i][j];
	 		}
	 		System.out.println("result :");
	 		for(int i=0;i<3;i++)
	 		{
	 			for(int j=0;j<3;j++)
	 		{
	 			System.out.print(+res[i][j]+" ");
	 		}
	 			System.out.println();
	 		}
	 	}
	 	public static void main(String[] args) {
	 		int[][] a = new int[10][10];
	 		int[][] b = new int[10][10];
	 		Scanner obj = new Scanner(System.in);
	 		System.out.println("Enter the 1st matrix :");
	 		for(int i=0;i<3;i++)
	 			for(int j=0;j<3;j++)
	 		{
	 			a[i][j] = obj.nextInt();
	 		}
	 		System.out.println("Enter the 2nd matrix :");
	 		for(int i=0;i<3;i++)
	 			for(int j=0;j<3;j++)
	 		{
	 			b[i][j] = obj.nextInt();
	 		}
	 		sum(a,b);
	 	}

	 }






