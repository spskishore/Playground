import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int temp=1;
      for(int cur_row=1;cur_row<=n;cur_row++) {
        for(int cur_col=1;cur_col<=cur_row;cur_col++) {
        
          
        
          if(temp%2==0)
            System.out.print("#");
          else
            System.out.print("*");
          temp=temp+1;
          
        }
          System.out.println("");
          
    }
    }
}
