import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
   
        int hcf = hcf(n1, n2);

        System.out.printf("%d",hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}