import java.util.Scanner;

public class employeeapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ID Karyawan
        System.out.print("Masukkan ID Karyawan: ");
        String empId = scanner.nextLine();

        // Input Nama Karyawan
        System.out.print("Masukkan Nama Karyawan: ");
        String empName = scanner.nextLine();

        // Input Level
        System.out.print("Masukkan Level (1-5): ");
        int level = scanner.nextInt();

        // Membuat objek EmployeeRecord
        employeerecord employee = new employeerecord(empId, empName, level);

        // Menampilkan informasi karyawan
        System.out.println("\nInformasi Karyawan:");
        employee.showDetails();

        scanner.close();
    }
}