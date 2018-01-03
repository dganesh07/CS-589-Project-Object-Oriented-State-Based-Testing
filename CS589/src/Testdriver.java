import java.util.Scanner;

public class Testdriver {
    
    public static void main(String[] args) {
        
        int userOption=0;
        int returnvalue=-1;
        
        account  obj = new account();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Driver for the account class");
        
        //If the user presses 10 driver will close!
        while(userOption!=10){
		 
                 System.out.println("------------------------------------");
		 System.out.println("Please choose from below options:");
		 System.out.println("1. open");
		 System.out.println("2. login");
		 System.out.println("3. logout");
		 System.out.println("4. pin");
		 System.out.println("5. deposit;");
		 System.out.println("6. withdraw");
		 System.out.println("7. balance");
		 System.out.println("8. lock");
		 System.out.println("9. unlock");
		 System.out.println("------------------------------------");
		 System.out.println("10. Quit");
                 
         System.out.println("------------------------------------");
                 
		 System.out.println("Testing Oriented Methods:");
		 System.out.println("11. show_state()");
		 System.out.println("12. show_all_values()");

//print all parameters !!!!!!!!!!!!!!!
           
         System.out.println("------------------------------------");
         System.out.println("");
		 System.out.println("Enter number: ");
		 
		 userOption=in.nextInt();
		 
                 //This switch is used to display the user selected method on the screen
		 switch(userOption){
		 case 1:
			 int x,y,z;
			 System.out.println("open(int x,int y,int z)");
			 System.out.println("Enter initial balance:");
			 x=in.nextInt();
			 System.out.println("Enter pin number:");
			 y=in.nextInt();
			 System.out.println("Enter account #:");
			 z=in.nextInt();
			 returnvalue=obj.open(x,y,z);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 2:
			 int x1;
			 System.out.println("login(int x)");
			 System.out.println("Enter account number:");
			 x1=in.nextInt();
			 returnvalue=obj.login(x1);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 3:
			 System.out.println("logout()");
			 returnvalue=obj.logout();
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 4:
			 int x2;
			 System.out.println("pin(int x)");
			 System.out.println("Enter pin number:");
			 x2=in.nextInt();
			 returnvalue=obj.pin(x2);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 5:
			 int d;
			 System.out.println("deposit(int d");
			 System.out.println("Enter amount to deposit:");
			 d=in.nextInt();
			 returnvalue=obj.deposit(d);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 6:
			 int w;
			 System.out.println("withdraw(int w)");
			 System.out.println("Enter amount you wanna withdraw:");
			 w=in.nextInt();
			 returnvalue=obj.withdraw(w);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 7:
			 System.out.println("balance()");
			 returnvalue=obj.balance();
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 8:
			 int x3;
			 System.out.println("lock(int x)");
			 System.out.println("Enter account # you wanna lock:");
			 x3=in.nextInt();
			 returnvalue=obj.lock(x3);
			 System.out.println("The return value="+returnvalue);
			 break;
		 case 9:
			 int x4;
			 System.out.println("unlock(int x)");
			 System.out.println("Enter account #:");
			 x4=in.nextInt();
			 returnvalue=obj.unlock(x4);
			 System.out.println("The return value="+returnvalue);
			 break;
		 
		 case 11:
                         System.out.println("show_state()");
			 obj.show_state();
			 break;
		 case 12:
                         System.out.println("show_all_values()");
			 obj.show_all_values();
			 break;
		 
		 default:
			 if(userOption!=10)
                         {
                            System.out.println("Please choose only from the given options!!");
                            System.out.println("Enter 10 to quit");
			 }
                         
                         break;
		 }
		 System.out.println("");
						 
	 }
	 
	 System.out.println("Test Driver is Stopped");
	 System.exit(0);
	 in.close();
    }
    
}
