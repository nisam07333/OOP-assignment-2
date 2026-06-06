import java.util.Scanner;
public class LogicalCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        if ((a + b) == c)
            System.out.println("Third number is the sum of first two.");
        else
            System.out.println("Third number is not the sum.");
    }
}
