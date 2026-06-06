import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = true;
        if (num <= 1 )
            prime = false;
        for ( int i =2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a prime Number");
            }
        }

