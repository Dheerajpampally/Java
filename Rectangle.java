package graphics;

public class Rectangle {
	int l,b;
	double z;
	
	public Rectangle(int length, int breadth){
		l=length;
		b=breadth;
	}
	public void Area() {  
		z=(l*b);
		
		System.out.println("Area of Reactangle is:"+(z));

}

}
