import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int r, n, rev = 0, fd, ld, s;

        Scanner sc = new Scanner(System.in);
       
        n = sc.nextInt();

        ld = n % 10;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        fd = rev % 10;
        s = fd + ld;

        System.out.println(s);
	}
}