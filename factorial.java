import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner ank = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ank.nextInt();
        System.out.println(n + "! is equal to " + fact(n));
    }

    public static int fact(int n ){
        //check for negative numbers
        if(n < 0) return -1;

        //base condition
        if(n == 1) return 1;

        return n * fact(n-1);
    }
}