import java.util.Scanner;
public class ComplexNumber{
	double real;
	double img;
	public ComplexNumber(double r, double i) {
		this.real=r;
		this.img=i;
	}
	ComplexNumber(){}
		ComplexNumber Sum(ComplexNumber c1, ComplexNumber c2){
			ComplexNumber temp=new ComplexNumber();
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;
		}
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the first real and img");
			double real=s.nextDouble();
			double img=s.nextDouble();
			ComplexNumber c1=new ComplexNumber(real, img);
			System.out.println("Enter the second real and img");
			double rr=s.nextDouble();
			double ii=s.nextDouble();
			ComplexNumber c2=new ComplexNumber(rr, ii);
			ComplexNumber temp1=new ComplexNumber();
			temp1=temp1.Sum(c1,c2);
			System.out.println("Sum is :"+temp1.real+"+i"+temp1.img);
		}
}
