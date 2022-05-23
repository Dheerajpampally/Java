import java.util.*;

public class Area1 {
	
	void area(int a) {
		System.out.println("Area of Square is:"+(a*a));
	}
	void area(int l,int b) {
		System.out.println("Area of Rectangle:"+(l*b));
	}
	void area(double r) {
		double z=3.14*r*r;
		System.out.println("Area of Circle:"+z);
	}

	public static void main(String[] args) {
		int ch;
		boolean t=true;
		Scanner sc=new Scanner(System.in);
		
		Area a=new Area();
		System.out.println("1.Area of Square");
		System.out.println("1.Area of Rectangle");
		System.out.println("1.Area of Circle");
		
		while(t)
		{
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch (ch) {
			case 1 : System.out.println("Enter the size of square:");
				     int a1=sc.nextInt();
				     a.area(a1);
				     break;
			case 2 : System.out.println("Enter the length and breadth of Reactangle:");
					 int L=sc.nextInt();
					 int B=sc.nextInt();
					 a.area(L,B);
					 break;
			case 3 : System.out.println("Enter the radius of circle:");
				     double a3=sc.nextDouble();
				     a.area(a3);
				     break;
			case 4 : t=false;
					 break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
