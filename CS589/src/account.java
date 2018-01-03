public class account
{
	//total no of attempts 
	private int x0;
	//balance
	private int x1;
	//is locked
	private int x2;
	private int x3;
	//states
	private int x4;
	//stores balance
	private int x5;
	//change for less than 500
	private int x6;
	//max balance of an account
	private int x7;
	//lock #
	private int x8;
	//no of attempts
	private int x9;
	
public final int show_balance()
{
	return x1;
} //testing oriented method

public account()
{
	x2 = 0;
	x4 = -1;
	x6 = 20;
	x7 = 500;
	x9 = 0;
	x0 = 3;
}
public final int open(int x, int y, int z)
{
	if ((x > 0) && (x4 == -1) && (y > 0) && (z > 0))
	{
		x1 = x;
		x3 = y;
		x5 = z;
		x4 = 0;
		return 0;
	};
	return -1;
}
public final int pin(int x)
{
	if (x4 != 1)
	{
		return -1;
	}
	if (x == x3)
	{
		x4 = 2;
		return 0;
	}
	else
	{
		x9++;
	}
	if (x9 >= x0)
	{
		x4 = 0;
	}
	return -1;
}
public final int logout()
{
	if ((x4 == 0) || (x2 == 1))
	{
		return -1;
	}
	x4 = 0;
	return 0;
}
public final int login(int x)
{
	if (x4 != 0)
	{
		return -1;
	}
	if (x5 == x)
	{
		x4 = 1;
		x9 = 0;
		return 0;
	}
	return -1;
}
public final int balance()
{
	if (x4 != 2)
	{
		return -1;
	}
	return x1;
}
public final int lock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x == x3)
	{
		return -1;
	}
	if (x2 == 0)
	{
		x2 = 1;
		x8 = x;
		return 0;
	}
	else
	{
		return -1;
	}
}
public final int unlock(int x)
{
	if (x4 != 2)
	{
		return -1;
	}
	if ((x2 == 1) && (x == x8))
	{
		x2 = 0;
	return 0;
	}
	else
	{
		return -1;
	}
}
public final int deposit(int d)
{
	if (x4 != 2)
	{
		return -1;
	}
	if (x2 == 1)
	{
		return -1;
	};
	if ((x1 + d < x7) && (d>0))
	{
		x1 = x1 + d - x6;
		return 0;
	}
	else
	{
		if (d > 0)
		{
		x1 = x1 + d;
		return 0;
		}
	}
 return -1;
}
public final int withdraw(int w)
{
if (x4 != 2)
{
	return -1;
}
if (x2 == 1)
{
	return -1;
};
if ((x1 > w) && (w > 0))
{
	if (x1 < x7)
	{
		return -1;
	}
	else
	{
		x1 = x1 - w;
	};
	if (x1 < x7)
	{
		x1 = x1 - x6;
	}
  return 0;
}
return -1;
}
//Testing oriented methods...

//Shows the state of the account Class
public void show_state()
{
    System.out.println("");
    if(x4 == -1) {
    	System.out.println("start state");
    }else if(x4==0){
            System.out.println("idle state");
    }else if(x4==1){
            System.out.println("Check pin state");
    }else if((x4==2) && (x2==0) && (x1>500)){
            System.out.println("ready state");
    }else if((x4==2)&&(x2==1)){
            System.out.println("locked state");
    }else if(x1<500){
            System.out.println("overdrawn state");
    }
    System.out.println("");
}

//Shows all the private variable values of the class account
public void show_all_values(){
    
    System.out.println("x0="+x0);
    System.out.println("x1="+x1);
    System.out.println("x2="+x2);
    System.out.println("x3="+x3);
    System.out.println("x4="+x4);
    System.out.println("x5="+x5);
    System.out.println("x6="+x6);
    System.out.println("x7="+x7);
    System.out.println("x8="+x8);
    System.out.println("x9="+x9);
    System.out.println("");
    if(x4==-1) {
    	System.out.println("start state");
    }else if(x4==0){
            System.out.println("idle state");
    }else if(x4==1){
            System.out.println("Check pin state");
    }else if((x4==2) && (x2==0) && (x1>=500)){
            System.out.println("ready state");
    }else if((x4==2)&&(x2==1)){
            System.out.println("locked state");
    }else if(x1<500){
            System.out.println("overdrawn state");
    }
    System.out.println("");
}
}