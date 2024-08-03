import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        char grade;
        String keterangan;
        
        if (nilai >= 85) {
            grade = 'A';
            keterangan = "Lulus";
        } else if (nilai >= 75) {
            grade = 'B';
            keterangan = "Lulus";
        } else if (nilai >= 65) {
            grade = 'C';
            keterangan = "Lulus";
        } else if (nilai >= 50) {
            grade = 'D';
            keterangan = "Lulus";
        } else {
            grade = 'E';
            keterangan = "Tidak Lulus";
        }
        
        System.out.println("Output :");
        System.out.println("grade " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}