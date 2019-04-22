import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      	 int n=in.nextInt();
      	 int j=2;
      	 for(int num=1;num<=n;num++)
         {
           if(num%j==1)
             System.out.println(num);
             
         }
	}
}