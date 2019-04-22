import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int reverse=0;
    while(n1!=0)
    {
      reverse=reverse*10;
      reverse=reverse+n1%10;
      n1=n1/10;
    }
    System.out.print(reverse);
    
    
    
  }
}