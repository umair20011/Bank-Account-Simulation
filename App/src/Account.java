import java.util.*;

public class Account {

	User user=new User();
	
	public void deposit(int ammount, User user) {
		user.balance+=ammount;
		user.history.add(ammount);
	}
	
	public void withdraw(int ammount, User user) {
		user.balance-=ammount;
		user.history.add(-ammount);
	}
	
	public static void main(String[] args) {
		
		Account a=new Account();
		
		User u1=new User(1,"Aryan",20000,new ArrayList<>());
		User u2=new User(2,"Amaan",32000,new ArrayList<>());
		User u3=new User(3,"Sameer",23435,new ArrayList<>());
		
		System.out.println(u1.balance);
		
		a.deposit(100,u1);
		
		System.out.println(u1.balance);
		
		a.withdraw(200, u1);
		
		System.out.println(u1.balance);
		
		for(int i: u1.history) {
			System.out.print(i+" ");
		}

	}

}
