import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
       Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int fact=1;
      for(int i=1;i<=num;i++)
      {
       fact=fact*i;
          
	}
      System.out.println(fact);
	}
}