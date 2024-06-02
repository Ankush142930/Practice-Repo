import java.util.Scanner;;

public class EvenOrOdd{
    public static void main(String[] args){
        Scanner ank = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ank.nextInt();
        evenOrOdd(n);
    }

    public static void evenOrOdd(int n){
        if(n <= 0) System.out.println("!!!Enter a natural number!!!");;
        
        if(n%2 == 0){
            System.out.println("It is an even number.");
        } else{
            System.out.println("It is an odd number.");
        }
        
    }
}