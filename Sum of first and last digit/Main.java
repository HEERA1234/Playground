import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      	int number=in.nextInt();
      	int first_digit = number;
      	int last_digit;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = number %10;
      System.out.println(first_digit+last_digit);
      	
	}
}