package graphics;

public class Circle {
	double r;
	double pi=3.14,z;

	public Circle(double radius){
		r=radius;
	}
	
	public void Area() {
		z=(pi*r*r);
		System.out.println("Area of circle is :"+(z));
		
}

}
