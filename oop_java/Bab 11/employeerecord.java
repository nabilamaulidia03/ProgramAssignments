import java.text.NumberFormat;
import java.util.Locale;

public class employeerecord {
    private String empId;
    private String empName;
    private int gol;
    private String position;
    private double salary;

    // Constructor dengan parameter
    public employeerecord(String empId, String empName, int gol) {
        this.empId = empId;
        this.empName = empName;
        this.gol = gol;
        determinePositionAndSalary(gol);
    }

    // Method untuk menentukan posisi dan gaji berdasarkan golongan
    private void determinePositionAndSalary(int gol) {
        switch (gol) {
            case 1:
                position = "Assisten Staff";
                salary = 3000000;
                break;
            case 2:
                position = "Staff";
                salary = 3500000;
                break;
            case 3:
                position = "Supervisor";
                salary = 4000000;
                break;
            case 4:
                position = "Assisten Manager";
                salary = 5000000;
                break;
            case 5:
                position = "Manager";
                salary = 6000000;
                break;
            default:
                position = "Unknown";
                salary = 0;
                break;
        }
    }

    // Method untuk menampilkan informasi karyawan
    public void showDetails() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        System.out.println("ID Karyawan  : " + empId);
        System.out.println("Nama Karyawan: " + empName);
        System.out.println("Golongan     : " + gol);
        System.out.println("Posisi       : " + position);
        System.out.println("Gaji Pokok   : " + currencyFormat.format(salary));
    }

    // Metode main di kelas EmployeeRecord
    public static void main(String[] args) {
        // Membuat objek EmployeeRecord dengan golongan 2
        System.out.println("\nInformasi Karyawan:");
        employeerecord employee1 = new employeerecord("0001", "Agus Suharto", 2);
        employee1.showDetails();

        // Membuat objek EmployeeRecord dengan golongan 3
        System.out.println("\nInformasi Karyawan:");
        employeerecord employee2 = new employeerecord("0001", "Agus Suharto", 3);
        employee2.showDetails();
    }
}