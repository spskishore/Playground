import java.util.Scanner;
class Main{
	   public static void main (String[] args)
    {
	 // Type your code here   
      int num,sum=0;
      Scanner in = new Scanner(System.in);
      num=in.nextInt();
      sum=calsum(num);
      System.out.println(sum);
	} 
  public static int calsum(int n)
  {
     if(n==0)
		{
			return n;
		}
		else
		{
			return (n * (n+1)/2);
		}
  }
	
}