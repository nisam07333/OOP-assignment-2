import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained: ");
        double marks=sc.nextDouble();
        String grade =(marks < 0 || marks >100) ? "Invalid marks":
        (marks >=90) ? "A+":
                (marks >=80) ? "A":
                (marks >=76) ? "A-":
                (marks >=72) ? "B+":
                (marks >=68) ? "B":
                (marks >=65) ? "B-":
                (marks >=60) ? "C+":
                (marks >=56) ? "C":
                (marks >=50) ? "C-":
                (marks >=40) ? "D": "F";
        System.out.println("Grade = " +grade);
        sc.close();
    }
}
