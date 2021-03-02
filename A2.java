package exam;
import java.util.*;
class evennode{
	void func() {
		int m,n,i,j;
		System.out.println("Enter the no of rows and columns");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		int [][] a = new int[m][n];
		int [][] b = new int[m][n];
		System.out.println("Enter elements");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				b[j][i] = a[i][j];
			}
		}
		System.out.println("Transpose matrix is");
		for(i = 0; i < m; i++) {
			for(j = 0; j < n; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class transpose extends evennode{
	void func() {
		int n, e = 0, o = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		n = sc.nextInt();
		int [] a = new int[n];
		int [] even = new int[n];
		int [] odd = new int[n];
		System.out.println("Enter elements");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if(a[i] % 2 == 0) {
				even[e] = a[i];
				e++;
			}
			else {
				odd[o] = a[i];
				o++;
			}
		}
		System.out.println("Even elements are");
		for(int i = 0; i < e; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();
		System.out.println("Odd elements are");
		for(int i = 0; i < o; i++) {
			System.out.print(odd[i] + " ");
		}
	}
}
public class A2{
	public static void main(String[] args) {
		evennode a = new evennode();
		transpose b = new transpose();
		a.func();
		b.func();
	}
}