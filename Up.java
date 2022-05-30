package exception;
import java.util.*;

class UserName extends Exception{
	
	public UserName(String msg) {
		System.out.println(msg);
	}
}

class Password extends Exception{
	
	public Password(String msg) {
		
		System.out.println(msg);
	}
}

public class Up {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");
		String user=sc.nextLine();
		
		System.out.println("Enter password");
		String pass=sc.nextLine();
		int len=user.length();
		
		
		
		try {
			
			if(len<8)
			
				throw new UserName("Username must be greater than 8 characters");
				
				else if(!pass.equals("admin")) 
		
				throw new Password("Password is inncorrect");
			
				else
					System.out.println("Loginned Successfully");
				
			
		}
		catch(UserName e) {
			System.out.println(e);
		}
		
		catch(Password e) {
			System.out.println(e);
		}

	}

}
