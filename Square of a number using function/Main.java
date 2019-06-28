import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      int num,sq;
      Scanner in = new Scanner(System.in);
      num=in.nextInt();
      sq=calsq(num);
      System.out.println(sq);
	} 
  public static int calsq(int n)
  {
    return n*n;
  }
}