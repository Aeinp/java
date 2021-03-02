package exam;

import java.util.*;



public class A11 {
	 public static void main(String[] args) {
		 int n,sum=0;
		 Scanner r=new Scanner(System.in);
		 System.out.println("enter the number");
		 n=r.nextInt();
		 while(n>0 || sum>9)
		 {
			 if(n==0) {
				 n=sum;
				 sum=0;
			 }
			 sum+=n%10;
			 n/=10;
		 }
		 System.out.println("sum is :"+sum);
	 }
		 
}