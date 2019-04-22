import java.util.Scanner;
class Main{
	public static void main (String[] args){
      	Scanner in=new Scanner(System.in);
      	int Number=in.nextInt();
      	int temp;
      	int Factorial;
      	int Temp;
	    Temp = Number;
      	int Reminder=0;
      	int Sum=0,i;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
        }
		
		if ( Number == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}