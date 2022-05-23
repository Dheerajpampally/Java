import graphics.*;
import java.util.*;
public class Shapes {

	public static void main(String[] args) {
		
		 System.out.println("1.Area of Circle:");
		 System.out.println("2.Area of Rectangle:");
		 System.out.println("3.Area of triangle:");
		 System.out.println("4.Area of Square");
		 
		 
		Scanner sc=new Scanner(System.in);
		int ch;
		boolean t=true;
		
	while(t) {
		
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1 : System.out.println("Enter the radius");
				 double a=sc.nextInt();
				 Circle obc=new Circle(a);
				 obc.Area();
				 break;
				 
		case 2 : System.out.println("Enter the length and breadth");
				 int l=sc.nextInt();
				 int b=sc.nextInt();
				 Rectangle obr=new Rectangle(l,b);
				 obr.Area();
				 break;
				 
		case 3 : System.out.println("Enter the base and height");
				 int h=sc.nextInt();
				 int ba=sc.nextInt();
				 Triangle obt=new Triangle(h,ba);
				 obt.Area();
			     break;
			     
		case 4 : System.out.println("Enter the side :");
				 int k=sc.nextInt();
				 Square obq=new Square(k);
				 obq.Area();
				 break;
				 
			
		case 5 : t=false;
					break;
		
		}
	}
	
	}
}
