import java.util.*;
interface Abc{
	void Area();
	void paremeter();
}
class C implements Abc{
	double r;
	double pi=3.14,z;
	
	C(double radius){
		r=radius;
	}
	
	public void Area() {
		z=(pi*r*r);
		System.out.println("Area of circle is :"+(z));
		
}
	public void paremeter() {
		z=(2*pi*r);
		System.out.println("Paremeter of circle is: "+(z));
}
	

}
class R implements Abc{
	int l,b;
	double z;
	R(int length, int breadth){
		l=length;
		b=breadth;
	}
	public void Area() {  
		z=(l*b);
		
		System.out.println("Area of Reactangle is:"+(z));

}

	public void paremeter(){
		z=2*(l+b);
		System.out.println("Paremeter of Rectangle:"+(z));
}
}
public class Sh {
	public static void main(String args[]) {
		
		System.out.println("1.To find Area and Perimeter of Circle");
		System.out.println("2.To find Area and Perimeter of Rectangle");
		
	int ch;
	boolean t=true;
	Scanner sc=new Scanner(System.in);
	while(t) {
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch) {
		
		case 1 : System.out.println("Enter the  radius:");
				 double r=sc.nextDouble();
				 Abc obj1=new C(r);
				 obj1.Area();
				 obj1.paremeter();
				 break;
				 
		case 2 : System.out.println("Enter the length and breadth");
				 int l=sc.nextInt();
				 int b=sc.nextInt();
				 Abc obj2=new R(l,b);
				 obj2.Area();
				 obj2.paremeter();  
				 break;
				 
		case 3 : t=false;
				 break;
			
		}
	}
}
}