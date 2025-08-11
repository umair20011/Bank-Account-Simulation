import java.util.*;

public class User {
    int userId;
    String userName;
    int balance;
    ArrayList<Integer> history=new ArrayList<>();
    
    User(){
    	
    }
    User(int userId, String userName, int balance, ArrayList<Integer> history){
    	history.add(0);
    	this.userId=userId;
    	this.userName=userName;
    	this.balance=balance;
    	this.history=history;
    }
    
}
