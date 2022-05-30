package exception;
import java.util.*;


class AbE extends Exception{
	public AbE(String q) {
		System.out.println(q);
	}
}
public class Sign {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int sum=0;
		int p=0;
		
	while(n>0) {
		
		try {
			System.out.println("Enter the number:");
			int num=sc.nextInt();
		if(n<0) 
			throw new AbE("Number is negative");
		
		else
			a[p]=num;
			sum=sum+num;
			p++;
			n--;
		}
		
		catch(AbE u) {
			System.out.println(u);
		}
		
	}
	System.out.println("Average is " +sum/p);
	}

}
