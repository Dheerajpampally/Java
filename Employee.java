
import java.util.*;
class Employee{
	int eno;
	String ename;
	double esalary;
	
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the eno of Employee:");
	    eno=sc.nextInt();
		System.out.println("Enter the employee name:");
		ename=sc.next();
		System.out.println("Enter the employee salary:");
	    esalary=sc.nextDouble();
	}
	void display() {
		System.out.println("Employee number is:"+eno);
		System.out.println("Employee name :"+ename);
		System.out.println("Empployee salary:"+esalary);
		System.out.println();
		
	}
}
public class EmployeeInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of employees:");
		int s=sc.nextInt();
		Employee e[]=new Employee[s];
		for(int i=0;i<s;i++) {
			e[i]=new Employee();
			e[i].input();
		}
		for(int i=0;i<s;i++) {
			e[i].display();
		}
		System.out.println("enter the employee no to search:");
		int empno=sc.nextInt();
		System.out.println();
		for(int i=0;i<s;i++) {
			if(e[i].eno==empno)
			{
				e[i].display();
				return;
			}
		}
		System.out.println("Employee doesnot exist");
		

	}

}