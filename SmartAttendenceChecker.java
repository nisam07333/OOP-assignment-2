import java.util.Scanner;
public class SmartAttendenceChecker {
   public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter total classes: ");
       int total = sc.nextInt ();
       System.out.print("Enter attended classes");
       int attended = sc. nextInt ();
       double attendence = (attended * 100.0) / total;
       if (attendence >= 75) {
           System.out.println("Eligible for Exam");
       }
       else {
           System.out.println("Not Eligible");
       }
       sc.close ();
       }
   }
