import java.util.Scanner;

public class primeOrNot{
    public static void main(String[] args){
        Scanner ank = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ank.nextInt();
        prime(n);
    }
    
    public static void prime(int n){
        if(n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }
        boolean ans = false;
        if(n == 1 ){
            System.out.println("It is neither prime nor composite.");
        } else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i == 0){
                    ans = true;
                    break;
                }
            }
            if(!ans) System.out.println(n + " is a prime number.");
            else System.out.println(n + " is a composite number.");
        }
    }
}