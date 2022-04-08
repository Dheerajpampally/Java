import java.util.*; 
import java.util.Scanner;
class Cpu{
	double price;
	class Processor{
		double core;
		String manufacture;
		double getCache() {
			return 3.454;
		}
		
	}
	static class Ram{
		double memory;
		double getclock() {
			return 4.5;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Cpu cpu=new Cpu();
		Cpu.Processor pro=cpu.new Processor();
		Cpu.Ram ram=new Cpu.Ram();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the price of CPU:");
		double p=s.nextDouble();
		System.out.println("Enter the no of core:");
		double f=s.nextDouble();
		System.out.println("manufacturer of processor:");
		String q=s.next();
		System.out.println("Enter the memory:");
		double k=s.nextDouble();
		
		cpu.price=p;
		pro.core=f;
		pro.manufacture=q;
		ram.memory=k;
		
		System.out.println("CPU :"+cpu.price);
		System.out.println("no of cores:"+pro.core);
		System.out.println("manufacturer of processor:"+pro.manufacture);
		System.out.println("Cache:"+pro.getCache());
		System.out.println("memory size:"+ram.memory);
		
		System.out.println("Clockspeed:"+ram.getclock());
		
		

	
	}

}
