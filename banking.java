import java.util.Scanner;

public class bankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount obj = new bankAccount("Siddharth","123456789");
		obj.showMenu();

	}

}

class bankAccount{
	
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	bankAccount(String cname,String cid) {
		
		customerName = cname;
		customerId = cid;
		balance = 0;
		
	}
	
	void deposit(int amount) {
		
		if(amount != 0) {
			
			balance += amount;
			
		}
		
	} void withdraw(int amount) {
		
		if(amount != 0) {
			
			balance -= amount;
			
		}
		
	}  void showMenu() {
		
		int command = 0;
		int amount;
		Scanner sct = new Scanner(System.in); 
		System.out.println("Welcome "+customerName);
		System.out.println("Your customer Id is "+customerId);
		
		while(true) {
			
			System.out.println("Enter Command.\n1)Check Balance.\n2)Deposit.\n3)Withdraw.");
			System.out.println("4)Exit");
			command = sct.nextInt();
			if(command == 4) {
				
				break;
				
			}
			switch(command) {
			
			case 1 : System.out.println("--------------------------------------------");
					 System.out.println("Balance : "+balance);
					 System.out.println("--------------------------------------------");
					 break;
					 
			case 2 : System.out.println("--------------------------------------------");	
					 System.out.print("Enter amount : ");
					 amount = sct.nextInt();
					 deposit(amount);
					 System.out.println("--------------------------------------------");
					 break;
					 
			case 3 : System.out.println("--------------------------------------------");	
					 System.out.print("Enter amount : ");
					 amount = sct.nextInt();
					 withdraw(amount);
					 System.out.println("--------------------------------------------");
					 break;
			
			default :  System.out.println("Invalid command. Try again.\n");
						
			
			
			}
			
		}System.out.println("*****************");
		System.out.println("Thank You for using our services.");
		System.out.println("*****************");
		
		
	}
	
	
}
