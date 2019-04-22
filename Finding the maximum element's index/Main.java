import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
 int max=list[0];
for(int index=0;index<n;index++)
{
  if(max<list[index])
  {
    max=list[index];


  }
}

  for(int index=0;index<n;index++)
  {
    if(max==list[index])
    {
      System.out.print(index);
    }
  }
}
}