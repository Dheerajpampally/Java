import java.util.*;
class Ary{
		public static void main(String args[])
		{
			int a[]=new int[10];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				int n=sc.nextInt();
				a[i]=n;
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	}