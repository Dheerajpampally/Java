import java.util.*;
class Person{
	String Name;
	String gender;
	String Address;
	int age;
	
	Person(String n,String g,String ad,int ag){
		Name=n;
		gender=g;
		Address=ad;
		age=ag;
		
	}
}
class EmployeeD extends Person{
	int empid;
	String CompanyName;
	String Qualification;
	int salary;
	EmployeeD(String n,String g,String ad,int ag,int eid,String cp,String q,int s){
		super(n,g,ad,ag);
		 empid=eid;
		 CompanyName=cp;
		 Qualification=q;
		 salary=s;
	}
}
class Teacher extends EmployeeD{
	String Subject;
	String Department;
	int teacherid;
	Teacher(String n,String g,String ad,int ag,int eid,String cp,String q,int s,String sub,String dep,int tid){
		super(n,g,ad,ag,eid,cp,q,s);
		Subject=sub;
		Department=dep;
		teacherid=tid;
		
		
	}
	void show() {
		System.out.println("Name:"+Name);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+Address);
		System.out.println("Age:"+age);
		
		System.out.println("Employeeid:"+empid);
		System.out.println("CompanyName:"+CompanyName);
		System.out.println("Qualification:"+Qualification);
		System.out.println("Salary:"+salary);
		
		System.out.println("Subject:"+Subject);
		System.out.println("Department:"+Department);
		System.out.println("Teacherid:"+teacherid);
		
	
	}
}

public class TeacherDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of teachers:");
		int t=sc.nextInt();
		Teacher a[]=new Teacher[t];
		for(int i=0;i<t;i++) {
			System.out.println("Name");
			String a1=sc.next();
			System.out.println("gender");
			String a2=sc.next();
			System.out.println("Address");
			String a3=sc.next();
			System.out.println("Age");
			int a4=sc.nextInt();
			System.out.println("Employeeid:");
			int a5=sc.nextInt();
			System.out.println("CompanyName:");
			String a6=sc.next();
			System.out.println("Qualification:");
			String a7=sc.next();
			System.out.println("Salary");
			int a8=sc.nextInt();
			System.out.println("Subject:");
			String a9=sc.next();
			System.out.println("Department:");
			String a10=sc.next();
			System.out.println("Teacherid:");
			int a11=sc.nextInt();
			
			a[i]=new Teacher(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11);
		}
		for(int i=0;i<t;i++) {
			a[i].show();
		}
	}

}