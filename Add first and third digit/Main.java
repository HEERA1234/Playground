import java.util.Scanner;
class Main{
	public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int s=n1/100;
      int t=n1%10;
      int u=s+t;
      System.out.println(u);
	}
}