package exam;

import java.util.*;

public class Aten {
	public static void main(String[] args) {
		int r,k=0,cnt=0,cnt1=0;
		Scanner rd=new Scanner(System.in);
		System.out.print("enter value");
		r=rd.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print("  ");
				cnt++;
			}
			while(k!=2*i-1) {
				if(cnt<=r-1) {
					System.out.print((i+k)+" ");
					cnt++;
				}
				else {
					cnt1++;
					System.out.print((i+k-2*cnt1)+" ");
					}
			
			k++;
		}
		cnt1=cnt=k=0;
		System.out.println(" ");
	}

}
}
