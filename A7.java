package exam;

import java.util.Scanner;

class A7{
public static void binarySearch(int array[], int element, int low, int high) {
	int mid = (low +high) / 2;
	while (low <= high) {
       if (array[mid] < element)
       low = mid + 1;
      else if (array[mid] == element) {
	   System.out.println("element found at index "+mid);
	   break;
   }
    else
     high = mid - 1;
   mid=(low+high)/2;
 }
}

public static void main(String args[]) {
int[] array = { 3, 4, 5, 6, 7, 8, 9 };
int n = array.length;
Scanner input = new Scanner(System.in);
System.out.println("Enter element to be searched:");
 int element = input.nextInt();
 binarySearch(array, element, 0, n - 1);
 
}
}
