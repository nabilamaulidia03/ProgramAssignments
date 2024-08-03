import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print ("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        char grade;
        if (nilai >= 85) {
            grade = 'A';
        } else if (nilai >= 75) {
            grade = 'B';
        } else if (nilai >= 65) {
            grade = 'C';
        } else if (nilai >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        System.out.println("Output :");
        System.out.println("grade " + grade);
    }
}