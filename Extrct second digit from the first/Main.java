import java.util.Scanner;
class Main {
  public static void main (String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int d=n; 
    int i=1,r=0,k=0;
    
    while(n>0)
    {
      r=n%10;
      n=n/10;
      k=k+1;
     }
     n=d;
  for(i=0;i<k-1;i++)
    {
      r=n%10;
      n=n/10;
    }
    System.out.println(r);}
}
  	
  	