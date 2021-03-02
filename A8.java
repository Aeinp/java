package exam;

import java.util.*;

class circle
{
	 double radius,a;
	 circle(double r){
		 radius=r;
	 }
	 void getArea()
	 {
		 double a = 3.14*radius*radius;
		 System.out.println("Circle Area : "+a);
	 }
	 
}
class rectangle extends circle
{
	 int len,brd,a;
	 rectangle(int l,int b,double r)
	 {
		 super(r);
		 len=l;
		 brd=b;
	 }
	 void getArea()
	 {
		 super.getArea();
		 int a = len*brd;
		 System.out.println("Rectangle Area : "+a);
	 }
	 
}
public class A8 {

	public static void main(String[] args) {
		rectangle r = new rectangle(2,3,4);
        r.getArea();
	}

}
