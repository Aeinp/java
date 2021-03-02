package exam;

import java.util.*;
public class A6 {

	public static void main(String[] args) {
		String [] s = new String[10];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 5 strings");
         for(int i=0;i<5;i++)
        	 s[i]=obj.nextLine();
         for(int i=0;i<5;i++)
        	 for(int j=i+1;j<5;j++)
        	 {
        		 if(s[i].compareTo(s[j])>0)
        		 {
        			 String temp;
        			 temp =s[i];
        			 s[i]=s[j];
        			 s[j]=temp;
        		 }
        	 }
         System.out.println("strings :  ");
         for(int i=0;i<5;i++)
        	 System.out.print(s[i]+",");
	}

}

