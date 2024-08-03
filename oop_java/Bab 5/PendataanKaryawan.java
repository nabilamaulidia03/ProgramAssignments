import java.util.Scanner;

public class PendataanKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menggunakan data contoh langsung
        String nama = "iyan";
        String alamat = "Ampenan";
        int usia = 20;
        double gaji = 10000000;
        
        // Menampilkan data yang telah diisi
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.printf("Gaji: Rp %.0f\n", gaji);

        System.out.println("\nBUILD SUCCESSFUL (total time: 40 seconds)");

        scanner.close();
    }
}