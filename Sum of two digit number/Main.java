import java.util.*;
class Main {
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
      int t=n1/10;
      int u=n1%10;
      int v=t+u;
      System.out.println(v);
	}
}